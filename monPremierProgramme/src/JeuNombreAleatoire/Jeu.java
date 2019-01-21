package JeuNombreAleatoire;

import java.util.Scanner;

public class Jeu {

	static Scanner sc = new Scanner(System.in);
	static int number = (int) (Math.round(1 + Math.random() * 99)); // génère un nombre compris entre 1 et 100

	public static void main(String[] args) {

		System.out.println("Tentez de deviner le \"number\"...");
		//System.out.println(number);
		int n = demandeEntreeClavier();
		//System.out.println(isTooHigh(n));
		deviner(n);
	}

	/**
	 * Fonction d'entrée clavier
	 * 
	 * @return int
	 */
	private static int demandeEntreeClavier() {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		return n;
	}

	// ....

	/**
	 * Fonction "isTooHigh"
	 * 
	 * @param val
	 * @return vrai si val est superieur a number, false dans le cas contraire.
	 */
	private static boolean isTooHigh(int n) {
		boolean b = true;
		if (n > number) {
			b = true;
		}
		if (n < number) {
			b = false;
		}
		return b;
	}
	// ....

	private static void deviner(int n) {
		do {
			if (isTooHigh(n)) {
				System.out.println("Trop grand !");
			} else {
				System.out.println("Trop petit !");
			}
			System.out.println("Allons-y !");
			n = demandeEntreeClavier();
		} while (n != number);
		System.out.println("Bravo !!");
	}
}
