<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor's Template</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body style="background-color:#f7f7f7;">
 
<%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");  // HTTP 1.1 or higher
response.setHeader("Pragma", "no-cache");  // HTTP 1.0 
response.setHeader("Expires", "0");  // proxy servers

%>

<%-- <h1>1-- <%=session.getAttribute("ddname") %></h1> --%>

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
<br>


<div class="container">

<div class="row">

<div class="col-md-6">
<div class="card text-white bg-dark mb-3" style="max-width: 20rem;">
  <div class="card-header"><h1> Dr.${DocName }</h1></div>
  <div class="card-body">
    <h5 class="card-title" style="font-family:georgia">Hospital: ${HosName}</h5>
    <p class="card-text" style="font-family:georgia">Dr.${DocName } expertise in ${AOE }</p>
    <p class="card-text" style="font-family:georgia">Available at : ${timings }</p>
  </div>
  <div class="card-footer" style="font-family:georgia">Number of Patients in the queue: ${pat}</div>
</div>
</div>

<div class="col-md-6">
<div class="card border-dark mb-3" style="max-width: 23rem;">
  <div class="card-header">Enter Your Details</div>
  <div class="card-body">
    <form action="PatientDetails" method="post">

	<div class="form-group">
      <input type="text" class="form-control" placeholder="Name" name="PatientName" required>
    </div>
    <div class="form-group">
      <input type="text" class="form-control" placeholder="Enter Your Problem"  name="PatientProblem" required>
    </div>
    <div class="form-group">
      <input type="text" class="form-control" placeholder="Enter Your Number"  name="PatientPhoneNumber" required>
    </div>
 
  <button type="submit" class="btn btn-success" >Get Appointment</button>
  
 </form>
    
  </div>
</div>

<%
 if(request.getAttribute("done")=="success")
 { %>
	<h1 style="font-family:georgia;color:green">Success! Your number is ${pat }</h1>
	 <% }
 else
 {
	 if(request.getAttribute("done")=="fail")
	 { %>
	 <h1 style="font-family:georgia;color:red">FAILED! %></h1>
	 <% }
 }
 %>

</div>

</div>





 
 </div>
 
 
 
</body>
</html>