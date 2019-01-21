package com.jeuRoles.model;

import java.util.List;

import com.jeuRoles.Interface.DistantAttacker;
import com.jeuRoles.Interface.Flying;
import com.jeuRoles.Interface.SpellCaster;

public class Dragon extends Creature implements Flying, SpellCaster, DistantAttacker {
	
	protected int intelligence;

	public Dragon(int x, int y, String name) {
		super(x, y, name);
	}
	
	public Dragon(int x, int y, String name, int strength) {
		super(x, y, name, strength);
	}
	
	public Dragon(int x, int y, String name, int maxHealthPoint, int healthPoint, int maxManaPoint, int manaPoint, int magicalResistance,
			int physicalResistance, int strength, int intelligence) {
		super(x, y, name, maxHealthPoint, healthPoint, maxManaPoint, manaPoint, magicalResistance, physicalResistance, strength);
		this.intelligence = intelligence;
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
		this.x -= step;
	}

	@Override
	public void castSpell(Being b) {
		b.healthPoint -= this.intelligence;
		
	}

	@Override
	public void castSpell(List<Being> beings) {
		for(Being b : beings) {
			b.healthPoint -= this.intelligence;
		}
	}

	@Override
	public void takeOff() {
		inAir = true;
		System.out.println("This guy is flying");
	}

	@Override
	public void land() {
		inAir = false;
		System.out.println("This guy is landed");
	}

	@Override
	public void distantAttack(Being b) {
		b.healthPoint -= this.intelligence;
	}

}
