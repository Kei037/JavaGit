package com.varxyz.jv300.mod002;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pageTitle = "Hello world";
		String test = "서블릿 JSP";
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>" + pageTitle + "\n" + test + "</title></head>");
		out.println("<body>");
		out.println("<h3> Welcome to 서블릿 프로그래밍 </h3>");
		out.println("<p> 동시성문제 </p>");
		out.println("</body></html>");
		out.close();
		
	}
}
