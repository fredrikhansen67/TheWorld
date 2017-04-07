package com.hansen.fredrik.theworld;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlCountryDAO  implements SqlGenericDAOInterface{

	private List<Country> countryList;
	private Connection connect;
	public SqlCountryDAO() throws FileNotFoundException, IOException, SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		/**
		 * Setting up the connection to the databas by reading the properties fail
		 */
		Properties prop = new Properties();
		prop.load(new FileInputStream("connect.properties"));
		connect = DriverManager.getConnection(prop.getProperty("URL"), prop.getProperty("user"), prop.getProperty("password"));
		

	}
	

	
	public void convertRowToCountry(ResultSet rs) throws SQLException{
		while (rs.next()){
			countryList.add(new Country(
					rs.getString("Code"),
					rs.getString("Name"),
					rs.getString("Region"),
					rs.getFloat("SurfaceArea"),
					rs.getInt("IndepYear"),
					rs.getInt("Population"),
					rs.getFloat("LifeExpectancy"),
					rs.getFloat("GNP"),
					rs.getFloat("GNPOLd"),
					rs.getString("LocalName"),
					rs.getString("GovernmentForm"),
					rs.getString("HeadOfState"),
					rs.getInt("Capital"),
					rs.getString("Code2") 
					));
		}
		
	}
	
	public String getSelected(String cc) throws SQLException{
		
		countryList = new ArrayList<Country>();
		String ret="";
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		try{
			pstmt = connect.prepareStatement("SELECT * from country where Code like ?");
			pstmt.setString(1, cc.trim());
			rs = pstmt.executeQuery();

			while(rs.next()){
					ret =  ""+rs.getString("Name")+", "+rs.getString("Region")+", Population :"+rs.getString("Population");
					break;
			}
			return ret;		
		}catch(Exception e){System.out.println("Exception [SqlCountryDAO] :" +e);return "?";}
		finally{
			countryList=null;
			rs.close();
			pstmt.close();
		}
		
		
	}
	
	@Override
	public List<?> getAll() throws SQLException {
		countryList = new ArrayList<Country>();
		Statement stmt =null;
		ResultSet rs = null;

		try{
			stmt = connect.createStatement();
			rs = stmt.executeQuery("SELECT * from country");
			while(rs.next()){
				convertRowToCountry(rs);
			}
			return countryList;
			
		}catch(Exception e){System.out.println("Exception [SqlCountryDAO] :" +e);return countryList;}
		finally{
			countryList=null;
			rs.close();
			stmt.close();
		}
	}
	@Override
	public List<Country> searchItem(String lName) throws Exception{
		countryList = new ArrayList<Country>();
		PreparedStatement stmt =null;
		ResultSet rs = null;

		try{
			lName +="%";
			stmt = connect.prepareStatement("SELECT * from city where Name like ?");
			stmt.setString(1, lName);
			rs = stmt.executeQuery();
			
			while(rs.next()){
				convertRowToCountry(rs);
			}
			return countryList;
			
		}catch(Exception e){System.out.println("Exception [SqlCountryDAO] :" +e);return countryList;}
		finally{
			countryList=null;
			rs.close();
			stmt.close();
		}
	}
	
	
	
}
