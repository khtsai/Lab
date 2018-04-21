package Lab5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exercise13b  extends HttpServlet{
	
	public void doGet (HttpServletRequest req,
						HttpServletResponse res)
		throws ServletException, IOException
		{
			PrintWriter out = res.getWriter();
			Enumeration<String> enumeration= req.getParameterNames();
			while (enumeration.hasMoreElements()) {
				String parameterName = (String) enumeration.nextElement();
				String parameterValue = req.getParameter(parameterName);
				out.println("url parameter name: " + parameterName + 
						"url parameter value: "+ parameterValue);
			}
			
		}
	
			
}
