package com.voitures.model;

import java.util.ArrayList;
import java.util.List;

public class Parking {

	String nom;
	List<Voiture> voitures = new ArrayList<Voiture>();

	public Parking(String nom) {
		this.nom = nom;
	}

	public void addVoiture(Voiture voiture) {
		this.voitures.add(voiture);
	}

	public void removeVoitureByMatricule(String matricule) {
		for (int i = 0; i < this.voitures.size(); i++) {
			if (this.voitures.get(i).getInfoVoiture().getMatricule().equals(matricule)) {
				this.voitures.remove(voitures.get(i));
			}
		}
	}

	public int getCountByMarque(String marque) {
		int countByMarque = 0;
		for (Voiture voiture : this.voitures) {
			if (voiture.getInfoVoiture().getMarque().equals(marque)) {
				countByMarque++;
			}
		}
		return countByMarque;
	}

	public int getCountVoiture() {
		return this.voitures.size();
	}

	@Override
	public String toString() {
		return "Parking " + nom + ", liste de voitures = " + voitures;
	}
	
	
}
