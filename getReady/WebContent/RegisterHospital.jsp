<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>


<title>Registration</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->



<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>

<body style="background-color:#f7f7f7;">




<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="index.jsp" style="font-family:georgia">
  <img src="images/logo.png" width="30" height="30" class="d-inline-block align-top" alt="">
  Get-Appointment
  </a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item active">
        <a class="nav-link" href="AboutUs.jsp">Our-Team </a>
      </li>
    </ul>
    
  </div>
</nav>










<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<form class="login100-form validate-form"  action="RegisterYourHospital" method="post">
					<span class="login100-form-title p-b-43">
						Doctor's Registration !
					</span>
					
					
					<div class="wrap-input100">
						<input class="input100" type="text" name="hospitalnamenew" required>
						<span class="focus-input100"></span>
						<span class="label-input100">Hospital Name</span>
					</div>
					
					<div class="wrap-input100">
						<input class="input100" type="text" name="doctorname" required>
						<span class="focus-input100"></span>
						<span class="label-input100">Doctor Name</span>
					</div>
					
					<div class="wrap-input100">
						<input class="input100" type="text" name="aoe" required>
						<span class="focus-input100"></span>
						<span class="label-input100">Area Of Expertise</span>
					</div>
					
					<div class="wrap-input100">
						<input class="input100" type="text" name="timings" required>
						<span class="focus-input100"></span>
						<span class="label-input100">Timings</span>
					</div>
					
					<div class="wrap-input100 validate-input" data-validate="Password is required">
						<input class="input100" type="password" name="pass">
						<span class="focus-input100"></span>
						<span class="label-input100">Password</span>
					</div>
					<br>

					

					<div class="container-login100-form-btn">
						<button class="login100-form-btn" type="submit">
							Submit
						</button>
					</div>
					
					
					
				</form>

				<div class="login100-more" style="background-image: url('images/bg-01.jpg');">
				</div>
			</div>
		</div>
	</div>






<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>












<!-- 

<h1>Register Your hospital and you are ready to go!!</h1>
<form action="RegisterYourHospital" method="post">
hospital name:<input type="text" name="hospitalnamenew"  required><br>
doctor name:<input type="text" name="doctorname"  required><br>
aoe name:<input type="text" name="aoe"  required><br>
timings:<input type="text" name="timings"  required>eg..3-8 or 12-18 <br>
Password:<input type="password" name="pass"  required><br>
<button type="submit" class="btn btn-info btn-lg">submit</button>
</form>

 -->


 
</body>
</html>