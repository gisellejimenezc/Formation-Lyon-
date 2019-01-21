package com.jeuRoles.model;

public class Human extends Humanoid {

	public Human(int x, int y, String name) {
		super(x, y, name);
	}
	
	public Human(int x, int y, String name, int maxHealthPoint, int healthPoint, int maxManaPoint, int manaPoint,
			int magicalResistance, int physicalResistance, int strength, int intelligence, int agility) {
		super(x, y, name, maxHealthPoint, healthPoint, maxManaPoint, manaPoint, magicalResistance, physicalResistance, strength,
				intelligence, agility);
		}

}
