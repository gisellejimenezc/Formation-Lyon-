package com.company.model;

public class Employee {
	private int id;
	private String name;
	private String lastName;
	private double salary;
	private AccountNumber accountNumber;
	private Status status;
	
	public Employee() {}

	public Employee(int id, String name, String lastName, double salary, AccountNumber accountNumber, Status status) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
		this.accountNumber = accountNumber;
		this.status = status;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public AccountNumber getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(AccountNumber accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastName=" + lastName + ", salary=" + salary
				+ ", accountNumber=" + accountNumber + ", status=" + status + "]";
	}


}
