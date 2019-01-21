package com.jeujpa.model;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "player")
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String login;
	private Date birthdate;
	private String password;
	private String firstName;
	private String lastName;
	
	@OneToMany(mappedBy="user")
	private Collection<Perso> persons;

	public User() {
	}

	
	
}
