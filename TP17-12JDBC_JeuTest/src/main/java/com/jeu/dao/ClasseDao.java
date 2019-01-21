package com.jeu.dao;

import java.util.List;

import com.jeu.model.Classe;
import com.jeu.model.Race;

public interface ClasseDao extends DaoGeneric<Classe, Integer> {

	public Classe findByName(String name);
	
}
