

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;  
import javax.servlet.http.HttpSession;  
import javax.servlet.http.HttpSession;  
@WebServlet("/GetDoctors")
public class GetDoctors extends HttpServlet {
	
       protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	  
    	   try{  
    		   
    		   Connection con=DriverManager.getConnection(  
    		   "jdbc:mysql://localhost:3306/doctorsdb","root","root");  
    		 String sql="select * from DoctorsInfo where HospitalName='"+request.getParameter("hospitalname")+"'";
    		  PreparedStatement pst=con.prepareStatement(sql);
    		   ResultSet rs=pst.executeQuery();  
    		   HttpSession session=request.getSession(false);  
    		  String hname=request.getParameter("hospitalname");
    		  session.setAttribute("hname", hname);
    		  rs.last();
    		  int rows=rs.getRow();
    		  
    		   String arr[][]=new String[rows][4];
    		   rs.first();
    		   
    		  
    		     for(int i=0;i<rows;i++) {
    		    	
    			     for(int j=0;j<4;j++) {
    				   arr[i][j]=rs.getString(j+2);
    			     }
    			     rs.next();
    		     }
    		     
    		   
    		   
    		   
    		   request.setAttribute("res", arr);
    		   
    		   
        	   
    		   con.close();  
    		   }catch(Exception e){
    			   System.out.println(e);
    			   } 
    	   
    	   RequestDispatcher requestDispatcher = request.getRequestDispatcher("second.jsp");
    	  
           requestDispatcher.forward(request, response);
            
    		     
	}

}
