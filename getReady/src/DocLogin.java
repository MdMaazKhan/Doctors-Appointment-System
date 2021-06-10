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

@WebServlet("/DocLogin")
public class DocLogin extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		try {
				 Connection con=DriverManager.getConnection(  
	    		   "jdbc:mysql://localhost:3306/doctorsdb","root","Maaz@Khan777");  
	    		 String sql="Select * from DoctorsInfo where HospitalName='"+request.getParameter("hosname").replaceAll("\'", "")+"' and DoctorName='"+request.getParameter("docname") +"' and password='"+ request.getParameter("pswd") +"'";                           
	    		  PreparedStatement pst=con.prepareStatement(sql);
	    		   ResultSet rs=pst.executeQuery();  
	    		  if(rs.next())
	    		  {
	    			  HttpSession session=request.getSession(); 
	    			  session.setAttribute("HosName", request.getParameter("hosname"));
	        		  session.setAttribute("DocName", request.getParameter("docname"));
	        		  session.setAttribute("AOE",rs.getString(4));
	        		  session.setAttribute("timings", rs.getString(5));
	        		  
	        		  //String sql1="SELECT AppointmentNumber,pn,pp,phnNumber FROM appointment where hn='"+ request.getParameter("hosname").replaceAll("\'", "") +"' and dn='"+ request.getParameter("docname") +"' order by AppointmentNumber desc";
	        		  String sq  ="SELECT pn,pp,phn,count(AppNo) FROM appointment where HosName='"+ request.getParameter("hosname").replaceAll("\'", "") +"' and DocName='"+ request.getParameter("docname") +"' order by AppNo";
	        		  
	        		  pst=con.prepareStatement(sq);
	        		  ResultSet rs1=pst.executeQuery();
	        		  
	        		  if(rs1.next())
	        		  {
	        			  session.setAttribute("pn", rs1.getString(1));
	        			  session.setAttribute("pp", rs1.getString(2));
	        			  session.setAttribute("phn",rs1.getString(3));
	        			  session.setAttribute("nopat",rs1.getString(4));
	        		  }
	        		  else
	        		  {
	        			  session.setAttribute("pn","--NONE--");
	        			  session.setAttribute("pp", "--NONE--");
	        			  session.setAttribute("phn","--NONE--");
	        			  session.setAttribute("nopat","0");
	        		  }
	        		  
	        		  
	        		  
	        		  
//	    			  request.setAttribute("phospitalname", rs.getString(2));
//	    			  request.setAttribute("pdoctorname", rs.getString(3));
//	    			  request.setAttribute("pareaofexpertise", rs.getString(4));
//	    			  request.setAttribute("ptimings", rs.getString(5));
//	    			  request.setAttribute("pnoofpatients", rs.getString(7));
	    			 //String s= rs.getString(1);
	    			  RequestDispatcher requestDispatcher = request.getRequestDispatcher("docprofile.jsp");
	    	   			 requestDispatcher.forward(request, response);
	    		  }
	    		  else
	    		  {
	    			  RequestDispatcher requestDispatcher = request.getRequestDispatcher("DoctorsLogin.jsp");
	    	   			 requestDispatcher.forward(request, response);
	    			  
	    		  }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
