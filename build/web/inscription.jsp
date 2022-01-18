<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="TestLogin.jsp"%>

<html lang="en">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Star Admin2</title>
<!-- plugins:css -->
<link rel="stylesheet" href="resources/vendors/feather/feather.css">
<link rel="stylesheet"
	href="resources/vendors/mdi/css/materialdesignicons.min.css">
<link rel="stylesheet"
	href="resources/vendors/ti-icons/css/themify-icons.css">
<link rel="stylesheet" href="resources/vendors/typicons/typicons.css">
<link rel="stylesheet"
	href="resources/vendors/simple-line-icons/css/simple-line-icons.css">
<link rel="stylesheet"
	href="resources/vendors/css/vendor.bundle.base.css">
<!-- endinject -->
<!-- Plugin css for this page -->
<!-- End plugin css for this page -->
<!-- inject:css -->
<link rel="stylesheet"
	href="resources/css/vertical-layout-light/style.css">
<!-- endinject -->
<link rel="shortcut icon" href="resources/images/favicon.png" />
</head>
<body>
	<div class="container-scroller">
		<div class="container-fluid page-body-wrapper full-page-wrapper">
			<div class="content-wrapper d-flex align-items-center auth px-0">
				<div class="row w-100 mx-0">
					<div class="col-lg-4 mx-auto">
						<div class="auth-form-light text-left py-5 px-4 px-sm-5">
							<div class="brand-logo">
								<img src="resources/images/logo.svg" alt="logo">
							</div>
							<h4>Register</h4>
							<form class="pt-3" action="LoginServlet" method="Get">
                                                            	<input type="text" name="op" class="form-control form-control-lg"
                                                                       id="Inscription" value="Inscription"  placeholder="Inscription" hidden>
                                                                <div class="form-group">
									<input type="text" name="Prenom" class="form-control form-control-lg"
										id="Prenom"  placeholder="Prenom">
								</div>
                                                                <div class="form-group">
									<input type="text" name="Nom" class="form-control form-control-lg"
										id="Nom"  placeholder="Nom">
								</div>
								<div class="form-group">
									<input type="email" name="email" class="form-control form-control-lg"
										id="exampleInputEmail1"  placeholder="Email">
								</div>

								<div class="form-group">
									<input type="password" name="password" onkeyup="active()" class="form-control form-control-lg"
										id="pswrd_1" placeholder="Password">
								</div>
                                                                <div class="form-group">
									<input type="password" name="ConfirmPassword" class="form-control form-control-lg"
										id="pswrd_2"  onkeyup="active_2()" placeholder="Confirm Password">
								</div>
                                                                                                                                            <div class="error-text"></div>

								<div class="mt-3">
									<button
										class="btn btn-block btn-primary btn-lg font-weight-medium auth-form-btn"
										type="submit">Inscription</button>
								</div>
								
								<div class="mb-2"></div>
								
							</form>
						</div>
					</div>
				</div>
			</div>
			<!-- content-wrapper ends -->
		</div>
		<!-- page-body-wrapper ends -->
	</div>
    
	<!-- container-scroller -->
	<!-- plugins:js -->
	<script src="resources/vendors/js/vendor.bundle.base.js"></script>
        <script>
         const pswrd_1 = document.querySelector("#pswrd_1");
         const pswrd_2 = document.querySelector("#pswrd_2");
         const errorText = document.querySelector(".error-text");
         const showBtn = document.querySelector(".show");
         const btn = document.querySelector("button");
                      btn.setAttribute("disabled", "");

         function active(){
           if(pswrd_1.value.length >= 6){
             btn.removeAttribute("disabled", "");
             btn.classList.add("active");
             pswrd_2.removeAttribute("disabled", "");
           }else{
             btn.setAttribute("disabled", "");
             btn.classList.remove("active");
             pswrd_2.setAttribute("disabled", "");
           }
         }
         pswrd_2.onkeyup = function(){
           if(pswrd_1.value != pswrd_2.value){
             errorText.style.display = "block";
             errorText.classList.remove("matched");
             errorText.textContent = "Error! Confirm Password Not Match";
             return false;
           }else{
             errorText.style.display = "block";
             errorText.classList.add("matched");
             errorText.textContent = "Nice! Confirm Password Matched";
             return false;
           }
         }
         function active_2(){
           if(pswrd_2.value != ""){
             showBtn.style.display = "block";
             showBtn.onclick = function(){
               if((pswrd_1.type == "password") && (pswrd_2.type == "password")){
                 pswrd_1.type = "text";
                 pswrd_2.type = "text";
                 this.textContent = "Hide";
                 this.classList.add("active");
               }else{
                 pswrd_1.type = "password";
                 pswrd_2.type = "password";
                 this.textContent = "Show";
                 this.classList.remove("active");
               }
             }
           }else{
             showBtn.style.display = "none";
           }
         }
      </script>
	<!-- endinject -->
	<!-- Plugin js for this page -->
	<script
		src="resources/vendors/bootstrap-datepicker/bootstrap-datepicker.min.js"></script>
	<!-- End plugin js for this page -->
	<!-- inject:js -->
	<script src="resources/js/off-canvas.js"></script>
	<script src="resources/js/hoverable-collapse.js"></script>
	<script src="resources/js/template.js"></script>
	<script src="resources/js/settings.js"></script>
	<script src="resources/js/todolist.js"></script>
	<!-- endinject -->
</body>

</html>
