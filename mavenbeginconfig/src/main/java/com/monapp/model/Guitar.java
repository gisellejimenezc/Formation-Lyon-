package com.monapp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;
import org.springframework.stereotype.Component;

@Component("fender")
public class Guitar implements Instrument {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	

	public void play() {
		System.out.println("ran tan tan");
	}
	
	

}
