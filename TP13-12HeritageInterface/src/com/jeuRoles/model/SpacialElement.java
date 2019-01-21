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
	
			
}
