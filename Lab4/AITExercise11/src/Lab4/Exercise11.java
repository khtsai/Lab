package Lab4;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.Enumeration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise11 extends HttpServlet{
	
	public void doGet (HttpServletRequest req,
						HttpServletResponse res)
		throws ServletException, IOException
		{
			String dbname = "jdbc:postgresql://localhost:5432/AIT";
			String driver = "org.postgresql.Driver";
			PrintWriter out = res.getWriter();
			//out.println("Testing!!");
			try {
				Class.forName(driver);
				Connection con;
				con = DriverManager.getConnection(dbname, "postgres", "Airny719");
				
				Statement statement = con.createStatement();
				String sql = "select * from users";
				ResultSet rs = statement.executeQuery(sql);
				while (rs.next()) {
					out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("lastname") + "<br>");
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				out.println(e.toString());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				out.println(e.toString());
			}
		}
	
}