package com.jeuRoles.model;

public class Tree extends Being{

	public Tree(int x, int y, String name) {
		super(x, y, name);
		}

	public Tree(int x, int y, String name, int maxHealthPoint, int healthPoint, int maxManaPoint, int manaPoint, int magicalResistance,
			int physicalResistance) {
		super(x, y, name, maxHealthPoint, healthPoint, maxManaPoint, manaPoint, magicalResistance, physicalResistance);
	}
	
}
