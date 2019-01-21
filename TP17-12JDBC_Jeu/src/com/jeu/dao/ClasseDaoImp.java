package com.jeu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jeu.utils.Context;
import com.jeu.model.Classe;

public class ClasseDaoImp implements ClasseDao {

	@Override
	public List<Classe> findAll() {
		List<Classe> classes = new ArrayList<Classe>();
		try {
			Connection con = Context.getInstance().getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Classe");
			System.out.println(rs);

			while (rs.next()) {
				classes.add(new Classe(rs.getInt("Id"), rs.getString("Name"), rs.getInt("StrengthModifier"),
						rs.getInt("ResistanceModifier"), rs.getInt("IntelligenceModifier"),
						rs.getInt("AgilityModifier"), rs.getInt("CharismeModifier"), rs.getInt("LuckModifier")));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return classes;
	}

	@Override
	public Classe findByKey( Integer id) {
		Classe classe = null;
		try {
			Connection con = Context.getInstance().getConnection();

			PreparedStatement st = con.prepareStatement("SELECT * FROM Classe WHERE Id = ?");
			st.setInt(1, (int) id);
			ResultSet rs = st.executeQuery();

			if(rs.next())
			classe = new Classe (rs.getInt("Id"), rs.getString("Name"), rs.getInt("StrengthModifier"),
					rs.getInt("ResistanceModifier"), rs.getInt("IntelligenceModifier"),
					rs.getInt("AgilityModifier"), rs.getInt("CharismeModifier"), rs.getInt("LuckModifier"));
			rs.close();
			st.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return classe;
	}

	@Override
	public void insert(Classe classe) {
		
		try {
			Connection con = Context.getInstance().getConnection();
			
			PreparedStatement st = con.prepareStatement("insert into Classe (name, StrengthModifier, ResistanceModifier, IntelligenceModifier, AgilityModifier, CharismModifier, LuckModifier )values(?,?,?,?,?,?,?,?)");
			//st.setInt(1, classe.getId());
			st.setString(2, classe.getName());
			st.setInt(3, classe.getStrengthModifier());
			st.setInt(4, classe.getResistanceModifier());
			st.setInt(5, classe.getIntelligenceModifier());
			st.setInt(6, classe.getAgilityModifier());
			st.setInt(7, classe.getCharismModifier());
			st.setInt(8, classe.getLuckModifier());
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	@Override
	public Classe findByName(String name) {
		Classe classe = null;
		try {
			Connection con = Context.getInstance().getConnection();

			PreparedStatement st = con.prepareStatement("SELECT * FROM Classe WHERE Name = ?");
			st.setString(1, (String) name);
			ResultSet rs = st.executeQuery();

			if(rs.next())
			classe = new Classe (rs.getInt("Id"), rs.getString("Name"), rs.getInt("Strength_Modifier"),
					rs.getInt("Resistance_Modifier"), rs.getInt("Intelligence_Modifier"),
					rs.getInt("Agility_Modifier"), rs.getInt("Charisme_Modifier"), rs.getInt("Luck_Modifier"));
			rs.close();
			st.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return classe;
	}

	@Override
	public Classe update(Classe classe) {
		try {
			Connection con = Context.getInstance().getConnection();
			
			PreparedStatement st = con.prepareStatement("UPDATE classe SET "
					+ "name = ? WHERE name = ?;");
			st.setString(1, "Beast");
			st.setString(2, classe.getName());
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return classe;
	}

	@Override
	public void delete(Classe classe) {
		try {
			Connection con = Context.getInstance().getConnection();PreparedStatement st = con.prepareStatement("DELETE FROM classe WHERE Id = ?;");
			st.setInt(1, classe.getId());
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteByKey(Integer id) {
		try {
			Connection con = Context.getInstance().getConnection();
			PreparedStatement st = con.prepareStatement("DELETE FROM classe WHERE Id = ?;");
			st.setInt(1, id);
			st.executeUpdate();
			st.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}