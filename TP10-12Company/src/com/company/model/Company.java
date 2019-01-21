package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Company {

	String nom;
	List<Employee> employees = new ArrayList<Employee>();
	
	public Company() {}

	public Company(String nom) {
		super();
		this.nom = nom;
	}

	public Company(String nom, List<Employee> employees) {
		super();
		this.nom = nom;
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Company [nom=" + nom + ", employees=" + employees + "]";
	}
	
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}
	
	public void removeEmployeeById(int id) {
		for (int i=0; i <  this.employees.size(); i++){
			if (this.employees.get(i).getId() == id){
				this.employees.remove(employees.get(i));
			}
		}
	}
	
}
