package com.cgi.model;

public class Personne {
	String prenom;
	String nom;
	int age;
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void anniversaire() {
		
	}
	
	public Personne() {}

	public Personne(String prenom, String nom, int age) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return ""+this.nom	+ " " + this.prenom;
	}
	
	public Personne clone(){
		return new Personne(this.prenom, this.nom, this.age);
	}
	
	
	
}
