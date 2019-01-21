package com.testjpa.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.testjpa.model.Department;
import com.testjpa.model.Employee;
import com.testjpa.utils.Application;

public class DepartmentDaoImp implements DepartmentDao {

	@Override
	public List<Department> findAll() {
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		List<Department> l = new ArrayList<>();
		try {
			em.getTransaction().begin();
			Query q = em.createQuery("select dep from Department dep");
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
	public Department findByKey(Integer id) {
		Department department = new Department();
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			department = em.find(Department.class, id);
			System.out.println(department);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction() != null)
				em.getTransaction().rollback();
		} finally {
			em.close();
		}
		return department;
	}

	@Override
	public void insert(Department department) {
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(department);
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
	public void update(Department department) {
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(department);
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
	public void delete(Department department) {
		EntityManager em = Application.getInstance().getEmf().createEntityManager();
		try {
			Department depToDelete = em.find(Department.class, department.getId());
			if (depToDelete != null) {
				em.getTransaction().begin();
				em.remove(depToDelete);
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
			Department department = em.find(Department.class, id);
			if (department != null) {
				System.out.println("Found");
				em.getTransaction().begin();
				em.remove(department);
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
