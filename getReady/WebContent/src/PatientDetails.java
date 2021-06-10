

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PatientDetails")
public class PatientDetails extends HttpServlet {
	
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		HttpSession session=request.getSession(false);  
		
		 try{  
	   		  // Class.forName("com.mysql.jdbc.Driver");  
	   		   Connection con=DriverManager.getConnection(  
	   		   "jdbc:mysql://localhost:3306/doctorsdb","root","Maaz@Khan777");
	   		   
	   		   
	   		//select AppointmentNumber from Appointment where hn='fatima' and dn='rishi' order by AppointmentNumber DESC; 
	   		   //"select * from DoctorsInfo where HospitalName='"+request.getParameter("hospitalname")+"'"
	   		   
	   		PreparedStatement pst1=con.prepareStatement("select AppointmentNumber from Appointment where hn='"+(String)session.getAttribute("hname")+"' and dn='"+(String)session.getAttribute("ddname")+"' order by AppointmentNumber DESC");
	   		ResultSet rs=pst1.executeQuery(); 
	   		//int c=1;
	   		//rs.next();
	   		int latestNumber=1;
	   		if(rs.next()) {
	   			latestNumber= rs.getInt(1)+1;
	   			//pst1.setInt(4, rs.getInt(1)+1);
	   			//System.out.println("not empty res set");
	   			}
	   		
	   		
	   	
	   		
	   		String pn=request.getParameter("PatientName");
	   		String pp=request.getParameter("PatientProblem");
	   		String ppn=request.getParameter("PatientPhoneNumber");
	   		
//	   		System.out.println(session.getAttribute("hname"));
//	   		System.out.println(session.getAttribute("ddname"));
//	   		System.out.println(session.getAttribute("AOE"));
//	   		System.out.println(session.getAttribute("time"));
//	   		  int c=0;
	   	
	   		
	   		
	   	 PreparedStatement pst=con.prepareStatement(" insert into Appointment (pn,pp,PhnNumber,AppointmentNumber,hn,dn,aoe,t)"
	   		        + " values (?, ?, ?, ?, ?, ?, ?, ?)");
	   	 
	   	
   		
	   	 
	   		  pst.setString(1, pn);
	   		  pst.setString(2, pp);
	   		  pst.setString(3, ppn);
	   		  pst.setInt(4, latestNumber);
	   		  pst.setString(5, (String)session.getAttribute("hname"));
	   		pst.setString(6, (String)session.getAttribute("ddname"));
	   		pst.setString(7, (String)session.getAttribute("AOE"));
	   		pst.setString(8, (String)session.getAttribute("time"));
	   		  
	   		  int t=pst.executeUpdate();
	   		   
	   		   
	   		   con.close();
	   		   }catch(Exception e){
	   			   System.out.println(e);
	   			   }
		
	}

}
