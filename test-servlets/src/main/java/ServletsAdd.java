import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebServlet("/add")
public class ServletsAdd extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
//		1.without dispatcher:
//		req.setAttribute("k",k);
////	System.out.println(k);
//		PrintWriter obj=res.getWriter();
//		obj.println("the sum is : " + k);
		
//		2.dispatcher way:
//		RequestDispatcher rd=req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
//		3.redirecting using sendRedirect() (with & without session) :
//		HttpSession session =req.getSession();
//		session.setAttribute("k", k);
		
//		4.Using cookies :
		Cookie cookie = new Cookie("k", k+"");
		res.addCookie(cookie);
		res.sendRedirect("sq"); // in case we don't want to do url rewriting
	}
}
