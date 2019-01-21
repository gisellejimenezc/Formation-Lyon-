package com.testjpa.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.testjpa.dao.EmployeeDaoImp;
import com.testjpa.model.Computer;
import com.testjpa.model.Department;
import com.testjpa.model.Employee;
import com.testjpa.model.Project;
import com.testjpa.utils.Application;

public class Main {

	public static void main(String[] args) {
		
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("testJpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		Employee e = new Employee();
		e.setName("Kendall");
		Computer c = new Computer();
		e.setComputer(c);
		Department d = new Department();
		d.setName("R&D");
		e.setDepartment(d);
		Project p1 = new Project("Testing");
		Project p2 = new Project("Writing");
		List<Project> projects = new ArrayList<Project>();
		projects.add(p1);
		projects.add(p2);
		e.setProjects(projects);
		Employee e1 = new Employee();
		e1.setName("Marshall");
		e1.setProjects(projects);
		
		em.persist(e);
		em.persist(e1);
		em.persist(c);
		em.persist(d);
		em.persist(p1);
		em.persist(p2);
				
		em.getTransaction().commit();
		
		em.close();
		emf.close();*/
		
		/*EmployeeDaoImp employeeDaoImp = new EmployeeDaoImp();
		List<Employee> l = employeeDaoImp.findAll();
		for (int i=0; i<l.size(); i++) {
			System.out.println(l.toString());
		}
		
		employeeDaoImp.findByKey(1);*/
		
		//Employee e2 = new Employee("Adriano");
		//e.setId(3);
		EmployeeDaoImp employeeDaoImp = new EmployeeDaoImp();
		//employeeDaoImp.insert(e2);
		//1employeeDaoImp.delete(e);
		
		Employee e3 = new Employee();
		e3.setId(6);
		e3.setName("Mario");
		employeeDaoImp.update(e3);
		
				
		Application.stop();

	}

}
