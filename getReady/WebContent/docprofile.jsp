<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctors-Profile</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>

<body style="background-image: url('images/DocProfile.jpg');background-size: cover;">
 <%
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");  // HTTP 1.1 or higher
response.setHeader("Pragma", "no-cache");  // HTTP 1.0 
response.setHeader("Expires", "0");  // proxy servers

%>
<br><br><br><br><br>


<div class="container">

<div class="row">


<!-- First Card -->
<div class="col-md-6">
<div class="card text-white bg-dark mb-3" style="max-width: 35rem;">
  <div class="card-header"><h1> Dr.<%=session.getAttribute("DocName") %></h1></div>
  <div class="card-body">
    <h3 class="card-title" style="font-family:georgia">Hospital: <%=session.getAttribute("HosName") %></h3>
    <h3 class="card-text" style="font-family:georgia">Dr.<%=session.getAttribute("DocName") %> expertise in<%=session.getAttribute("AOE") %></h3>
    <h3 class="card-text" style="font-family:georgia">Available at : <%=session.getAttribute("timings") %></h3>
  </div>
  <div class="card-footer" style="font-family:georgia">
  	<form action="logout" method="post">
  		<button type="submit" class="btn btn-danger my-2 my-sm-0 "  >LOGOUT</button>
	</form>
  </div>
</div>

</div>




<!-- Second Card -->
<div class="col-md-6">
<div class="card border-dark mb-3" style="max-width: 35rem;">
  <div class="card-header"><h1 style="font-family:georgia">Current Patient</h1></div>
  <div class="card-body" style="font-family:georgia">
  
    <h3 class="card-title" style="font-family:georgia"> ${pn }</h3>
    <h3 class="card-text" style="font-family:georgia"> ${pp } </h3>
    <h3 class="card-text" style="font-family:georgia"> ${phn} </h3>
    <h3 class="card-text" style="font-family:georgia">Number Of Patients: ${nopat} </h3>
  </div>
  <div class="card-footer" style="font-family:georgia">
  	<form action="DecreasePatients" method="post">
	<button type="submit" class="btn btn-info btn-lg">-- ( decrease patients)</button>
	</form>
  </div>
</div>

</div>

</div>


 </div>











<!--  

<div align="right">
<form action="logout" method="post">
<button type="submit" class="btn btn-info btn-lg">LOGOUT</button>
</form>
</div>

Hospital name  <%=session.getAttribute("hospital") %><br>
doctor name :<%=session.getAttribute("doctor") %><br>
area of expertise :<%=session.getAttribute("expertise") %><br>
timings :<%=session.getAttribute("timings") %><br>
number of patients in queue : <h1> <%=session.getAttribute("nopat") %></h1> <br>
current patient: <%=session.getAttribute("currentpatient") %>

<form action="DecreasePatients" method="post">
<button type="submit" class="btn btn-info btn-lg">-- ( decrease patients)</button>
</form>
-->




      
<p id="done"></p>




<%-- 

<script>

function decreasePatients()
{
	document.getElementById("nop").innerHTML = 9856; 
	document.getElementById("done").innerHTML = "here";
	var test = <%=request.getAttribute("phospitalname").toString()%>;
	//alert(test+"");
	//document.getElementById("nop").innerHTML = Number(document.getElementById("nop").innerHTML)+1;
 			
/* 	
	   try {
	    	java.sql.Connection con;
	    	//Class.forName("org.gjt.mm.mysql.Driver");
	    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorsdb", "root", "root");
	   		// out.println (db+ "database successfully opened.");
		    PreparedStatement pst=con.prepareStatement(" UPDATE doctorsinfo SET patients = ? WHERE (HospitalName = '?' and DoctorName = '?');");
   		  	pst.setString(1, Integer.parseInt(${pnoofpatients })+1);
   		  	pst.setString(2, ${phospitalname});
   		  	pst.setString(3, ${pdoctorname });
   		 
   		  	int t=pst.executeUpdate();
   		  	if(t!=0) 
   	   		{
   		  		document.getElementById("nop").innerHTML = Number(document.getElementById("nop").innerHTML)+1;
   		  		document.getElementById("done").innerHTML="Decremented successfully";
	   		 	RequestDispatcher requestDispatcher = request.getRequestDispatcher("notification.jsp");
   				requestDispatcher.forward(request, response);
   			
   		  	}
   		  	else
   		  	{
   				document.getElementById("done").innerHTML="Please do it again";	
   		  	}
		
	  }
	  catch(SQLException e) {
	    out.println("SQLException caught: " +e.getMessage());
	  } 
 	//alert("hi");
 */
}
</script>
 --%>
</body>

</html>