package com.monapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="artist")
public class Artist {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="stagename")
	private String stageName;
	
	@OneToMany(mappedBy="artist", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<CD> CDs=new ArrayList<CD>();
	
	public List<CD> getCDs() {
		return CDs;
	}

	public void setCDs(List<CD> cDs) {
		CDs = cDs;
	}
	
	public Artist()
	{	
	}

	public Artist(String firstName, String lastName, String stageName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.stageName = stageName;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getStageName() {
		return stageName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	@Override
	public String toString() {
		return stageName;
	}
	
	
	
}
