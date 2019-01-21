package com.jeuRoles.model;

public abstract class SpacialElement {

	protected int x;
	protected int y;
	protected boolean inAir = false;
	protected String name;
	
	public SpacialElement() {
	}

	public SpacialElement(int x, int y, String name) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
	}

	@Override
	public String toString() {
		return "SpacialElement , name = " + name + ", x = " + x + ", y = " + y + ", inAir = " + inAir ;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isInAir() {
		return inAir;
	}

	public String getName() {
		return name;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setInAir(boolean inAir) {
		this.inAir = inAir;
	}

	public void setName(String name) {
		this.name = name;
	}
				
}
