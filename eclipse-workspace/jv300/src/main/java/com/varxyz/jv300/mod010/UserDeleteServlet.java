package com.varxyz.jv300.mod010;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.varxyz.jv300.mod009.UserDao;
import com.varxyz.jv300.mod009.UserService;

@WebServlet("/mod010/user_delete")
public class UserDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	
	public void init(ServletConfig config) throws ServletException {
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		userService = UserService.getService();
		userService = new UserService(new UserDao());
		
		String userId = request.getParameter("userId");
		String passwd = request.getParameter("passwd");
		
		RequestDispatcher dispatcher = null;
		
		userService.userDelete(userId, passwd);
		
		dispatcher = request.getRequestDispatcher("/mod009/sucess.jsp");
		dispatcher.forward(request, response);
	}

}
