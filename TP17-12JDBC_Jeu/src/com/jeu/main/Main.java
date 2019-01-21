package com.jeu.main;

import java.sql.SQLException;

import com.jeu.dao.ClasseDaoImp;
import com.jeu.dao.RaceDaoImp;
import com.jeu.model.Classe;
import com.jeu.model.Race;
import com.jeu.utils.Context;

public class Main {

	public static void main(String[] args) throws SQLException {

		ClasseDaoImp classeDaoImp = new ClasseDaoImp();
		System.out.println(classeDaoImp.findAll());
		
		/*Classe classe1 = new Classe(4, "Demon",7,8,9,5,4,6);
		/*Classe classe2 = new Classe(5, "Farol",4,5,8,6,7,9);
		//classeDaoImp.insert(classe1);
		classeDaoImp.insert(classe2);
		System.out.println(classeDaoImp.findAll());
		classeDaoImp.update(classe2);
		System.out.println(classeDaoImp.findAll());
		classeDaoImp.delete(classe2);
		System.out.println(classeDaoImp.findAll());
		classeDaoImp.deleteByKey(4);
		System.out.println(classeDaoImp.findAll());*/

		/*classeDaoImp.deleteByKey(0);
		RaceDaoImp raceDaoImp = new RaceDaoImp();
		System.out.println(raceDaoImp.findAll());
		Race race1 = new Race(5, "Humanoid", 5,6,8,4,9,2);
		raceDaoImp.insert(race1);
		System.out.println(raceDaoImp.findAll());
		raceDaoImp.update(race1);
		System.out.println(raceDaoImp.findAll());
		//raceDaoImp.delete(race1);
		//System.out.println(raceDaoImp.findAll());
		Context.getInstance().getConnection().close();*/

	}

}
