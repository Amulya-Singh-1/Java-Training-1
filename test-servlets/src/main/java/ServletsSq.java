
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebServlet("/sq")
public class ServletsSq extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		int val = Integer.parseInt(req.getParameter("k"));
//		System.out.println(val);
		
//		HttpSession session =req.getSession();
//		int val= (int) session.getAttribute("k");
//		val = val * val;
		
		int val=0;
		Cookie cookies[] =req.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				val=Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter obj = res.getWriter();
		obj.println("square of the number is : " + val*val);
	}
}
