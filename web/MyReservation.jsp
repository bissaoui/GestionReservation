<%@page import="java.util.Locale"%>
<%@page import="java.util.concurrent.TimeUnit"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="services.ChambreServices"%>
<%@page import="entities.Reservation"%>
<%@page import="services.ReservationServices"%>
<%@page import="services.UserServices"%>
<%@page import="entities.User"%>

<%
    int idUser = Integer.parseInt(session.getAttribute("idUser").toString());
    if (session.getAttribute("idUser") == null) {

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
                    <div class="row">
                        <div class="col-lg-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Mes  Reservations</h4>
                                    <div class="table-responsive">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th>Date debut</th>
                                                    <th>Date fin</th>
                                                    <th>Numero Chambre</th>
                                                    <th>Type chambre</th>
                                                    <th>Tarif</th>

                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%   ReservationServices us = new ReservationServices();
                                                    ChambreServices rs = new ChambreServices();
                                                    for (Reservation u : us.findAll()) {
                                                        if (u.getIdUser()==idUser){
                                                            
                                                        
                                                %>
                                                <tr>
                                                    <td><%= u.getDateDebut()%></td>
                                                    <td><%= u.getDateFin()%></td>
                                                    <td><%= rs.findById(u.getIdChambre()).getNumero()%></td>
                                                    <td><%= rs.findById(u.getIdChambre()).getType()%></td>
                                                    <% rs.findById(u.getIdChambre()).getTarif();
                                                        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
                                                        Date firstDate = u.getDateDebut();
                                                        Date secondDate = u.getDateFin();

                                                        long diff = secondDate.getTime() - firstDate.getTime();

                                                        TimeUnit time = TimeUnit.DAYS;
                                                        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);

                                                    
                                                        %>
                                                    <td>
                                                        <%= u.getPrix() %>  DH
                                                        

                                                </tr>
                                                <%}}%>
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