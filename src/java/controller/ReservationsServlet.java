package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import services.ReservationServices;
import entities.Reservation;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.ChambreServices;

/**
 *
 * @author BISSAOUI YASSINE
 */
public class ReservationsServlet extends HttpServlet {

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
        String op = request.getParameter("op");

        if (op.toString().compareTo("add") == 0) {

            try {

                response.setContentType("text/html;charset=UTF-8");
                String d1 = request.getParameter("date1");
                String d2 = request.getParameter("date2");
                ChambreServices cs = new ChambreServices();
                int idC = Integer.parseInt(request.getParameter("idC"));

                int idU = Integer.parseInt(request.getParameter("idU"));
                Double prix = cs.findById(idC).getTarif();

                SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
                Date firstDate = formatter2.parse(d1);
                Date secondDate = formatter2.parse(d2);;
                long diff = secondDate.getTime() - firstDate.getTime();
                TimeUnit time = TimeUnit.DAYS;
                long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
                PrintWriter out = response.getWriter();

                ReservationServices rs = new ReservationServices();
                Reservation r = new Reservation(firstDate, secondDate, prix * diffrence, idU, idC);

                rs.create(r);

                response.sendRedirect("MyReservation.jsp");

            } catch (ParseException ex) {
                Logger.getLogger(ReservationsServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       else if(op.toString().compareTo("sup")==0){
                           int idC = Integer.parseInt(request.getParameter("idC"));
                             ReservationServices rs = new ReservationServices();
                             rs.delete(rs.findById(idC));
                             response.sendRedirect("MyReservation.jsp");

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
