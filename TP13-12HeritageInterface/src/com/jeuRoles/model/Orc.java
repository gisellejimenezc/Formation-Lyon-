package com.jeuRoles.model;

public class Orc extends Humanoid {

	public Orc(int x, int y, String name) {
		super(x, y, name);
	}
	
	public Orc(int x, int y, String name, int maxHealthPoint, int healthPoint, int maxManaPoint, int manaPoint,
			int magicalResistance, int physicalResistance, int strength, int intelligence, int agility) {
		super(x, y, name, maxHealthPoint, healthPoint, maxManaPoint, manaPoint, magicalResistance, physicalResistance, strength,
				intelligence, agility);
	}

}
