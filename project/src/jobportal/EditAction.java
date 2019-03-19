package jobportal;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EditAction extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root",""); 
			java.sql.Statement st=con.createStatement();
			String rollno=request.getParameter("rollno");
			PreparedStatement ps=con.prepareStatement("select * from applied where rollno=?");
			ps.setString(1,rollno);
			ResultSet rs=ps.executeQuery();
			HttpSession session=request.getSession();
			while(rs.next()) {
			session.setAttribute("fname",rs.getString(1));
			session.setAttribute("lname",rs.getString(2));
			session.setAttribute("mobile",rs.getString(3));
			session.setAttribute("gender",rs.getString(4));
			session.setAttribute("birthday",rs.getString(5));
			session.setAttribute("email",rs.getString(6));
			session.setAttribute("qualification",rs.getString(7));
			session.setAttribute("year",rs.getString(8));
			session.setAttribute("technologies",rs.getString(9));
			session.setAttribute("rollno",rs.getString(10));
			session.setAttribute("company",rs.getString(11));
			session.setAttribute("jobrole",rs.getString(12));
			getServletContext().getRequestDispatcher("/editvalues.jsp").forward(request, response);
		}}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}
