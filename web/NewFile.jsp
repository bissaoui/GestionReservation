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
            <div class="col-sm-12">
                
                
                <p>Welcome <%=  session.getAttribute("idUser") %> </p>
                
                
                
            </div>
          </div>
        </div>
	<%@ include file="Components/Footer.html"%>
        </div>
</div>
    </div>