package com.monapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.monapp.model.Artiste;

@Repository
@Transactional
public class ArtisteDaoImp implements ArtisteDao {

	@PersistenceContext
	EntityManager em;
	
	public List<Artiste> findAll() {
		return em.createQuery("from Artiste a").getResultList();
	}

	public Artiste findByKey(Integer id) {
		return em.find(Artiste.class,id);
	}

	public void insert(Artiste artiste) {
		em.persist(artiste);
	}

	public Artiste update(Artiste artiste) {
		Artiste artisteMerged = em.merge(artiste);
		return artisteMerged;
	}

	public void delete(Artiste artiste) {
		Artiste artisteToDelete = em.merge(artiste);
		em.remove(artisteToDelete);
	}

	public void deleteByKey(Integer id) {
		Artiste artiste = em.find(Artiste.class,id);
		em.remove(artiste);
	}

}
