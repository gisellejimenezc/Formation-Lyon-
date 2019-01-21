package com.testjpa.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.testjpa.model.Employee;

public class EmployeeDaoImpTest {
	
	EmployeeDaoImp employeeDaoImp;
	
	@Before
	public void init() {
		employeeDaoImp = new EmployeeDaoImp();
	}

	/*@Test
	public void testFindAll() {
		org.junit.Assert.assertTrue(employeeDaoImp.findAll().size() == 4);
	}

	@Test
	public void testFindByKey() {
		org.junit.Assert.assertTrue(employeeDaoImp.findByKey(5).getName().equals("Kendall"));
	}*/

	/*@Test
	public void testInsert() {
		Employee e2 = new Employee("Adriano");
		employeeDaoImp.insert(e2);
		org.junit.Assert.assertTrue(employeeDaoImp.findAll().size() == 4);
	}

	@Test
	public void testUpdate() {
		Employee e3 = new Employee();
		e3.setId(6);
		e3.setName("Benito");
		employeeDaoImp.update(e3);
		org.junit.Assert.assertTrue(employeeDaoImp.findByKey(6).getName().equals("Benito"));
	}*/

	/*@Test
	public void testDelete() {
		Employee e3 = new Employee();
		e3.setId(6);
		employeeDaoImp.delete(e3);
		org.junit.Assert.assertTrue(employeeDaoImp.findAll().size() == 3);
	}*/

	@Test
	public void testDeleteByKey() {
		employeeDaoImp.deleteByKey(7);
		org.junit.Assert.assertTrue(employeeDaoImp.findAll().size() == 2);
	}

}
