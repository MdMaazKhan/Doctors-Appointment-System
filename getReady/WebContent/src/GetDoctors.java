

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
    	  // System.out.println("in GetDoctors "+request.getParameter("hospitalname") );
    	   try{  
    		  // Class.forName("com.mysql.jdbc.Driver");  
    		   Connection con=DriverManager.getConnection(  
    		   "jdbc:mysql://localhost:3306/doctorsdb","root","Maaz@Khan777");  
    		 String sql="select * from DoctorsInfo where HospitalName='"+request.getParameter("hospitalname")+"'";
    		  PreparedStatement pst=con.prepareStatement(sql);
    		   ResultSet rs=pst.executeQuery();  
    		   //request.setAttribute("res", rs);
//    		   ArrayList<String> hn=new ArrayList<String>();
//    		   ArrayList<String> dn=new ArrayList<String>();
//    		   ArrayList<String> aoe=new ArrayList<String>();
//    		   ArrayList<String> time=new ArrayList<String>();
    		   HttpSession session=request.getSession(false);  
    		  String hname=request.getParameter("hospitalname");
    		  session.setAttribute("hname", hname);
    		  rs.last();
    		  int rows=rs.getRow();
    		  
    		   String arr[][]=new String[rows][4];
    		   rs.first();
    		   
    		  
    		     for(int i=0;i<rows;i++) {
    		    	// if(!rs.next())break;
    			     for(int j=0;j<4;j++) {
    				   arr[i][j]=rs.getString(j+2);
    			     }
    			     rs.next();
    		     }
    		     
    		   
    		   
//    		   while(rs.next())
//    		   {
//    		   al.add(alNew.add(rs.getString(2))+"  "+alNew.add(rs.getString(3))+"  "+alNew.add(rs.getString(4))+"  "+alNew.add(rs.getString(5)));
//    		   hn.add(rs.getString(2));
//    		   dn.add(rs.getString(3));
//    		   aoe.add(rs.getString(4));
//    		   time.add(rs.getString(5));
//    		   
//    		   }
    		   
//    		   request.setAttribute("res1", hn);
//    		   request.setAttribute("res2", dn);
//    		   request.setAttribute("res3", aoe);
    		   request.setAttribute("res", arr);
    		   //System.out.println(hn);
    		   //System.out.println("dn");
    		   
        	   
    		   con.close();  
    		   }catch(Exception e){
    			   System.out.println(e);
    			   } 
    	   
    	   RequestDispatcher requestDispatcher = request.getRequestDispatcher("second.jsp");
    	  
           requestDispatcher.forward(request, response);
            
    		     
	}//"select * from DoctorsInfo where HospitalName='"+request.getParameter("hospitalname")+"'"

}
