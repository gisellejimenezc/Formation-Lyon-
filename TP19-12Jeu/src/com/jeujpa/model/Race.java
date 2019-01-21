package com.jeujpa.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Race {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	 
	private String name;
	private int strength;
	private int resistance;
	private int intelligence;
	private int agility;
	private int charism;
	private int luck;
	
	public Race() {
	
	}
	
		
}
