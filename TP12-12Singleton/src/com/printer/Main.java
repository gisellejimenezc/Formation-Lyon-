package com.printer;

import com.printer.model.Centraliseur;
import com.printer.model.Imprimante;
import com.printer.model.Poste;

public class Main {

	public static void main(String[] args) {
		
		Poste poste1 = new Poste(1, "Poste Magnifique");
		Poste poste2 = new Poste(2, "Cool Poste");
		Poste poste3 = new Poste(3, "Le plus beau des poste");
		
		Imprimante imprimante1 = new Imprimante(1, "Super Imprimante" );
		Imprimante imprimante2 = new Imprimante(2, "La meilleur imprimante" );
		Imprimante imprimante3 = new Imprimante(3, "La plus magnifique des imprimantes" );
		
		
		Centraliseur.getInstance().addPrinter(imprimante1);
		Centraliseur.getInstance().addPrinter(imprimante2);
		Centraliseur.getInstance().addPrinter(imprimante3);
		
		poste1.toPrint();
		poste2.toPrint();
		poste3.toPrint();
		poste1.toPrint();
		poste2.toPrint();
		poste3.toPrint();
		

	}

}
