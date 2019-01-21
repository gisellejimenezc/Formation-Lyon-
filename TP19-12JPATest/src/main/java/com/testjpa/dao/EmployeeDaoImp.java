package com.testjpa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.testjpa.model.Employee;
import com.testjpa.utils.Application;

public class EmployeeDaoImp implements EmployeeDao {

	// App to getEMf remplace le EntitityManagerFactory

	@Override
	public List<Employee> findAll() {
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		List<Employee> l = new ArrayList<>();
		try {
			em.getTransaction().begin();
			Query q = em.createQuery("select emp from Employee emp");
			l = q.getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction() != null)
				em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return l;

	}

	@Override
	public Employee findByKey(Integer id) {
		Employee employee = new Employee();
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			employee = em.find(Employee.class, id);
			System.out.println(employee);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction() != null)
				em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return employee;
	}

	@Override
	public void insert(Employee employee) {
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction() != null)
				em.getTransaction().rollback();
		} finally {
			em.close();
		}

	}

	public Employee updateE(Employee employee) {
		Employee empUpdated = new Employee();
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(employee);
			empUpdated = em.find(Employee.class, employee.getId());
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction() != null)
				em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return empUpdated;
	}
	
	@Override
	public void update(Employee employee) {
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(employee);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction() != null)
				em.getTransaction().rollback();
		} finally {
			em.close();
		}
			}

	@Override
	public void delete(Employee employee) {
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		try {
			Employee empToDelete = em.find(Employee.class, employee.getId());
			if (empToDelete != null) {
				em.getTransaction().begin();
				em.remove(empToDelete);
				em.getTransaction().commit();
				System.out.println("Removed");
			} else {
				System.out.println("Not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction() != null)
				em.getTransaction().rollback();
		} finally {
			em.close();
		}

	}

	@Override
	public void deleteByKey(Integer id) {
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		try {
			Employee employee = em.find(Employee.class, id);
			if (employee != null) {
				System.out.println("Found");
				em.getTransaction().begin();
				em.remove(employee);
				em.getTransaction().commit();
				System.out.println("Removed");
			} else {
				System.out.println("Not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction() != null)
				em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

}
