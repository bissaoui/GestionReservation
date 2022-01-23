

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
               <div class="col-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Ajouter Chambre</h4>
                 
                  <form  action="ChambreServlet" method="post" enctype="multipart/form-data" class="forms-sample">
                      <input type="text" name="op" value="add" hidden >
                    <div class="form-group">
                      <label for="exampleInputName1">Numero Chambre</label>
                      <input type="text" class="form-control" id="exampleInputName1" name="num" placeholder="Numero Chambre">
                    </div>
                    
                    
                    <div class="form-group">
                      <label for="exampleSelectGender" >Type Chambre</label>
                      <select class="form-control" name="type" id="exampleSelectGender">
                            
                            <option value="Chambre Simple">Chambre simple</option>
                            <option value="Chambre double pour un personne">Chambre double pour une personne</option>
                            <option value="Chambre double">Chambre double</option>
                            <option value="Chambre triple">Chambre triple</option>

                        </select>
                      </div>
                      <div class="form-group">
                      <label for="exampleInputPassword4">Tarif</label>
                      <input type="number" name="tarif" class="form-control" id="exampleInputPassword4" placeholder="350.0">
                    </div>
                    <div class="form-group">
                      <label>File upload</label>
                      <input type="file" name="image" class="file-upload-default">
                      <div class="input-group col-xs-12">
                        <input type="text" class="form-control file-upload-info" disabled="" placeholder="Upload Image">
                        <span class="input-group-append">
                          <button class="file-upload-browse btn btn-primary" type="button">Upload</button>
                        </span>
                      </div>
                    </div>
                    <button type="submit" class="btn btn-primary me-2">Submit</button>
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
        </div>
