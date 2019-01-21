package com.database.dao;

import java.util.List;

import com.database.model.Country;

public interface CountryDAO extends DaoGeneric<Country,String>{
	
	public List<Country> getAllCountryByRegion(int region);

}
