package com.hashmap.model;

public class Client {

	private String nom;
	private int nbSalaire;
	private Epole pole;
	
	public Client(String nom, int nbSalaire, Epole pole) {
		this.nom = nom;
		this.nbSalaire = nbSalaire;
		this.pole = pole;
	}
	
	public void newOperation() {
		System.out.println("Hello");
	}

	@Override
	public String toString() {
		return nom + " " + nbSalaire + " " + pole;
	}
	
	
	
}
