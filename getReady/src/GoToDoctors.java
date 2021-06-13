

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

@WebServlet("/GoToDoctors")
public class GoToDoctors extends HttpServlet {
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		 HttpSession session=request.getSession(false);  
		
		 
		 try{  
			 	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/doctorsdb","root","root"); 

   		   
			 	session.setAttribute("HosName", request.getParameter("HosName"));
			 	session.setAttribute("DocName", request.getParameter("DocName"));
			 	session.setAttribute("AOE", request.getParameter("AOE"));
			 	session.setAttribute("timings", request.getParameter("timings"));
   		   		
	   		
   		   		
   		   		
   		   	String sql1="select count(AppNo) from appointment where HosName='"+request.getParameter("HosName")+"' and DocName='"+request.getParameter("DocName") +"' ";            
		 	PreparedStatement pst1=con.prepareStatement(sql1);
		 	ResultSet rs1=pst1.executeQuery();
		 	
		 	if(rs1.next())
		 	{
		 		session.setAttribute("pat",rs1.getString(1));
		 	}
		 	else
		 	{
		 		session.setAttribute("pat",0 );
		 	}
   		   	
   		   		con.close();  
   		   		
		 	}// try close
		 	catch(Exception e)
		 	{
		 		System.out.println(e);
		 	}
		 
		 	RequestDispatcher requestDispatcher = request.getRequestDispatcher("template.jsp");
		 	requestDispatcher.forward(request, response);
		
	}

}
