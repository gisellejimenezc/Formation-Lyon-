package com.monapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Guitariste implements Musicien {
	
	@Value("Jean")
	private String name;
	@Autowired
	private Instrument instrument;
	
	public Guitariste() {
	}

	public void perform() {
		System.out.println(name + " joue et fait : ");instrument.play();
				
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
