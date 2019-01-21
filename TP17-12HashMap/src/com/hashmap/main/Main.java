package com.hashmap.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.hashmap.model.Client;
import com.hashmap.model.Commercial;
import com.hashmap.model.Epole;

public class Main {

	public static void main(String[] args) {
		
		HashMap<Commercial, List<Client>> hmap = new HashMap<Commercial, List<Client>>();
		
		Commercial commercial1 = new Commercial("Gnagnez", "Juan", 54899);
		
		List<Client> clients1 = new ArrayList<Client>();
		Client clientA = new Client("Martinez", 500, Epole.Auto);
		Client clientB = new Client("Lopez", 600, Epole.Banque);
		clients1.add(clientA);
		clients1.add(clientB);
		
		List<Client> clients2 = new ArrayList<Client>();
		Client clientC =new Client("Malin", 600, Epole.Assurance);
		Client clientD = new Client("Toto", 400, Epole.Assurance);
		clients2.add(clientC);
		clients2.add(clientD);
		hmap.put(commercial1, clients1);
		
		hmap.put(new Commercial("Bellota", "Lardo", 48569), clients2);
		
		System.out.println(hmap.toString());
				
	}

}
