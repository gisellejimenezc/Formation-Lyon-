package com.monapp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monapp.model.Artist;
import com.monapp.model.CD;

@Repository
@Transactional
public class ArtistDaoImp implements ArtistDao{

	@PersistenceContext
	EntityManager em;
	
	public List<Artist> findAll() {
		return em.createQuery("from Artist artist").getResultList();
	}

	public Artist findByKey(Integer id) {
		return em.find(Artist.class,id);
	}

	public void insert(Artist artist) {
		em.persist(artist);
	}

	public Artist update(Artist artist) {
		Artist artisteMerged = em.merge(artist);
		return artisteMerged;
	}

	public void delete(Artist artist) {
		Artist artistToDelete = em.merge(artist);
		em.remove(artistToDelete);
	}

	public void deleteByKey(Integer id) {
		Artist artist = em.find(Artist.class,id);
		em.remove(artist);
	}
	
	

}
