<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctors</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
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
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>





<br><br>
<div class="container">

<table class="table table-striped">
  <thead>
    <tr>
      <th scope="col">Hospital-Name</th>
      <th scope="col">Doctor-Name</th>
      <th scope="col">Area Of Expertise</th>
      <th scope="col">Timings</th>
      <th scope="col">Book-Slot</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${res}" var="item">
  <tr>
       <c:forEach items="${item}" var="result">
        
        <td style="font-family:georgia">   ${result }</td>
       
     
       </c:forEach>
       <td> 
       <form action="GoToDoctors" method="post">
       <input type="hidden" name="HosName" value="${item[0]}"/>
       <input type="hidden" name="DocName" value="${item[1]}"/>
       <input type="hidden" name="AOE" value="${item[2]}"/>
       <input type="hidden" name="timings" value="${item[3]}"/>
       <button type="submit" class="btn btn-success">Dr.${item[1]}</button>
       </form>
       </td>
       </tr>
     
    </c:forEach>
  </tbody>
</table>

 </div>
 
</body>
</html>





<!--   <c:forEach items="${res}" var="item">
       <a href="#"> "${item}"</a>
    </c:forEach>
    
    
    <c:forEach var="rowData" items="${myArray}">
    <tr>
        <td><c:out value="${rowData.firstName}"></c:out></td>
        <td><c:out value="${rowData.lastName}"></c:out></td>
        <td><c:out value="${rowData.sex}"></c:out></td>
        <td><c:out value="${rowData.age}"></c:out></td>
    <tr>
</c:forEach>




<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>  



<a href="template.jsp" role="button" class="btn btn-success" name="dname" >${item[1] }</a></td>



-->
