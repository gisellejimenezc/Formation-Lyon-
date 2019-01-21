package com.Jeu.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testjpa.dao.EmployeeDao;
import com.testjpa.dao.EmployeeDaoImp;
import com.testjpa.model.Employee;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDaoImp edao;  // Pour recuperer les donnes de la BD
	//EmployeeDao edao = new EmployeeDaoImp();
	Employee e;
	
    public EmployeeServlet() {
        super();
        edao = new EmployeeDaoImp();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
	    if(action == null) {action = "list";}
	    
		
	    switch(action) {
	    
	    case "list":
	    	List<Employee> employees = edao.findAll(); // Pour recuperer les donnes de la BD
			//for(Employee e : employees) {System.out.println(e);}
			request.setAttribute("employeesList", employees);  // pour assigner la valeur des donnees recuperes a la variable que l'on va utiliser pour l'affichage
			request.getRequestDispatcher("pages/Employees/list.jsp").forward(request, response);; // pour envoyer les donnes au fichiers jsp
		    break;
		    
	    case "delete":
	    	int id = Integer.parseInt(request.getParameter("id"));
	    	e = edao.findByKey(id);
	    	edao.delete(e);
	    	response.sendRedirect("EmployeeServlet?action=list");
	    	break;
	    	
	    case "create":
	    	e = new Employee();
	    	request.setAttribute("employee", e);
	    	request.getRequestDispatcher("pages/Employees/createEmployee.jsp").forward(request, response);
	    	break;
	    
	    case "update":
	    	id = Integer.parseInt(request.getParameter("id"));
	    	e = edao.findByKey(id);
	    	request.setAttribute("employee", e);
	    	request.getRequestDispatcher("pages/Employees/createEmployee.jsp").forward(request, response);
	    	break;
	    }
		
	    	    
	  }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id"); // ajouté pour update
		String name = request.getParameter("name");  // 1, 2, 3 are enough to create a new employee. This is 1
			
		e.setName(name);						//This is 2			
		if(id.equals("")) {
			edao.insert(e);							//This is 3
		}else {
			e.setId(Integer.parseInt(id));
			edao.update(e);
		}
		response.sendRedirect("EmployeeServlet?action=list");
	}

}
