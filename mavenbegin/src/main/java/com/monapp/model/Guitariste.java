package com.monapp.model;

public class Guitariste implements Musicien {

	private String name;
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
