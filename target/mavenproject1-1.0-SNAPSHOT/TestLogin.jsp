<%-- 
    Document   : TestLogin
    Created on : Jan 13, 2022, 1:14:28 AM
    Author     : BISSAOUI YASSINE
--%>

<%     
    
if(session.getAttribute("idUser")!=null){
        
        
               response.sendRedirect("NewFile.jsp");
        
    }
    
    
    
    
%>
