package com.jeujpa.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


@Entity
public class Perso {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="RACE_ID")
	private Race race;
	
	@ManyToOne
	@JoinColumn(name="CLASSE_ID")
	private Classe classe;
	
	@ManyToOne
	@JoinColumn(name="PLAYER_ID")
	private User user;
	
	@ManyToMany
	@JoinTable( name="perso_quest",
	joinColumns = @JoinColumn(name="quest_id"),
	inverseJoinColumns = @JoinColumn(name="perso_id"))
	private Collection<Quest> quests;

	public Perso() {
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Race getRace() {
		return race;
	}

	public Classe getClasse() {
		return classe;
	}

	public User getUser() {
		return user;
	}

	public Collection<Quest> getQuests() {
		return quests;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setQuests(Collection<Quest> quests) {
		this.quests = quests;
	}
	
	
	
}
