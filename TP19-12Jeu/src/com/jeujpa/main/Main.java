package com.jeujpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jeujpa.model.Quest;

public class Main {
	
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JeuJpa");
		EntityManager em = emf.createEntityManager();
		
		//em.getTransaction().begin();
		
		/*Quest q = em.find(Quest.class, 1);
		System.out.println(q);
		System.out.println(em.contains(q));*/ //Trouve un element de la BD
		
		/*Quest quest =new Quest();
		quest.setName("quest4");
		quest.setXpGain(5);
		em.persist(quest);
		em.getTransaction().commit();*/ // Ajoute une entree dans la BD
		
		/*Quest quest = em.find(Quest.class, 1);
		if(quest != null) {
			System.out.println("Found");
			em.getTransaction().begin();
			em.remove(quest);
			em.getTransaction().commit();
			System.out.println("Removed");
		}else {
			System.out.println("Not found");
		}*/ //Efface une entrede la bd
		
		/*em.getTransaction().begin();
		Quest quest = new Quest();
		quest.setId(2);
		Quest mergeQuest = em.merge(quest);
		System.out.println(mergeQuest);
		em.getTransaction().commit();*/ // Merge : S'elle existe pas la cree, sinon il fait un update
		
		em.getTransaction().begin();
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
	}
}
