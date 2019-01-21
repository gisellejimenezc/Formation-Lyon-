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
 * Servlet implementation class Cart
 */
@WebServlet("/Cart")
public class Cart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cart() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("logged") != null && (boolean)session.getAttribute("logged")) {
			ArrayList<String> cart = (ArrayList<String>)session.getAttribute("cart");
			for(String product: cart) {
				response.getWriter().append(product).println();
			}
		}else {
			response.sendRedirect("Error");
		
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		ArrayList<String> cart = (ArrayList<String>)session.getAttribute("cart");
		cart.add(request.getParameter("product"));
		session.setAttribute("cart", cart);
	}

}
