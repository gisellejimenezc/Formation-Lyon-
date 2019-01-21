package com.testjpa.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="DEPARTMENT_ID")
	private Department department;
	
	@ManyToMany
	@JoinTable( name="EMP_PROJ",
	joinColumns = @JoinColumn(name="EMPLOYEE_ID"),
	inverseJoinColumns = @JoinColumn(name="PROJECT_ID"))
	private Collection<Project> projects;
	
	@OneToOne
	@JoinColumn(name="COMPUTER_ID")
	private Computer computer;

	public Employee() {
		}
	
	public Employee(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Department getDepartment() {
		return department;
	}

	public Collection<Project> getProjects() {
		return projects;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setProjects(Collection<Project> projects) {
		this.projects = projects;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
		
}
