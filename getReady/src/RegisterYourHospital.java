

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegisterYourHospital")
public class RegisterYourHospital extends HttpServlet {
	
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 try{  
   		   
   		   Connection con=DriverManager.getConnection(  
   		   "jdbc:mysql://localhost:3306/doctorsdb","root","root");  
   		   String dname=request.getParameter("doctorname");
   		
   		  PreparedStatement pst=con.prepareStatement(" insert into DoctorsInfo (HospitalName,DoctorName,AreaOfExpertise,Timings,password)"
   		        + " values (?, ?, ?, ?, ?)");
   		  pst.setString(1, request.getParameter("hospitalnamenew").replaceAll("\'", ""));
   		  pst.setString(2, request.getParameter("doctorname"));
   		  pst.setString(3, request.getParameter("aoe"));
   		  pst.setString(4, request.getParameter("timings"));
   		  pst.setString(5, request.getParameter("pass"));
   		  int t=pst.executeUpdate();
   		  if(t!=0) {
   			  request.setAttribute("registered", "successful");
   			 RequestDispatcher requestDispatcher = request.getRequestDispatcher("notification.jsp");
   			 requestDispatcher.forward(request, response);
   			
   		  }
   		  else
   		  {
   			request.setAttribute("if", "unsuccessful");
   		  }
   		  
   		   
   		   
   		   con.close();  
   		   }catch(Exception e){
   			   System.out.println(e);
   			   }
		 //RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
   	  
        // requestDispatcher.forward(request, response);
		
	}

}
