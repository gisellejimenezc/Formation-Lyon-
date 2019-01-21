package com.hashmap.model;

public class Commercial {
	
	private String nom;
	private String prenom;
	private int secu;
	
	public Commercial(String nom, String prenom, int secu) {
		this.nom = nom;
		this.prenom = prenom;
		this.secu = secu;
	}

	
	
	@Override
	public String toString() {
		return "Commercial : " + nom + ", " + prenom + ", " + secu;
	}



	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getSecu() {
		return secu;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setSecu(int secu) {
		this.secu = secu;
	}
	
	

}
