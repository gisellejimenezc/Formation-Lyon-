package com.cgi.entry;

import java.util.Scanner;

import com.cgi.model.Personne;

public class Entry {
	public static void main(String[] args) {
		Personne p  = new Personne("totO", "titi", 6);
		
		System.out.println(p.toString());
		Personne p1 = (Personne) p.clone();
		System.out.println(p1.toString());
	}
}
