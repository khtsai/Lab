package Lab2;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class Excercise4 extends HttpServlet{
	
	public void doGet (HttpServletRequest requ,
						HttpServletResponse res)
		throws ServletException, IOException
		{
			PrintWriter out = res.getWriter();
			Date date = new Date();
			out.println("Hello world!");
			out.println("Current time is " + date.toString());
			out.close();
		}
	
}