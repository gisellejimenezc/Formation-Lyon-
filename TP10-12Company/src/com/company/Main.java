package com.company;


import com.company.model.AccountNumber;
import com.company.model.Company;
import com.company.model.Employee;
import com.company.model.Status;

public class Main {

	public static void main(String[] args) {
		
		AccountNumber accountNumber1 = new AccountNumber(200, "LCL");
		Status status1 = new Status(true, 2018);
		Employee employee1 = new Employee(1, "Jairo", "Martinez", 15000, accountNumber1, status1);

		AccountNumber accountNumber2 = new AccountNumber(300, "LCL");
		AccountNumber accountNumber3 = new AccountNumber(400, "LCL");		
		Employee employee2 = new Employee(2, "Carlos", "Calderon", 15000, accountNumber2, status1);
		Employee employee3 = new Employee(3, "Julio", "Bolagnos", 15000, accountNumber3, status1);
		
		
		Company company = new Company("Inc com");
		company.addEmployee(employee1);
		company.addEmployee(employee2);
		company.addEmployee(employee3);
		
		System.out.println(company.toString());
		
		company.removeEmployeeById(2);
		System.out.println(company.toString());
		company.removeEmployeeById(3);
		System.out.println(company.toString());
		
	}

}
