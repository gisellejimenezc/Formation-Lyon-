package com.printer.model;

public class Poste {

	private int id;
	private String nom;
	
	public Poste(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	public void toPrint() {
		Centraliseur.getInstance().toPrint(this.nom);
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	
	
	
}
