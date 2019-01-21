package com.realEstate.model;

import com.realEstate.Interface.Buildable;
import com.realEstate.Interface.Endable;
import com.realEstate.Interface.Redeemable;

public abstract class Asset implements Redeemable, Buildable, Endable {
	
	private String nom;
	private double prix;
	
	public Asset() {}

	public Asset(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Asset : " + nom + " , " + prix;
	}
	
}
