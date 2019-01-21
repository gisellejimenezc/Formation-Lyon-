package monPremierProgramme;

import java.util.Scanner;

public class Programme {

	public static void main(String[] args) {
		int age;
		String prenom;
		boolean employe;
		
		age = 33;
		prenom = "Laly";
		employe = true;
		
		System.out.println("Hola " + prenom);
		System.out.println(prenom + " a " + age + " ans");
		if(employe) {
			System.out.println(prenom + " est une employé de la Cia.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir a : ");
		int a = sc.nextInt();
		System.out.println("Saisir b : ");
		int b = sc.nextInt();
		System.out.println("Saisir c : ");
		int c = sc.nextInt();
				
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("La somme de a plus b est égal à " + (a + b));
		System.out.println("Le produit d'a pour b est égal à " + (a * b));
		
		System.out.println("Nous avons un cercle, son rayon est : ");
		int r = sc.nextInt();
		System.out.println("Le périmètre du cercle est " + (2*Math.PI*r) + " et sa surface est " + (Math.PI*Math.pow(r,2)));
	
		System.out.println("Nous testons la loi d'OHM. La Tension en V est ");
		double U = sc.nextDouble();
		System.out.println("L'intensité en A est");
		double I = sc.nextDouble();
		System.out.println("La resistance en ohms est " + U/I);
		
		/*int d = a;
		a = b;
		b = c;
		c = d;
		
		System.out.println("Après permutation :");
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);*/
		
		
	}
	
}
