import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DecreasePatients")
public class DecreasePatients extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		
		 try {
			 
			 HttpSession session=request.getSession(false);  
			 System.out.println(session.getAttribute("hospital"));

			 System.out.println(session.getAttribute("doctor"));

			 System.out.println(session.getAttribute("nopat"));

			 System.out.println(session.getAttribute("currentpatient"));
			 
			 System.out.println(session.getAttribute("phonenumber"));
			
			 	java.sql.Connection con;
		    	//Class.forName("org.gjt.mm.mysql.Driver");
		    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorsdb", "root", "Maaz@Khan777");
		   		// out.println (db+ "database successfully opened.");
		    	String query1="delete FROM appointment where HosName='"+ session.getAttribute("HosName") +"' and DocName='"+ session.getAttribute("DocName") +"' and phn='"+ session.getAttribute("phn") +"'";
			    PreparedStatement pst=con.prepareStatement(query1);
	   		  	int i=pst.executeUpdate(query1);
	   		 
	   		  	if(i==1) 
	   	   		{
	        		  
	   		  		String sq  ="SELECT pn,pp,phn,count(AppNo) FROM appointment where HosName='"+ session.getAttribute("HosName") +"' and DocName='"+ session.getAttribute("DocName") +"' order by AppNo";

	   		  		//String sql2="SELECT count(AppointmentNumber),pn,pp,phnNumber FROM appointment where hn='"+ session.getAttribute("hospital") +"' and dn='"+session.getAttribute("doctor") +"' order by AppointmentNumber asc";
	   		  		pst=con.prepareStatement(sq);
	   		  		ResultSet rs1=pst.executeQuery();
      		  
	   		  		if(rs1.next())
	   		  		{
	   		  			session.setAttribute("pn", rs1.getString(1));
	   		  			session.setAttribute("pp", rs1.getString(2));
	   		  			session.setAttribute("phn",rs1.getString(3));
	   		  			session.setAttribute("nopat",rs1.getString(4));
	   		  			
	   		  			//session.setAttribute("nopat",rs1.getString(1) );
	   		  			//session.setAttribute("currentpatient", "NAME : "+rs1.getString(2)+"--- PROBLEM : "+rs1.getString(3)+"--- PHoNE NO : "+rs1.getString(4));
	   		  			//session.setAttribute("phonenumber",rs1.getString(4) );
	   		  			RequestDispatcher requestDispatcher = request.getRequestDispatcher("docprofile.jsp");
	   		  			requestDispatcher.forward(request, response);
	   		  		}
	   		  		else
	   		  		{
	   		  			session.setAttribute("pn","--NONE--");
	   		  			session.setAttribute("pp", "--NONE--");
	   		  			session.setAttribute("phn","--NONE--");
	   		  			session.setAttribute("nopat","0");
	   		  			
	   		  			//session.setAttribute("nopat","0");
	   		  			//session.setAttribute("currentpatient","--NONE--");
	   		  			//session.setAttribute("phonenumber","0" );
	   		  			RequestDispatcher requestDispatcher = request.getRequestDispatcher("docprofile.jsp");
	   		  			requestDispatcher.forward(request, response);
	   		  		}
      		  
	   		  		
	   			
	   		  	}
	   		  	else
	   		  	{
	   		  		RequestDispatcher requestDispatcher = request.getRequestDispatcher("docprofile.jsp");
		  			requestDispatcher.forward(request, response);
	   		  	}
			
		  }
		  catch(SQLException e) {
		   
		  }
	}

}
