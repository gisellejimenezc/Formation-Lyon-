package Boucles;

import java.util.Scanner;

public class Boucles {

	public static void main(String[] args) {

		/*
		 * for(int i=1; i<=10;i++) { System.out.println(i + " x "+ n + " = " + (i*n) );
		 * } System.out.println("La tabla de multiplicar del " + n);
		 */

		/*
		 * System.out.
		 * println("Entrez 1 pour calculer la table de multiplication de un nombre ou 0 pour sortir"
		 * ); int s = sc.nextInt(); if(s!=1 && s!=0) {
		 * System.out.println("Hey... 0 ou 1."); }else { while(s==1) {
		 * System.out.println("Please enter a number."); int n = sc.nextInt(); for(int
		 * i=1; i<=10;i++) { System.out.println(i + " x "+ n + " = " + (i*n) ); }
		 * System.out.println("Pour continuer entrez 1, pour sortir entrez 0"); s =
		 * sc.nextInt(); } if (s ==0) { System.out.println("Bye, bye !"); } }
		 */

		/*
		 * System.out.println("Entrez le premier nombre"); double a = sc.nextDouble();
		 * System.out.println("Entrez l'opérateur"); char op = sc.next().charAt(0);
		 * System.out.println("Entrez le deuxieme nombre"); double b = sc.nextDouble();
		 * 
		 * switch(op) { case '+':
		 * System.out.println("La somme des deux nombres est égal à "+ (a+b)); break;
		 * case '-': System.out.println("La soustraction des deux nombres est égal à "+
		 * (a-b)); break; case '*':
		 * System.out.println("Le produit des deux nombres est égal à "+ (a*b)); break;
		 * case '/': System.out.println("La division des deux nombres est égal à "+
		 * (a/b)); break; default: System.out.println("l'opérateur n'est pas valide.");
		 * }
		 */

		String r = "O";
		do {
			System.out.println("Super-super calculatrice\nVous voulez...\nCalc : Calculatrice \nTable : Table de multiplication \nBye: Sortir");
			String c = demandeEntreeClavier();

			switch (c) {
				case "Calc":
					calc();
					break;
				case "Table":
					table();
					break;
				case "Bye":
					bye();
				default:
					System.out.println("Ok... Nothing");
			}
			System.out.println("Voulez vous rester O:N ?");
			r = demandeEntreeClavier();
		} while (r.equals("O"));
		bye();
	}
	
	
	String r = demandeEntreeClavier();

	private static String demandeEntreeClavier() {
		Scanner sc = new Scanner(System.in);
		String r;
		r = sc.next();
		return r;
	}
	
	private static void calc() {
		System.out.println("Entrez le premier nombre");
		double a = Double.parseDouble(demandeEntreeClavier());
		System.out.println("Entrez l'opérateur");
		char op = demandeEntreeClavier().charAt(0);
		System.out.println("Entrez le deuxieme nombre");
		double b = Double.parseDouble(demandeEntreeClavier());
		switch (op) {
		case '+':
			System.out.println("La somme des deux nombres est égal à " + (a + b));
			break;
		case '-':
			System.out.println("La soustraction des deux nombres est égal à " + (a - b));
			break;
		case '*':
			System.out.println("Le produit des deux nombres est égal à " + (a * b));
			break;
		case '/':
			System.out.println("La division des deux nombres est égal à " + (a / b));
			break;
		default:
			System.out.println("l'opérateur n'est pas valide.");
		}		
	}
	
	private static void table() {
		System.out.println("Entrez le nombre");
		double n = Double.parseDouble(demandeEntreeClavier());
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + n + " = " + (i * n));
		}
	}
	
	private static void bye() {
		System.out.println("Bye !");
	}


}
	
