package com.jeu.model;

public class Classe {

	private int id;
	private String name;
	private int strengthModifier;
	private int resistanceModifier;
	private int intelligenceModifier;
	private int agilityModifier;
	private int charismModifier;
	private int luckModifier;
	
	public Classe(int id, String name, int strengthModifier, int resistanceModifier, int intelligenceModifier,
			int agilityModifier, int charismModifier, int luckModifier) {
		this.id = id;
		this.name = name;
		this.strengthModifier = strengthModifier;
		this.resistanceModifier = resistanceModifier;
		this.intelligenceModifier = intelligenceModifier;
		this.agilityModifier = agilityModifier;
		this.charismModifier = charismModifier;
		this.luckModifier = luckModifier;
	}
	
	public Classe(String name, int strengthModifier, int resistanceModifier, int intelligenceModifier,
			int agilityModifier, int charismModifier, int luckModifier) {
		this.name = name;
		this.strengthModifier = strengthModifier;
		this.resistanceModifier = resistanceModifier;
		this.intelligenceModifier = intelligenceModifier;
		this.agilityModifier = agilityModifier;
		this.charismModifier = charismModifier;
		this.luckModifier = luckModifier;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getStrengthModifier() {
		return strengthModifier;
	}

	public int getResistanceModifier() {
		return resistanceModifier;
	}

	public int getIntelligenceModifier() {
		return intelligenceModifier;
	}

	public int getAgilityModifier() {
		return agilityModifier;
	}

	public int getCharismModifier() {
		return charismModifier;
	}

	public int getLuckModifier() {
		return luckModifier;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStrengthModifier(int strengthModifier) {
		this.strengthModifier = strengthModifier;
	}

	public void setResistanceModifier(int resistanceModifier) {
		this.resistanceModifier = resistanceModifier;
	}

	public void setIntelligenceModifier(int intelligenceModifier) {
		this.intelligenceModifier = intelligenceModifier;
	}

	public void setAgilityModifier(int agilityModifier) {
		this.agilityModifier = agilityModifier;
	}

	public void setCharismModifier(int charismModifier) {
		this.charismModifier = charismModifier;
	}

	public void setLuckModifier(int luckModifier) {
		this.luckModifier = luckModifier;
	}

	@Override
	public String toString() {
		return  id + ", " + name + ", strengthModifier = " + strengthModifier
				+ ", resistanceModifier = " + resistanceModifier + ", intelligenceModifier = " + intelligenceModifier
				+ ", agilityModifier = " + agilityModifier + ", charismModifier = " + charismModifier + ", luckModifier = "
				+ luckModifier;
	}
		
		
}
