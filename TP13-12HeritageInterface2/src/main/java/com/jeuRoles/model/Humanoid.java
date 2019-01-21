package com.jeuRoles.model;

import com.jeuRoles.Interface.Movable;

public class Humanoid extends Being implements Movable {
	
	protected int strength;
	protected int intelligence;
	protected int agility;
	
	public Humanoid(int x, int y, String name) {
		super(x, y, name);
	}

	public Humanoid(int x, int y, String name, int strength, int intelligence, int agility) {
		super(x, y, name);
		this.strength = strength;
		this.intelligence = intelligence;
		this.agility = agility;
	}
	
	public Humanoid(int x, int y, String name, int maxHealthPoint, int healthPoint, int maxManaPoint, int manaPoint, int magicalResistance,
			int physicalResistance, int strength, int intelligence, int agility) {
		super(x, y, name, maxHealthPoint, healthPoint, maxManaPoint, manaPoint, magicalResistance, physicalResistance);
		this.strength = strength;
		this.intelligence = intelligence;
		this.agility = agility;
	}

	public void attack(Being b) {
		if(b.y == 0) {
			if(b instanceof Orc) {
				b.healthPoint = (b.healthPoint- (int) Math.floor(this.strength/2));
				System.out.println(b.name + " lost " + (int) Math.floor(this.strength/2) + " points of health !");
			}else {
				b.healthPoint = (b.healthPoint- this.strength);
				System.out.println(b.name + " lost " + this.strength + " points of health!");
			}
		}
		else {
			System.out.println("The attack is not allow while your enemy is flying");
		}
	}
	
	@Override
	public void goRight(int step) {
		this.x += step;
	}

	@Override
	public void goLeft(int step) {
		this.x -= step;
	}

	@Override
	public void goUp(int step) {
		this.y += step;
	}

	@Override
	public void goDown(int step) {
		this.y -= step;
	}

	public int getStrength() {
		return strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getAgility() {
		return agility;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}
	
			
}
