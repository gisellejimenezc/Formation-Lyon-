package com.jeuRoles.model;

import java.util.List;

import com.jeuRoles.Interface.Flying;
import com.jeuRoles.Interface.SpellCaster;

public class Wizard extends Humanoid implements Flying, SpellCaster {

	public Wizard(int x, int y, String name) {
		super(x, y, name);
	}
	
	public Wizard(int x, int y, String name, int maxHealthPoint, int healthPoint, int maxManaPoint, int manaPoint,
			int magicalResistance, int physicalResistance, int strength, int intelligence, int agility) {
		super(x, y, name, maxHealthPoint, healthPoint, maxManaPoint, manaPoint, magicalResistance, physicalResistance, strength,
				intelligence, agility);
	}

	@Override
	public void attack(Being b) {
		this.manaPoint += 10;
		super.attack(b);
	}
		
	@Override
	public void castSpell(Being b) {
		this.manaPoint -= 10;
		if(b instanceof Orc) {
			b.healthPoint -= 2*this.intelligence;
		}else {
			b.healthPoint -= this.intelligence;	
		}
	}

	@Override
	public void castSpell(List<Being> beings) {
		this.manaPoint -= 10;
		for(Being b : beings) {
			if(b instanceof Orc) {
			b.healthPoint -= 2*this.intelligence;
			}else {
				b.healthPoint -= this.intelligence;	
			}
		}
	}

	@Override
	public void takeOff() {
		System.out.println("This guy is flying");
	}

	@Override
	public void land() {
		System.out.println("This guy is landed");
	}
	
}
