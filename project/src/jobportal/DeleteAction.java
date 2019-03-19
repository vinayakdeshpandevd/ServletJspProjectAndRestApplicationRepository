package jobportal;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleteAction extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root",""); 
			java.sql.Statement st=con.createStatement();
			String rollno=request.getParameter("rollno");
			PreparedStatement ps=con.prepareStatement("delete from applied where rollno=?");
			ps.setString(1,rollno);
			int i=ps.executeUpdate();
			PrintWriter p=response.getWriter();
		
			HttpSession session=request.getSession();
		//session.setAttribute("delete", delete);
			if(i>0) {
				//p.println("alert(Deleted successfully);");
				//getServletContext().getRequestDispatcher("adminHome.jsp");
				session.setAttribute("message","DELETED SUCCESSFULLY");
				RequestDispatcher rd=request.getRequestDispatcher("adminHome.jsp"); 
				rd.forward(request, response);
			}
			else
			{
				//p.println("alert(not deleted plz check);");
				RequestDispatcher rd=request.getRequestDispatcher("adminHome.jsp");
				rd.forward(request, response);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
