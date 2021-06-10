<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<meta charset="utf-8">



<meta name="viewport" content="width=device-width">
<link href="css/styles.css" rel="stylesheet" type="text/css" media="all">
<link href="css/footer.css" rel="stylesheet" type="text/css" media="all">
<link href="http://fonts.googleapis.com/css?family=Ubuntu:regular,bold" rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Vollkorn:regular,italic,bold" rel="stylesheet" type="text/css">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body style="background-color:#f7f7f7;">




<div id="headerwrap">
  <header id="mainheader" class="bodywidth clear"> <img src="images/logo.png" alt="" class="logo">
    <hgroup id="websitetitle">
        <h1><span class="bold">Get Appointment</span></h1>
      <h2>No need to stand in queue</h2>
    </hgroup>
    
  </header>
    
</div>

   
<aside id="introduction" class="bodywidth clear">
  <div id="introleft">
    <h2>Search for your <span class="blue">Hospital</span></h2><br>
   	<form action="GetDoctors" method="post">
   	<div class="form-group">
      <input type="text" class="form-control" placeholder="Enter the name of the hospital" name="hospitalname"  required>
    </div>
   	
	<button type="submit" class="btn btn-success">Submit</button>
	</form>
   
   
   
   
   
<br>
<a href="RegisterHospital.jsp" role="button" ><button class="btn btn-primary">Doctors-Registration</button></a>

<br>
<br>
<a href="DoctorsLogin.jsp" role="button"><button class="btn btn-primary">Doctors-Login</button></a>
</div>
</aside>
    

 

 
  
   



</body>
</html>