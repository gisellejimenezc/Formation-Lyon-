package com.company.model;

public class Status {

	private boolean cadre;
	private int annee;
	
	public Status() {}

	public Status(boolean cadre, int annee) {
		super();
		this.cadre = cadre;
		this.annee = annee;
	}
	
	public boolean isCadre() {
		return cadre;
	}

	public void setCadre(boolean cadre) {
		this.cadre = cadre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return "Status : " + ((cadre) ? "Cadre " + annee : "Non Cadre " + annee);
	}
}
