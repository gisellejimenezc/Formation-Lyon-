package com.database.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.database.model.Country;
import com.database.utils.Context;

public class CountryDaoImp implements CountryDAO {

	@Override
	public List<Country> findAll() {
		List<Country> countries = new ArrayList<Country>();
		try {
			Connection con = Context.getInstance().getConnection();
			String sql = "SELECT * FROM countries";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM countries");
			System.out.println(rs);

			while (rs.next()) {
				countries.add(
						new Country(rs.getString("country_id"), rs.getString("Country_name"), rs.getInt("region_id")));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return countries;
	}

	@Override
	public Country findByKey(String country_id) {
		Country country = null;
		try {
			Connection con = Context.getInstance().getConnection();

			PreparedStatement st = con.prepareStatement("SELECT * FROM countries WHERE country_id = ?");
			st.setString(1, country_id);
			ResultSet rs = st.executeQuery();

			if(rs.next())
			country = new Country(rs.getString("country_id"), rs.getString("Country_name"),
					rs.getInt("region_id"));
			rs.close();
			st.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return country;
	}	

	@Override
	public void insert(Country country) {

		try {
			Connection con = Context.getInstance().getConnection();
			
			PreparedStatement st = con.prepareStatement("insert into countries values(?,?,?)");
			st.setString(1, country.getCountryId());
			st.setString(2, country.getCountryName());
			st.setInt(3, country.getRegionId());
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Country update(Country country) {
		try {
			Connection con = Context.getInstance().getConnection();
			
			PreparedStatement st = con.prepareStatement("UPDATE countries\r\n"
					+ "SET country_id = ?, country_name = ?, region_id = ?\n" + "WHERE country_name = ?;");
			st.setString(1, "CO");
			st.setString(2, "Colombie");
			st.setInt(3, 1);
			st.setString(4, country.getCountryName());
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return country;
	}

	@Override
	public void delete(Country country) {
		try {
			Connection con = Context.getInstance().getConnection();PreparedStatement st = con.prepareStatement("DELETE FROM countries WHERE country_id = ?;");
			st.setString(1, country.getCountryId());
			st.executeUpdate();
			st.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteByKey(String key) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Country> getAllCountryByRegion(int region) {
		// TODO Auto-generated method stub
		return null;
	}

}
