package com.monapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cd")
public class CD {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="tracks")
	private int tracks;
	
	@Column(name="style")
	private Estyle style;
	
	@ManyToOne()
	@JsonIgnore
	@JoinColumn(name="artistid")
	private Artist artist;
	
	public CD(){}

	public CD(String title, int tracks, Estyle style, Artist artist) {
		this.title = title;
		this.tracks = tracks;
		this.style = style;
		this.artist = artist;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public int getTracks() {
		return tracks;
	}

	public Estyle getStyle() {
		return style;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setTracks(int tracks) {
		this.tracks = tracks;
	}

	public void setStyle(Estyle style) {
		this.style = style;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
		
}
