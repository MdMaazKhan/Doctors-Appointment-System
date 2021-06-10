

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
		
//		String dname=request.getParameter("dname");
//   		System.out.println(dname00);
//
		 HttpSession session=request.getSession(false);  
//   		System.out.println(request.getAttribute("dname"));
  		//System.out.println(session.getAttribute("hname"));
//   		System.out.println(request.getParameter("hname"));
		 
		 
//		
		
		 try{  
	   		  // Class.forName("com.mysql.jdbc.Driver");  
	   		   Connection con=DriverManager.getConnection(  
	   		   "jdbc:mysql://localhost:3306/doctorsdb","root","Maaz@Khan777"); 
	   		String ddname=request.getParameter("dname");
	   		 String sql="select AreaOfExpertise,Timings from DoctorsInfo where HospitalName='"+session.getAttribute("hname")+"' and DoctorName='"+ddname+"'";
	  		  PreparedStatement pst=con.prepareStatement(sql);
	  		   ResultSet rs=pst.executeQuery();  rs.next();
		   		
	  		// System.out.println(rs.getString(1)+"  "+rs.getString(2));
	  		   String aoe=rs.getString(1);
	  		   String time=rs.getString(2);
	  		   
	   		
	   	//	System.out.println(ddname);
	   		   request.setAttribute("ddname", ddname);
	   		request.setAttribute("hname", session.getAttribute("hname"));
	   	 request.setAttribute("AOE", aoe);
	   	 request.setAttribute("time", time);
	   		
//	   		String PatientName=request.getParameter(" PatientName");
//	   		String PatientProblem=request.getParameter("PatientProblem");
//	   	 request.setAttribute("pn", PatientName);
//	   	request.setAttribute("pp", PatientProblem);
//	   		
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
