package com.testjpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Computer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
		
	@OneToOne(mappedBy="computer")
	@JoinColumn(name="EMPLOYEE_ID")
	private Employee employee;
	
}
