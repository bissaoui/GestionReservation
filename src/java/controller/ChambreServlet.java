/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entities.Chambre;
import services.ChambreServices;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author BISSAOUI YASSINE
 */
@MultipartConfig
public class ChambreServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String iid = request.getParameter("id");
        String nuum = request.getParameter("num");
        String typpe = request.getParameter("type");
        String tariif = request.getParameter("tarif");
        String op = request.getParameter("op");

        if (op.toString().compareTo("add") == 0) {

            int num = Integer.parseInt(request.getParameter("num"));
            String type = request.getParameter("type");
            Double tarif = Double.parseDouble(request.getParameter("tarif"));

            Part file = request.getPart("image");

            String imageFileName = file.getSubmittedFileName();  // get selected image file name

            String image = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddhhmmss")) + imageFileName;
            String uploadPath = "C:/Users/yassi/OneDrive/Documents/NetBeansProjects/Java1/web/images/" + image;  // upload path where we have to upload our actual image

            // Uploading our selected image into the images folder
            //writing html in the stream  
            try {
                FileOutputStream fos = new FileOutputStream(uploadPath);
                InputStream is = file.getInputStream();
                byte[] data = new byte[is.available()];
                is.read(data);
                fos.write(data);
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ChambreServices ch = new ChambreServices();
            Chambre c = new Chambre(num, type, tarif, image);
            if (ch.create(c)) {
                response.sendRedirect("Chambres.jsp");
            } else {
                response.sendRedirect("AddChambre.jsp");

            }
        } else if (op.toString().compareTo("sup") == 0) {
            int id = Integer.parseInt(request.getParameter("id"));
            ChambreServices ch = new ChambreServices();
            Chambre c = ch.findById(id);
            ch.delete(c);
            response.sendRedirect("Chambres.jsp");

        } else if (op.toString().compareTo("mod") == 0) {

            ChambreServices cc = new ChambreServices();

            String Old = cc.findById(Integer.parseInt(request.getParameter("id"))).getPhoto();
            String New = request.getParameter("othman");
//            PrintWriter out = response.getWriter();
//            out.println("<html><body>");
//            out.println("<h1>" + iid + tariif + typpe + nuum+"////" +  request.getParameter("othman") +"////"+ Old
//                    + "</h1>");
//            out.println("</body></html>");

            String image = Old;
            if (Old.toString().compareTo(New) != 0) {
                Part file = request.getPart("image");

                String imageFileName = file.getSubmittedFileName();  // get selected image file name

                image = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddhhmmss")) + imageFileName;
                String uploadPath = "C:/Users/yassi/OneDrive/Documents/NetBeansProjects/Java1/web/images/" + image;  // upload path where we have to upload our actual image

                // Uploading our selected image into the images folder
                //writing html in the stream  
                try {
                    FileOutputStream fos = new FileOutputStream(uploadPath);
                    InputStream is = file.getInputStream();
                    byte[] data = new byte[is.available()];
                    is.read(data);
                    fos.write(data);
                    fos.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Chambre c = new Chambre(Integer.parseInt(iid), Integer.parseInt(nuum), typpe, Double.parseDouble(tariif),image );

            if (cc.update(c)) {
                response.sendRedirect("Chambres.jsp");

            } else {
                response.sendRedirect("ModChambre.jsp");

            }
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
