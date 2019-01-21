package com.jeu.dao;

import java.util.List;

import com.jeu.model.Race;


public interface RaceDao extends DaoGeneric<Race,Integer>{

	public Race getRaceByName(String name);
		
}
