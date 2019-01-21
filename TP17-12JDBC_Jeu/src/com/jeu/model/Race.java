package com.jeu.model;

public class Race {

	private int id;
	private String name;
	private int strength;
	private int resistance;
	private int intelligence;
	private int agility;
	private int charism;
	private int luck;
	
	public Race(int id, String name, int strength, int resistance, int intelligence, int agility, int charism,
			int luck) {
		this.id = id;
		this.name = name;
		this.strength = strength;
		this.resistance = resistance;
		this.intelligence = intelligence;
		this.agility = agility;
		this.charism = charism;
		this.luck = luck;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getStrength() {
		return strength;
	}

	public int getResistance() {
		return resistance;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getAgility() {
		return agility;
	}

	public int getCharism() {
		return charism;
	}

	public int getLuck() {
		return luck;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public void setCharism(int charism) {
		this.charism = charism;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	@Override
	public String toString() {
		return id + " , " + name + ", strength = " + strength + ", resistance = " + resistance
				+ ", intelligence = " + intelligence + ", agility = " + agility + ", charism = " + charism + ", luck = " + luck;
	}

	
}
