package com.voitures.model;

public class InfoVoiture {

	private String matricule;
	private String marque;
	
	public InfoVoiture(String matricule, String marque) {
		this.matricule = matricule;
		this.marque = marque;
	}

	public String getMatricule() {
		return matricule;
	}

	public String getMarque() {
		return marque;
	}
	
	@Override
	public String toString() {
		return marque + " , " + matricule;
	}
		
}
