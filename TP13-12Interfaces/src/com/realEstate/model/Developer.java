package com.realEstate.model;

import com.realEstate.Interface.Redeemable;

public class Developer implements Redeemable {
	
	private String nom;

	public Developer(String nom) {
		this.nom = nom;
	}
	
	@Override
	public void buy() {
		System.out.println(this.nom + " bought something ");
	}

	@Override
	public void sell() {
		System.out.println(this.nom + " sold something ");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
