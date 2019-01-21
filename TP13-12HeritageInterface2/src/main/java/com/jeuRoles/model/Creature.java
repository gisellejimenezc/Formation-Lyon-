package com.jeuRoles.model;

import com.jeuRoles.Interface.Movable;

public abstract class Creature extends Being implements Movable {
	
	protected int strength;

	public Creature(int x, int y, String name) {
		super(x, y, name);
	}

	public Creature(int x, int y, String name, int strength) {
		super(x, y, name);
		this.strength = strength;
	}
	
	public Creature(int x, int y, String name, int maxHealthPoint, int healthPoint, int maxManaPoint, int manaPoint, int magicalResistance,
			int physicalResistance, int strength) {
		super(x, y, name);
		this.maxHealthPoint = maxHealthPoint;
		this.healthPoint = healthPoint;
		this.maxManaPoint = maxManaPoint;
		this.manaPoint = manaPoint;
		this.magicalResistance = magicalResistance;
		this.physicalResistance = physicalResistance;
		this.strength = strength;
	}
	
	public void attack(Being b) {
		if(b.y == 0) {
			if(b instanceof Orc) {
				b.healthPoint = (b.healthPoint- (int) Math.floor(this.strength/2));
				System.out.println("The orc lost " + (int) Math.floor(this.strength/2) + " points of health !");
			}else {
				b.healthPoint = (b.healthPoint- this.strength);
				System.out.println("The humanoid lost " + this.strength + " points of health!");
			}
		}else {
			System.out.println("The attack is not allow while your enemy is flying");
		}
	}
		
}
