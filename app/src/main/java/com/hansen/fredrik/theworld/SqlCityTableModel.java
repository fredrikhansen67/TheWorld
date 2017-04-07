package com.hansen.fredrik.theworld;

import java.util.List;


public class SqlCityTableModel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] columnNames = {"Id","City","Countrycode","District","Population"};
	
	private List<City> cityList;
	
	public SqlCityTableModel(List<City> theCityList){
		cityList = theCityList;
	}
	
//	public String getColumnId(int col){return columnNames[col];}
//	public String getColumnCityCountrCode(int col){return columnNames[col];}
//	public String getColumnDistrict(int col){return columnNames[col];}
//	public String getColumnPopulation(int col){return columnNames[col];}
//	
	public String getColumnName(int col){return columnNames[col];}
	

	public int getRowCount(){
		return cityList.size();
	}

	public int getColumnCount() {
		return columnNames.length;
	}
	public Object getValueAt(int row, int col){
		City city = cityList.get(row);
		
		switch(col){
		case 0:
			return city.getId();
		case 1: 
			return city.getName();
		case 2: 
			return city.getCountryCode();
		case 4:
			return city.getDistrict();
		case 5:
			return  city.getPopulation();
		default:
				return city.getName();
			
		
		}
	}
	public Class<? extends Object> getColumnClass(int c){
		return getValueAt(0, c).getClass();
	}


	
}
