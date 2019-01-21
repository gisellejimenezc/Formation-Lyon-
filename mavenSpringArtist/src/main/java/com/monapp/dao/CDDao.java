package com.monapp.dao;

import java.util.List;

import com.monapp.model.CD;

public interface CDDao extends DaoGeneric<CD, Integer> {
	
	List<CD> findByArtistId(int id);

}
