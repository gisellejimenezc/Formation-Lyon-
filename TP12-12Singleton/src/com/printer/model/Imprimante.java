package com.printer.model;

public class Imprimante {

	private int id;
	private String nom;
	
	public Imprimante(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	public void toPrint(String nom) {
		
		System.out.println("Printing from " + nom + " through " + this.nom + "\n");
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}
	
}
