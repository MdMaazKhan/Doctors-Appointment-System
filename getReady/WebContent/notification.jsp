<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
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
</nav><br><br>









<c:choose>
         
         <c:when test = "${registered == 'successful'}">
         
          <h1 style="font-family:georgia;color:green;text-align:center">Registration Successful</h1>
          
          <br>
          <h3 style="font-family:georgia;text-align:center">We will get back to you for physical verification<br></h3>
         </c:when>
         
        
         <c:otherwise>
            <h3 style="font-family:georgia">Failed<br></h3>
         </c:otherwise>
      </c:choose>
      <br><br><br>
      <div style="font-family:georgia;text-align:center">
    	<a href="DoctorsLogin.jsp" class="btn btn-info btn-lg" role="button" >Doctors Login</a>
		<br><br>
		<a href="RegisterHospital.jsp" class="btn btn-info btn-lg" role="button">Doctor's Registration</a>
      </div>

</body>
</html>