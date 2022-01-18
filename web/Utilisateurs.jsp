<%@page import="services.UserServices"%>
<%@page import="entities.User"%>

<% 
    
    if(session.getAttribute("idUser")==null){
        
        
               response.sendRedirect("login.jsp");
        
    }

%>
<body>
    <div class="container-scroller"> 
<%@ include file="Components/Navbar.jsp"%>
<div class="container-fluid page-body-wrapper">

<%@ include file="Components/side.html"%>

<div class="main-panel">
        <div class="content-wrapper">
          <div class="row">
                <div class="col-lg-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Gestion Utilisateurs</h4>
                  <div class="table-responsive">
                    <table class="table">
                      <thead>
                        <tr>
                          <th>Nom</th>
                          <th>Prenom</th>
                          <th>Email</th>
                          <th>Status</th>
                          <th>Action</th>
                        </tr>
                      </thead>
                      <tbody>
                          <%   UserServices us = new UserServices();
                                for(User u : us.findAll() )
                                {
                          %>
                        <tr>
                          <td><%= u.getPrenom() %></td>
                          <td><%= u.getNom()%></td>
                          <td><%= u.getEmail()%></td>
                          <td>
                              <%
                              if ( u.getEtat()==0)
                              {
                              %>
                              <label class="badge badge-warning">Pending</label></td>
                          <%
                              }
                              else if(u.getEtat()==1){     
                          %>
                                                        <label class="badge badge-success">Accepted.</label></td>
                      <%
                              }
                              else if(u.getEtat()==2){   
                          %>

                    <label class="badge badge-danger">Refuser.</label></td>
    
      <%
                              }     
                          %>

                          <td>
                                <%
                              if ( u.getEtat()==0)
                              {
                              %>
                              
                              
                                 <form style=" display: inline;" action="UserServlet" method="post">

                                  <input type="text" value="acc" hidden="" name="op" />

                                  <input type="text" value="<%= u.getId() %>" hidden="" name="id" />
                                  

                                  <button class="btn btn-sm btn-success" type="submit">Accepter</button>

                              </form>

                              <form style=" display: inline;" action="UserServlet" method="post">

                                  <input type="text" value="ref" hidden="" name="op" />
                                  <input type="text" value="<%= u.getId() %>" hidden="" name="id" />

                                  <button class="btn btn-sm btn-danger" type="submit">Refuser</button>

                              </form>

                          <%
                              
                              }
                                   
                          %>
                          <form style=" display: inline;" action="UserServlet" method="post">
                              <input type="text" value="sup" hidden="" name="op" />
                              <input type="text" value="<%= u.getId() %>" hidden="" name="id" />
                              <button class="btn btn-sm btn-primary" type="submit">Supprimer</button>
                               
                          </form>

                          </td>

                        </tr>
                     <% 
                                
                                }
                     %>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
            </div>
                
          </div>
        </div>
	<%@ include file="Components/Footer.html"%>
        </div>
</div>
    </div>