package com.voitures.model;

public class Voiture {

	public static final int MAX_VITESSE = 300;
	public static int count = 0;
	
	private int vitesse;
	private InfoVoiture infovoiture;
	private InfoPropio infopropio;
	

	public Voiture(int vitesse, String matricule, String marque) {
		Voiture.count++;
		this.infovoiture = new InfoVoiture(matricule, marque);
		setVitesse(vitesse);
		
	}

	public Voiture(int vitesse, String matricule, String marque, InfoPropio infoPropio) {
		Voiture.count++;
		this.infovoiture = new InfoVoiture(matricule, marque);
		this.infopropio = infoPropio;
		setVitesse(vitesse);
	}

	public int getCount() {
		return count;
	}

	public InfoVoiture getInfoVoiture() {
		return this.infovoiture;
	}

	public int setVitesse(int vitesse) {
		this.vitesse = (vitesse <= MAX_VITESSE) ? vitesse : MAX_VITESSE;
		return this.vitesse;
	}
	
	public static String comparerVitesse(Voiture v1, Voiture v2) {
		if (v1.vitesse == v2.vitesse) {
			return "Les deux voitures vont à la même allure...";
		} else {
			return (v1.vitesse > v2.vitesse)
					? "La petite voiture " + v1.getInfoVoiture().toString()
							+ " est plus rapide que la " + v2.getInfoVoiture().toString()
					: "La petite voiture " + v1.getInfoVoiture().toString()
					+ " va plus docuement que la " + v2.getInfoVoiture().toString();
		}
	}

	public void setInfoPropio(InfoPropio infopropio) {
		this.infopropio = infopropio;
	}

	@Override
	public String toString() {
		return "Voiture [vitesse = " + vitesse + ", Description = " + infovoiture + ", Propietaire = " + infopropio + "]";
	}

}
