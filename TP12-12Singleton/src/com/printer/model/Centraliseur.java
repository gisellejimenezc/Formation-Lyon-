package com.printer.model;

import java.util.ArrayList;
import java.util.List;


public class Centraliseur {

	private static Centraliseur instance = null;
	private List<Imprimante> imprimantes = new ArrayList<Imprimante>();
	
	private Centraliseur() {}
	public static Centraliseur getInstance(){
		if(instance == null) instance = new Centraliseur();
		return instance;
	}
	
	public void addPrinter(Imprimante imprimante) {
		this.imprimantes.add(imprimante);
	}
		
	public void toPrint(String nom){
		int n = (int)(Math.random() * 3 + 1);
		for (Imprimante imprimante : this.imprimantes) {
			if(imprimante.getId() == n) {
				imprimante.toPrint(nom);
			}
		}
	}
	
}
