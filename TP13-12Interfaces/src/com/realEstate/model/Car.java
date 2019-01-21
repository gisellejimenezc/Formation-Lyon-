package com.realEstate.model;

public class Car extends MovableAsset {

	private String make;
	
	public Car(String nom, double prix, String make) {
		super(nom, prix);
		this.setMake(make);
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	@Override
	public String toString() {
		return super.toString() + " , " + make;
	}
	
}
