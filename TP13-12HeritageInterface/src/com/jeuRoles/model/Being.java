package com.jeuRoles.model;

public abstract class Being extends SpacialElement {
	
	protected int maxHealthPoint;
	protected int healthPoint;
	protected int maxManaPoint;
	protected int manaPoint;
	protected int magicalResistance;
	protected int physicalResistance;
	
	public Being(int x, int y, String name) {
		super(x, y, name);
	}

	public Being(int x, int y, String name, int maxHealthPoint, int healthPoint, int maxManaPoint, int manaPoint, int magicalResistance,
			int physicalResistance) {
		super(x, y, name);
		this.maxHealthPoint = maxHealthPoint;
		this.healthPoint = healthPoint;
		this.maxManaPoint = maxManaPoint;
		this.manaPoint = manaPoint;
		this.magicalResistance = magicalResistance;
		this.physicalResistance = physicalResistance;
	}
	
	public void takeDamage(int point) {
		this.healthPoint -= point;
		System.out.println("You health was damaged by " + point + " points");
	}
	
	public void heal(int point) {
		this.healthPoint += point;
		System.out.println("You health was improved by " + point + " points");
	}

	public int getMaxHealthPoint() {
		return maxHealthPoint;
	}

	public int getHealthPoint() {
		return healthPoint;
	}

	public int getMaxManaPoint() {
		return maxManaPoint;
	}

	public int getManaPoint() {
		return manaPoint;
	}

	public int getMagicalResistance() {
		return magicalResistance;
	}

	public int getPhysicalResistance() {
		return physicalResistance;
	}

	public void setMaxHealthPoint(int maxHealthPoint) {
		this.maxHealthPoint = maxHealthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	public void setMaxManaPoint(int maxManaPoint) {
		this.maxManaPoint = maxManaPoint;
	}

	public void setManaPoint(int manaPoint) {
		this.manaPoint = manaPoint;
	}

	public void setMagicalResistance(int magicalResistance) {
		this.magicalResistance = magicalResistance;
	}

	public void setPhysicalResistance(int physicalResistance) {
		this.physicalResistance = physicalResistance;
	}
	
}
