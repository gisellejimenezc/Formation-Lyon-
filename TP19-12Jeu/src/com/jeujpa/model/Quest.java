package com.jeujpa.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Quest {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
		
	private String name;
	private int xpGain;
	
	@ManyToMany(mappedBy="quests")
	private Collection<Perso> persons;

	public Quest() {
		
	}
		
	public Quest(int id, String name, int xpGain, Collection<Perso> persons) {
		this.id = id;
		this.name = name;
		this.xpGain = xpGain;
		this.persons = persons;
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getXpGain() {
		return xpGain;
	}

	public Collection<Perso> getPersons() {
		return persons;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setXpGain(int xpGain) {
		this.xpGain = xpGain;
	}

	public void setPersons(Collection<Perso> persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "Quest [id=" + id + ", name=" + name + ", xpGain=" + xpGain + ", persons=" + persons + "]";
	}
	
	
	
	
	
}
