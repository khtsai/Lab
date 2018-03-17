package Lab2;
import java.io.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.util.Enumeration;

public class Exercise5 extends HttpServlet{
	
	public void doGet (HttpServletRequest req,
						HttpServletResponse res)
		throws ServletException, IOException
		{
			PrintWriter out = res.getWriter();
			Enumeration<String> enumeration= req.getParameterNames();
			while (enumeration.hasMoreElements()) {
				String parameterName = (String) enumeration.nextElement();
				String parameterValue = req.getParameter(parameterName);
				out.println("url parameter name: " + parameterName + "url parameter value: "+ parameterValue);
			}
			
		}
	
}