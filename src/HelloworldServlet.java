import javax.servlet.*;
import java.io.IOException;
 
 
 public class HelloworldServlet extends GenericServlet
 
{
	public static void service(ServletRequest request,ServletResponse response) throws ServletException,IOException
	{
		System.out.println("Hello World!");
	}
}
