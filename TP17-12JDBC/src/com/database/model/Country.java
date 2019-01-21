package com.database.model;

public class Country {
	
	private String countryId;
	private String countryName;
	private int regionId;
	
	public Country(String countryId, String countryName, int regionId) {
		this.countryId = countryId;
		this.countryName = countryName;
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return countryId + " " + countryName + " " + regionId ;
	}

	public String getCountryId() {
		return countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}
	
		
}
