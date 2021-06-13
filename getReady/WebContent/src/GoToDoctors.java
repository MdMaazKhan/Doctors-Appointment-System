

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

@WebServlet("/GoToDoctors")
public class GoToDoctors extends HttpServlet {
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 HttpSession session=request.getSession(false);  

		
		 try{  
	   		  
	   		   Connection con=DriverManager.getConnection(  
	   		   "jdbc:mysql://localhost:3306/doctorsdb","root","root"); 
	   		String ddname=request.getParameter("dname");
	   		 String sql="select AreaOfExpertise,Timings from DoctorsInfo where HospitalName='"+session.getAttribute("hname")+"' and DoctorName='"+ddname+"'";
	  		  PreparedStatement pst=con.prepareStatement(sql);
	  		   ResultSet rs=pst.executeQuery();  rs.next();
		   		
	  		
	  		   String aoe=rs.getString(1);
	  		   String time=rs.getString(2);
	  		   
	   		
	   	
	   		   request.setAttribute("ddname", ddname);
	   		request.setAttribute("hname", session.getAttribute("hname"));
	   	 	request.setAttribute("AOE", aoe);
	   	 	request.setAttribute("time", time);
	   		
   		
	   		session.setAttribute("ddname", ddname);
	   		session.setAttribute("AOE", aoe);
	   		session.setAttribute("time", time);
	   		   
	   		   con.close();  
	   		   }catch(Exception e){
	   			   System.out.println(e);
	   			   }
		 
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("template.jsp");
			 requestDispatcher.forward(request, response);
		
	}

}
