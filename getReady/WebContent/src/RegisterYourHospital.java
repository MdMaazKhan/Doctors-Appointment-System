

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
import javax.servlet.http.HttpSession;


@WebServlet("/RegisterYourHospital")
public class RegisterYourHospital extends HttpServlet {
	
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 try{  
   		  // Class.forName("com.mysql.jdbc.Driver");  
   		   Connection con=DriverManager.getConnection(  
   		   "jdbc:mysql://localhost:3306/doctorsdb","root","Maaz@Khan777");  
   		   //String dname=request.getParameter("doctorname");
   		// HttpSession session=request.getSession(false);  
   		  PreparedStatement pst=con.prepareStatement(" insert into DoctorsInfo (HospitalName,DoctorName,AreaOfExpertise,Timings)"
   		        + " values (?, ?, ?, ?)");
   		  pst.setString(1, request.getParameter("hospitalnamenew"));
   		  pst.setString(2, request.getParameter("doctorname"));
   		  pst.setString(3, request.getParameter("aoe"));
   		  pst.setString(4, request.getParameter("timings"));
   		  int t=pst.executeUpdate();
//   		  
//   		  session.setAttribute("time", request.getParameter("timings"));
//   		session.setAttribute("AOE", request.getParameter("aoe"));
   		  
   		  if(t!=0) {
   			 RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
   			 requestDispatcher.forward(request, response);
   			
   		  }
   		  
   		   
   		   
   		   con.close();  
   		   }catch(Exception e){
   			   System.out.println(e);
   			   }
		 //RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
   	  
        // requestDispatcher.forward(request, response);
		
	}

}
