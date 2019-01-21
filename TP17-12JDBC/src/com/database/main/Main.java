package com.database.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.database.dao.CountryDaoImp;
import com.database.model.Country;
import com.database.utils.Context;


public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		CountryDaoImp countryDaoImp = new CountryDaoImp();
		Country country = new Country("MO", "Moldavia", 1);
		
		//countryDaoImp.insert(country);
			
		countryDaoImp.update(country);
		Country country1 = new Country("MB", "Manila", 3);
		countryDaoImp.delete(country1);
		
		Context.getInstance().getConnection().close();
		
			/*try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost/hr", "postgres", "sorpres2");
					
				
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM countries");
			System.out.println(rs);
			
			Set<Country> set =new HashSet<Country>();
			while(rs.next()) {
				set.add(new Country(rs.getString("country_id"), rs.getString("Country_name"), rs.getInt("region_id")));
				//System.out.println(rs.getString("country_name"));
			}
			
			for (Country c : set) {
				System.out.println(c);
			}
			
			rs.close();
			
			/*PreparedStatement st1 = con.prepareStatement("insert into countries values(?,?,?)");
			String code = "CM";
			st1.setString(1, code);
			//String name = "Camila";
			st1.setString(2, "Camila");
			int codeRegion = 3;
			st1.setInt(3, codeRegion);
			st1.executeUpdate();
			st1.close();
			
			st.close();
			con.close();*/
			
	}

}
