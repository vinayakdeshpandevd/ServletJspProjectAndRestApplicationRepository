package jobportal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;

public class ViewAllAction extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root",""); 
			java.sql.Statement st=con.createStatement();
			//String rollno=request.getParameter("rollno");
			PreparedStatement ps=con.prepareStatement("select * from applied");
			ResultSet rst=ps.executeQuery();
			PrintWriter p=response.getWriter();
			while(rst.next()) {
		   p.println("========================================");
		   p.println(rst.getString(1)+" "+rst.getString(2));
		   p.println("========================================");
		   p.println("FIRSTNAME          :" +rst.getString(1));
		   p.println("LASTNAME           :"+rst.getString(2));
		   p.println("MOBILE             :"+rst.getString(3));
		   p.println("GENDER             :"+rst.getString(4));
		   p.println("BIRTHDAY           :"+rst.getString(5));
		   p.println("EMAIL ID           :"+rst.getString(6));
		   p.println("QUALIFICATION      :"+rst.getString(7));
		   p.println("YEAR OF PASSING    :"+rst.getString(8));
		   p.println("TECHNOLOGIES KNOWN :"+rst.getString(9));
		   p.println("UNIVERSITY ROLL NO :"+rst.getString(10));
		   p.println("COMPANY APPLIED FOR:"+rst.getString(11));
		   p.println("JOB ROLE           :"+rst.getString(12));
		  
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}



