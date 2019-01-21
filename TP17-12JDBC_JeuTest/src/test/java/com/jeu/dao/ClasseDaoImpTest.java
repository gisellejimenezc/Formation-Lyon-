package com.jeu.dao;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.jeu.model.Classe;

public class ClasseDaoImpTest {

	ClasseDaoImp classeDaoImp;
	
	@Before
	public void init() {
		classeDaoImp = new ClasseDaoImp();
	}
	
	@Test
	public void testFindAll() {
		org.junit.Assert.assertTrue(classeDaoImp.findAll().size() == 3);
	}

	@Test
	public void testFindByKey() {
		org.junit.Assert.assertTrue(classeDaoImp.findByKey(2).getName().equals("Wizard"));
	}

	@Test
	public void testInsert() {
		Classe classe = new Classe("Duende", 5, 8, 9, 6 ,4, 6);
		classeDaoImp.insert(classe);
		org.junit.Assert.assertTrue(classeDaoImp.findAll().size() == 4);
		
	}

	@Test
	public void testFindByName() {
		org.junit.Assert.assertTrue(classeDaoImp.findByName("Wizard").getName().equals("Wizard"));
	}

	@Test
	public void testUpdate() {
		Classe classe = new Classe(3, "Archer", 3, 2, 2, 5 ,0, 0);
		classeDaoImp.update(classe);
		org.junit.Assert.assertTrue(classeDaoImp.findByName("Beast").getId()== 3);
	}

	@Test
	public void testDelete() {
		Classe classe = new Classe(7, "Duende", 5, 8, 9, 6 ,4, 6);
		classeDaoImp.insert(classe);
		org.junit.Assert.assertTrue(classeDaoImp.findAll().size()==5);
		classeDaoImp.delete(classe);
		org.junit.Assert.assertTrue(classeDaoImp.findAll().size()==4);
	}

	@Test
	public void testDeleteByKey() {
		classeDaoImp.deleteByKey(4);
		org.junit.Assert.assertTrue(classeDaoImp.findAll().size()==3);
	}

}
