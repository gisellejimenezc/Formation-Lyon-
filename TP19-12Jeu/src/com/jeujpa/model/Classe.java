package com.jeujpa.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Classe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private int strengthModifier;
	private int resistanceModifier;
	private int intelligenceModifier;
	private int agilityModifier;
	private int charismModifier;
	private int luckModifier;
	
	public Classe() {
		
	}
	
			
}
