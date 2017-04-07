package com.hansen.fredrik.theworld;

public class Country {
	
	private String code;
	private String name;
//	private enum Continent {ASIA, EUROPE, NORTT_AMERICA, AFRICA,OCEANIA, ANTARTICA, SOUTH_AMERICA};
	private String region;
	private float SurfaceArea;
	private int IndepYear;
	private int Population;
	private float LifeExpectancy;
	private float GNP;
	private float GNPOld;
	private String LocalName;
	private String governmentForm;
	private String headOfState;
	private int capital;
	private String code2;
	
	
	public Country(String code, String name, String region, float surfaceArea, int indepYear, int population,
			float lifeExpectancy, float gNP, float gNPOld, String localName, String governmentForm, String headOfState,
			int capital, String code2) {
		super();
		this.code = code;
		this.name = name;
		this.region = region;
		SurfaceArea = surfaceArea;
		IndepYear = indepYear;
		Population = population;
		LifeExpectancy = lifeExpectancy;
		GNP = gNP;
		GNPOld = gNPOld;
		LocalName = localName;
		this.governmentForm = governmentForm;
		this.headOfState = headOfState;
		this.capital = capital;
		this.code2 = code2;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public float getSurfaceArea() {
		return SurfaceArea;
	}


	public void setSurfaceArea(float surfaceArea) {
		SurfaceArea = surfaceArea;
	}


	public int getIndepYear() {
		return IndepYear;
	}


	public void setIndepYear(int indepYear) {
		IndepYear = indepYear;
	}


	public int getPopulation() {
		return Population;
	}


	public void setPopulation(int population) {
		Population = population;
	}


	public float getLifeExpectancy() {
		return LifeExpectancy;
	}


	public void setLifeExpectancy(float lifeExpectancy) {
		LifeExpectancy = lifeExpectancy;
	}


	public float getGNP() {
		return GNP;
	}


	public void setGNP(float gNP) {
		GNP = gNP;
	}


	public float getGNPOld() {
		return GNPOld;
	}


	public void setGNPOld(float gNPOld) {
		GNPOld = gNPOld;
	}


	public String getLocalName() {
		return LocalName;
	}


	public void setLocalName(String localName) {
		LocalName = localName;
	}


	public String getGovernmentForm() {
		return governmentForm;
	}


	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}


	public String getHeadOfState() {
		return headOfState;
	}


	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}


	public int getCapital() {
		return capital;
	}


	public void setCapital(int capital) {
		this.capital = capital;
	}


	public String getCode2() {
		return code2;
	}


	public void setCode2(String code2) {
		this.code2 = code2;
	}
	
	
	
	
}
