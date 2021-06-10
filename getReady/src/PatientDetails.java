
import java.util.Properties;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;


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
	   		    
	   		   Connection con=DriverManager.getConnection(  
	   		   "jdbc:mysql://localhost:3306/doctorsdb","root","Maaz@Khan777");
	   		   
	   		//PreparedStatement pst1=con.prepareStatement("select AppointmentNumber from Appointment where hn='"+(String)session.getAttribute("hname")+"' and dn='"+(String)session.getAttribute("ddname")+"' order by AppointmentNumber DESC");
	   		  
	   		   
	   		String sql="select count(AppNo) from appointment where HosName='"+(String)session.getAttribute("HosName")+"' and DocName='"+(String)session.getAttribute("DocName") +"' ";            
		 	PreparedStatement pst=con.prepareStatement(sql);
		 	ResultSet rs=pst.executeQuery();
		 	if(rs.next())
		 	{
		 		session.setAttribute("pat",rs.getString(1));
		 	}
		 	else
		 	{
		 		session.setAttribute("pat",0);
		 	}
	   		  
	   		   
//	   		String sql1="select count(AppNo) from appointment where HosName='"+request.getParameter("HosName")+"' and DocName='"+request.getParameter("DocName") +"' ";            
//		 	PreparedStatement pst1=con.prepareStatement(sql1);
//		 	ResultSet rs1=pst1.executeQuery();
//		 	if(rs1.next())
//		 	{
//		 		session.setAttribute("pat",rs1.getString(1));
//		 	}
//		 	else
//		 	{
//		 		session.setAttribute("pat",0 );
//		 	}
	   		   
	   		   
//	   		PreparedStatement pst1=con.prepareStatement("select AppointmentNumber from Appointment where hn='"+(String)session.getAttribute("hname")+"' and dn='"+(String)session.getAttribute("ddname")+"' order by AppointmentNumber DESC");
//	   		ResultSet rs=pst1.executeQuery(); 
//	   		
//	   		int latestNumber=1;
//	   		if(rs.next()) {
//
//	   			System.out.println("not empty res set.. before adding p = "+latestNumber);
//	   			latestNumber= rs.getInt(1)+1;
//	   			//pst1.setInt(4, rs.getInt(1)+1);
//	   			System.out.println("not empty res set.. after adding p = "+latestNumber);
//	   			}
//	   		
//	   		rs.close();
	   	
	   		//int latestNumber=1+ (int)session.getAttribute("pat");
		 	
	   		int ln=Integer.parseInt((String)session.getAttribute("pat"))+1;
	   		String latestNumber=ln+"";
	   		String pn=request.getParameter("PatientName");
	   		String pp=request.getParameter("PatientProblem");
	   		String phn=request.getParameter("PatientPhoneNumber");
	   		
	   		
//	   		System.out.println(session.getAttribute("hname"));
//	   		System.out.println(session.getAttribute("ddname"));
//	   		System.out.println(session.getAttribute("AOE"));
//	   		System.out.println(session.getAttribute("time"));
//	   		  int c=0;
	   	
	   		
	   		
	   	 PreparedStatement psti=con.prepareStatement(" insert into appointment (HosName,DocName,AOE,timings,pn,pp,phn,AppNo)"
	   		        + " values (?, ?, ?, ?, ?, ?, ?, ?)");
	   	 
	   	 	  psti.setString(1, (String)session.getAttribute("HosName"));
	   		  psti.setString(2, (String)session.getAttribute("DocName"));
	   		  psti.setString(3, (String)session.getAttribute("AOE"));
	   		  psti.setString(4, (String)session.getAttribute("timings"));
	   		  psti.setString(5, pn);
	   		  psti.setString(6, pp);
	   		  psti.setString(7, phn);
	   		  psti.setString(8, latestNumber);
	   		  
	   		int t=psti.executeUpdate();
	   		
	   		String sql1="select count(AppNo) from appointment where HosName='"+(String)session.getAttribute("HosName")+"' and DocName='"+(String)session.getAttribute("DocName") +"' ";            
		 	PreparedStatement pst1=con.prepareStatement(sql1);
		 	ResultSet rs1=pst1.executeQuery();
		 	if(rs1.next())
		 	{
		 		session.setAttribute("pat",rs1.getString(1));
		 	}
		 	else
		 	{
		 		session.setAttribute("pat",0);
		 	}
	   		  
	   		  
	   		  
	   		  
	   		   
	   		  if(t!=0)
	   		  {
	   			 request.setAttribute("done", "success");
	   			 //request.setAttribute("latestNumber", latestNumber);
	   			 //session.setAttribute("sec", "second");
	   			 
	   			//session.setAttribute("pat", latestNumber);
	   			 
	   			 
	   			 
	
	   			 RequestDispatcher requestDispatcher = request.getRequestDispatcher("template.jsp");
				 requestDispatcher.forward(request, response);
	   		  }
	   		  else
	   		  {
	   			  request.setAttribute("done", "fail");
	   			  RequestDispatcher requestDispatcher = request.getRequestDispatcher("template.jsp");
				 requestDispatcher.forward(request, response);
	   		  }
	   		  con.close();
	   		   }catch(Exception e){
	   			   System.out.println(e);
	   		}
		
	}

}
