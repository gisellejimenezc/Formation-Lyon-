package com.monapp.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="llama")
public class Llama {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name="name")
	private String name;

	public Llama() {
		
	}
	
	public Llama(String name) {
		this.name = name;
	}
	
	public Llama(int id, String name) {
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
		
}
