<%-- 
    Document   : DispChambre
    Created on : Jan 19, 2022, 2:48:14 AM
    Author     : BISSAOUI YASSINE
--%>

<%@page import="services.ChambreServices"%>
<%@page import="entities.Chambre"%>
<% 
    
    if(session.getAttribute("idUser")==null){
        
        
                
               response.sendRedirect("login.jsp");
        
    }

%>
<body>
    <div class="container-scroller"> 
<%@ include file="Components/Navbar.jsp"%>
<div class="container-fluid page-body-wrapper">

<%@ include file="Components/side1.html"%>

<div class="main-panel">
        <div class="content-wrapper">

            <h1 class="card-title mb-5 col-lg-9"  style="
    display: inline-block;
">les Chambres Disponible</h1>
            
            <div style="
    display: inline-block;
    width: 230px;"
    class="col-lg-6"
>
       
            </div>
            
       <div class="row">
           <%   ChambreServices us = new ChambreServices();
                                for(Chambre u : us.findAllChambreNotUsed())
                                {
                          %>
            <div class="col-lg-4 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                                      <h4 class="card-title text-center m-2" >Chambre <%= u.getNumero()%></h4>

                                      <img src="images/<%= u.getPhoto()%>" style="width: 100%; height: 297px" class="my-3" alt="image1"/>
                    <h4>Type : <%= u.getType()%></h4>
                    <h4>tarif : <%= u.getTarif()%> Dh</h4>
               
                        <a class="btn btn-primary me-2" href="ModChambre.jsp?id=<%= u.getIdChambre()%>"  > Reserver</a>
                    

                </div>
              </div>
            </div>
                 <%
                              
                              }
                                   
                          %>

       </div>
            
        </div>
	<%@ include file="Components/Footer.html"%>
        </div>
</div>
    </div>