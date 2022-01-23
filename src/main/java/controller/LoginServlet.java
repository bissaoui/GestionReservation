package controller;

import entities.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import services.UserServices;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserServices us = new UserServices();

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//response.sendRedirect("inscription.jsp");
            String op = request.getParameter("op");

            if(op.toString().compareTo("Inscription")==0){
                
                String email = request.getParameter("email");
		String Passe = request.getParameter("password");
                String prenom = request.getParameter("Prenom");
		String nom = request.getParameter("Nom");

                User u = new User(nom, prenom, email, Passe);
                if(us.create(u)){
                    
                    response.sendRedirect("MessageAttende.jsp");
                    
                }else{
                    
                    response.sendRedirect("NoInscri.jsp");

                }   
            }
            else if(op.toString().compareTo("Login")==0) {
                
                String email = request.getParameter("email");
                
		String Passe = request.getParameter("password");
                
		if(us.Login(email, Passe)!=-1) {
                    
                       int id = us.Login(email, Passe);
                        
                       User u= us.findById(id);
                       
                    HttpSession session=request.getSession();  

                    session.setAttribute("idUser",id);
                    
                    session.setAttribute("nom",u.getNom().toString());  
                    
                    session.setAttribute("prenom",u.getPrenom());  
                    
                    session.setAttribute("Email",u.getEmail());  
                    
                    session.setAttribute("Role",u.getRole());
                    
                    if(u.getRole()==1){
                        response.sendRedirect("NewFile.jsp");

                    }else{
                        response.sendRedirect("MyReservation.jsp");
                    }
                    

		}else {
			response.sendRedirect("login.jsp");
		}
            }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
