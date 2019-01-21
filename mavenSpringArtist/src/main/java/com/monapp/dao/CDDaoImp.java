package com.monapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.monapp.model.CD;

@Repository
@Transactional
public class CDDaoImp implements CDDao{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<CD> findAll() {
		return em.createQuery("from CD cd").getResultList();
	}

	@Override
	public CD findByKey(Integer id) {
		return em.find(CD.class,id);
	}

	@Override
	public void insert(CD cd) {
		em.persist(cd);
	}

	@Override
	public CD update(CD cd) {
		CD cdMerged = em.merge(cd);
		return cdMerged;
	}

	@Override
	public void delete(CD cd) {
		CD cdToDelete = em.merge(cd);
		em.remove(cdToDelete);
	}

	@Override
	public void deleteByKey(Integer id) {
		CD cd = em.find(CD.class,id);
		em.remove(cd);
	}
	
	public List<CD> findByArtistId(int id) {
	    TypedQuery<CD> query = em.createQuery(
	            "SELECT c FROM CD c WHERE c.artist.id = :id", CD.class);
	    return query.setParameter("id", id).getResultList();

	}

}
