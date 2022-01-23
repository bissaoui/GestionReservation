<%-- 
    Document   : MakeRes
    Created on : Jan 19, 2022, 2:56:22 AM
    Author     : BISSAOUI YASSINE
--%>



<%@page import="entities.Chambre"%>
<%@page import="services.ChambreServices"%>
<%

    if (session.getAttribute("idUser") == null) {

        response.sendRedirect("login.jsp");

    }

    int id = Integer.parseInt(request.getParameter("id"));

    ChambreServices cs = new ChambreServices();
    Chambre c = cs.findById(id);


%>
<body>
    <div class="container-scroller"> 
        <%@ include file="Components/Navbar.jsp"%>
        <div class="container-fluid page-body-wrapper">

            <%@ include file="Components/side1.html"%>

            <div class="main-panel">
                <div class="content-wrapper">
                    <div class="row">
                        <div class="col-12 grid-margin stretch-card">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">Ajouter Reservation pour chambre <%= c.getNumero()%> </h4>
                                    <form  action="ReservationsServlet" method="post" class="forms-sample">
                                        <input type="text" name="op" value="add" hidden >
                                        <input type="text" name="idC" value="<%= c.getIdChambre()%>" hidden >
                                        <input type="text" name="idU" value="<%= session.getAttribute("idUser")%>" hidden >

                                        <div class="w-100">
                                            <img src="images/<%= c.getPhoto()%>" style="width: 50%; margin: auto; height: 397px" class="my-3" alt="image1"/>
                                        </div>
                                        <h4>Type : <%= c.getType()%></h4>
                                        <h4>tarif : <%= c.getTarif()%> Dh  / nuit</h4>
                                        <label class="mt-2" >Date debut  </label>
                                        <input  id="date1" type="date" onchange="setTime()" value name="date1"  >
                                        <label  >Date fin  </label>
                                        <input class="mb-2" type="date" id="date2" name="date2"  >
                                        <br>
                                        <button type="submit" class="btn btn-primary me-2" >Submit</button>
                                        <button class="btn btn-light">Cancel</button>


                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <%@ include file="Components/Footer.html"%>
        <script src="resources/js/file-upload.js"></script>
        <script>

    var date1 = document.getElementById('date1');
    var date2 = document.getElementById('date2');
    var prix = document.getElementById('prix');

    var text = document.getElementById('text');
    var text1 = document.getElementById('text1');

    function setTime() {
        date2.setAttribute('min', date1.value);
        myFunction();
    }

    function myFunction() {

        var date11 = new Date(date1.value);
        var date22 = new Date(date2.value);
        if (date11.getTime() > date22.getTime()) {
            date2.value = date1.value;
        }



    }
    date2.onfocusout = myFunction();

        </script>
    </div>
