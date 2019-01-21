package com.voitures.model;

public class InfoPropio {

	private String nom;
	private String preNom;
	
	public InfoPropio(String nom, String preNom) {
		this.nom = nom;
		this.preNom = preNom;
	}

	@Override
	public String toString() {
		return  nom + ", " + preNom ;
	}
		
}
