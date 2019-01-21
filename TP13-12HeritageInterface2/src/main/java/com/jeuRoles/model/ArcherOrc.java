package com.jeuRoles.model;

import com.jeuRoles.Interface.DistantAttacker;

public class ArcherOrc extends Orc implements DistantAttacker {

	public ArcherOrc(int x, int y, String name) {
		super(x, y, name);
	}
	
	public ArcherOrc(int x, int y, String name, int maxHealthPoint, int healthPoint, int maxManaPoint, int manaPoint,
			int magicalResistance, int physicalResistance, int strength, int intelligence, int agility) {
		super(x, y, name, maxHealthPoint, healthPoint, maxManaPoint, manaPoint, magicalResistance, physicalResistance, strength,
				intelligence, agility);
	}

	@Override
	public void distantAttack(Being b) {
		b.healthPoint -= this.agility;
	}
		
}
