package Tables;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("Entrez la taille de votre tableau suivi des élements.");
		n = sc.nextInt();
		int liste[] = new int[n];
		for (int i = 0; i < n; i++) {
			liste[i] = sc.nextInt();
		}

		System.out.print("Tableau initial = [ ");
		for (int i = 0; i < n; i++) {
			System.out.print(liste[i] + " ");
		}
		System.out.println("]");

		
		int t;
		for (int i = 0; i < (n-1); i++) {
			for (int j = (i+1); j < n; j++) {
				if(liste[i] > liste[j]) {
					t= liste[j];
					liste[j]=liste[i];
					liste[i]=t;
				}
			}
		}
		
		System.out.print("Tableau final = [ ");
		for (int i = 0; i < n; i++) {
			System.out.print(liste[i] + " ");
		}
		System.out.print("]");

	}

}
