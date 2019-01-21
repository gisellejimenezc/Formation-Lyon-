package com.monapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.monapp.model.Llama;

@Repository
@Transactional
public class LLamaDaoImp implements LlamaDao {

	@PersistenceContext
	EntityManager em;
	
	public List<Llama> findAll() {
		return em.createQuery("from Llama llama").getResultList();
	}

	public Llama findByKey(Integer id) {
		return em.find(Llama.class,id);
	}

	public void insert(Llama llama) {
		em.persist(llama);
		
	}

	public Llama update(Llama llama) {
		Llama llamaMerged = em.merge(llama);
		return llamaMerged;
	}

	public void delete(Llama llama) {
		Llama llamaToDelete = em.merge(llama);
		em.remove(llamaToDelete);
	}

	public void deleteByKey(Integer id) {
		Llama llama = em.find(Llama.class,id);
		em.remove(llama);
	}

}
