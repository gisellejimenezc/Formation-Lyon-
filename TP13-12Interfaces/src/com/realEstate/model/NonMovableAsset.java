package com.realEstate.model;

public class NonMovableAsset extends Asset {

	private String address;

	public NonMovableAsset(String nom, double prix, String address) {
		super(nom, prix);
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return super.toString() + " , " + address;
	}

	@Override
	public void buy() {
		System.out.println(this.getNom() + " was sold ");
		
	}

	@Override
	public void sell() {
		System.out.println(this.getNom() + " was bought ");
	}

	@Override
	public void build() {
		System.out.println(this.getNom() + " was built ");
	}

	@Override
	public void destroy() {
		System.out.println(this.getNom() + " was destroyed ");
	}

	@Override
	public void clean() {
		System.out.println(this.getNom() + " was clean ");
	}

	@Override
	public void finish() {
		System.out.println(this.getNom() + " was finished ");
	}
	
}
