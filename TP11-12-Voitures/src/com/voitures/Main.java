package com.voitures;

import com.voitures.model.InfoPropio;
import com.voitures.model.Parking;
import com.voitures.model.Voiture;

public class Main {

	public static void main(String[] args) {
		
		Parking parking = new Parking("El cielo");
		
		
		InfoPropio propio1 = new InfoPropio("Cota","Lalo");
		//voiture1.setInfoPropio(propio1);
		Voiture voiture1 = new Voiture(125, "AL256RN", "Citroen", propio1);
		
		Voiture voiture2 = new Voiture(125, "AL256FN", "Citroen");
		InfoPropio propio2 = new InfoPropio("Rodriguez","Bellota");
		voiture2.setInfoPropio(propio2);
		
		parking.addVoiture(voiture1);
		parking.addVoiture(voiture2);

		System.out.println(parking.toString());
		
		System.out.println(Voiture.comparerVitesse(voiture1, voiture2));
		
		voiture1.setVitesse(250);
		
		System.out.println(Voiture.comparerVitesse(voiture1, voiture2));
		
		System.out.println(parking.getCountByMarque("Citroen"));
		
		System.out.println(parking.getCountVoiture());
		
	}

}
