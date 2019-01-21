package com.realEstate.model;

public class MovableAsset extends Asset {

	public MovableAsset(String nom, double prix) {
		super(nom, prix);
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
		System.out.println(this.getNom() + " was cleaned ");
	}

	@Override
	public void finish() {
		System.out.println(this.getNom() + " was finished ");
	}
	
}
