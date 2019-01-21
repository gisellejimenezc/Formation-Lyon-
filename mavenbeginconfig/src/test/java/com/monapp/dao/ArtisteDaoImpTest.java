package com.monapp.dao;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.monapp.config.ContextConfig;
import com.monapp.model.Artiste;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ContextConfig.class})
public class ArtisteDaoImpTest {

	@Autowired
	ArtisteDao aDao;
	
	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByKey() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		int size = aDao.findAll().size();
		Artiste a = new Artiste("Perez", "Juan");
		aDao.insert(a);
		assertNotNull(a.getId());
		assertTrue(size + 1 == aDao.findAll().size());
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteByKey() {
		fail("Not yet implemented");
	}

}
