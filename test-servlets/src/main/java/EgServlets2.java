import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/home")
public class EgServlets2 extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter obj = res.getWriter();
//		obj.println("hii");
		
//		servlet-context:
//		ServletContext ctx=req.getServletContext();
//		obj.println("hii " + ctx.getInitParameter("name"));
		
//		servlet-config:
		ServletConfig cg = getServletConfig();
		obj.println("<html><body bgcolor='grey'>");
		obj.println("hii " + cg.getInitParameter("alias"));
		obj.println("</body> </html>");
	}

}
