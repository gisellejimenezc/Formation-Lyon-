package com.jeu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jeu.model.Race;
import com.jeu.utils.Context;

public class RaceDaoImp implements RaceDao{

	@Override
	public List<Race> findAll() {
		List<Race> races = new ArrayList<Race>();
		try {
			Connection con = Context.getInstance().getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM race");
			System.out.println(rs);

			while (rs.next()) {
				races.add(new Race(rs.getInt("Id"), rs.getString("Name"), rs.getInt("Strength"),
						rs.getInt("Resistance"), rs.getInt("Intelligence"),
						rs.getInt("Agility"), rs.getInt("Charisme"), rs.getInt("Luck")));
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return races;
	}

	@Override
	public Race findByKey(Integer id) {
		Race race = null;
		try {
			Connection con = Context.getInstance().getConnection();

			PreparedStatement st = con.prepareStatement("SELECT * FROM race WHERE Id = ?");
			st.setInt(1, (int) id);
			ResultSet rs = st.executeQuery();

			if(rs.next())
			race = new Race (rs.getInt("Id"), rs.getString("Name"), rs.getInt("Strength"),
					rs.getInt("Resistance"), rs.getInt("Intelligence"),
					rs.getInt("Agility"), rs.getInt("Charisme"), rs.getInt("Luck"));
			rs.close();
			st.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return race;
	}

	@Override
	public void insert(Race race) {
		try {
			Connection con = Context.getInstance().getConnection();
			
			PreparedStatement st = con.prepareStatement("insert into race values(?,?,?,?,?,?,?,?)");
			st.setInt(1, race.getStrength());
			st.setString(2, race.getName());
			st.setInt(3, race.getIntelligence());
			st.setInt(4, race.getId());
			st.setInt(5, race.getResistance());
			st.setInt(6, race.getCharism());
			st.setInt(7, race.getAgility());
			st.setInt(8, race.getLuck());
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Race update(Race race) {
		try {
			Connection con = Context.getInstance().getConnection();
			
			PreparedStatement st = con.prepareStatement("UPDATE race SET "
					+ "Name = ? WHERE Name = ?;");
			st.setString(1, "Dragon");
			st.setString(2, race.getName());
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return race;
	}

	@Override
	public void delete(Race race) {
		try {
			Connection con = Context.getInstance().getConnection();PreparedStatement st = con.prepareStatement("DELETE FROM race WHERE Id = ?;");
			st.setInt(1, race.getId());
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteByKey(Integer id) {
		try {
			Connection con = Context.getInstance().getConnection();PreparedStatement st = con.prepareStatement("DELETE FROM race WHERE Id = ?;");
			st.setInt(1, id);
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Race getRaceByName(String name) {
		Race race = null;
		try {
			Connection con = Context.getInstance().getConnection();

			PreparedStatement st = con.prepareStatement("SELECT * FROM Race WHERE Name = ?");
			st.setString(1, name);
			ResultSet rs = st.executeQuery();

			if(rs.next())
			race = new Race (rs.getInt("Id"), rs.getString("Name"), rs.getInt("Strength"),
					rs.getInt("Resistance"), rs.getInt("Intelligence"),
					rs.getInt("Agility"), rs.getInt("Charisme"), rs.getInt("Luck"));
			rs.close();
			st.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return race;
	}

	
}
