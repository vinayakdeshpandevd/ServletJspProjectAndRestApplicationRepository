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

public class ViewAction extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root",""); 
			java.sql.Statement st=con.createStatement();
			String rollno=request.getParameter("rollno");
			PreparedStatement ps=con.prepareStatement("select * from applied where rollno=?");
			ps.setString(1,rollno);
			ResultSet rst=ps.executeQuery();
			PrintWriter p=response.getWriter(); 
			response.setContentType("text/html");
			p.println("<table>");
			p.println("<center>");
			while(rst.next()) {
				/*p.println("<tr>");				
				p.println("<td>FIRSTNAME</td>");
				  p.println("<td>"+rst.getString(1)+"</td>");
				  p.println("</tr>");	*/	
		   p.println("<html>");
		   p.println("<body>");
		   p.println("<center>");
		   p.println("<table border='5'>");
		   p.println("<tr>");
		   p.println("<td>FIRSTNAME</td>");
		   p.println("<td>"+rst.getString(1)+"</td>");
	        p.println("</tr>");
	        p.println("<tr>");
			   p.println("<td>LASTNAME</td>");
			   p.println("<td>"+rst.getString(2)+"</td>");
		        p.println("</tr>");
		        p.println("<tr>");
				   p.println("<td>MOBILE</td>");
				   p.println("<td>"+rst.getString(3)+"</td>");
			        p.println("</tr>");
			        p.println("<tr>");
					   p.println("<td>GENDER</td>");
					   p.println("<td>"+rst.getString(4)+"</td>");
				        p.println("</tr>");
				        p.println("<tr>");
						   p.println("<td>BIRTHDAY</td>");
						   p.println("<td>"+rst.getString(5)+"</td>");
					        p.println("</tr>");
					        p.println("<tr>");
							   p.println("<td>EMAIL ID</td>");
							   p.println("<td>"+rst.getString(6)+"</td>");
						        p.println("</tr>");
						        p.println("<tr>");
								   p.println("<td>QUALIFICATION</td>");
								   p.println("<td>"+rst.getString(7)+"</td>");
							        p.println("</tr>");
							        p.println("<tr>");
									   p.println("<td>YEAR OF PASSING</td>");
									   p.println("<td>"+rst.getString(8)+"</td>");
								        p.println("</tr>");
								        p.println("<tr>");
										   p.println("<td>TECHNOLOGIES KNOWN</td>");
										   p.println("<td>"+rst.getString(9)+"</td>");
									        p.println("</tr>");
									        p.println("<tr>");
											   p.println("<td>UNIVERSITY ROLL NO.</td>");
											   p.println("<td>"+rst.getString(10)+"</td>");
										        p.println("</tr>");
										        p.println("<tr>");
												   p.println("<td>COMPANY APPLIED FOR</td>");
												   p.println("<td>"+rst.getString(11)+"</td>");
											        p.println("</tr>");
											        p.println("<tr>");
													   p.println("<td>JOB ROLE</td>");
													   p.println("<td>"+rst.getString(12)+"</td>");
												        p.println("</tr>");
		/*   p.println("FIRSTNAME           :"+rst.getString(1));
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
		   p.println("JOB ROLE           :"+rst.getString(12));*/
		   p.println("</table>");
		   p.println("</center>");
		   p.println("</body>");
		   p.println("</html>");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


