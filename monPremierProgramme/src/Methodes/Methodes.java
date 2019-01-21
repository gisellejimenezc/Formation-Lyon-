package Methodes;

import java.util.Scanner;

public class Methodes {

	public static void main(String[] args) {
		System.out.println("Entrez le prenom");
		String prenom = demandeEntreeClavier();
		afficheBonjour(prenom);
		afficheAuRevoir(prenom);
	}

	private static void afficheAuRevoir(String prenom) {
		System.out.println("Bonjour " + prenom);
	}

	private static void afficheBonjour(String prenom) {
		System.out.println("Au revoir " + prenom);
	}

	

	private static String demandeEntreeClavier() {
		Scanner sc = new Scanner(System.in);
		String rep;
		rep = sc.next();
		return rep;
	}

}
