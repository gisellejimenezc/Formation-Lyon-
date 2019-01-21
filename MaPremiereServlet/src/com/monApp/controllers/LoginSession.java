package com.monApp.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MaPremiereServlet
 */
@WebServlet("/LoginSession")
public class LoginSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = (request.getParameter("action")!= null ? request.getParameter("action"): "");
		
		switch(action) {
		case "logout" :
			request.getSession().invalidate();
			response.getWriter().append("Logged out");
			break;
		default:
			request.getRequestDispatcher("pages/loginForm.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		List<String> cart = new ArrayList<String>();
		
		HttpSession session = request.getSession();
		
		if (name.equals("Julio") && password.equals("hello")) { 
			session.setAttribute("logged", true);
			session.setAttribute("name", name);
			session.setAttribute("cart", cart);
			response.sendRedirect("welcome");
		}else {
			//response.getWriter().append("Error");
			response.sendRedirect("Error");
		}
	}

}
