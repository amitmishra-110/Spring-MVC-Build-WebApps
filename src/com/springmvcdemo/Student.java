package com.springmvcdemo;

import java.util.LinkedHashMap;

public class Student
{
	
	private String firstName;
	private String lastName;
	private String country;
	//for loading country from Model class
	private LinkedHashMap<String,String> countryOptions;
	private String[] favOs;
	
	public String[] getFavOs() {
		return favOs;
	}

	public void setFavOs(String[] favOs) {
		this.favOs = favOs;
	}

	private String favLang;
	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}

	
	
	
	
	public String getCountry() {
		
		countryOptions=new LinkedHashMap<String, String>();
		
		countryOptions.put("BR","BRAZIL");
		countryOptions.put("FR","FRANCE");
		countryOptions.put("DE","GERMANY");
		countryOptions.put("IN","INDIA");
		
		return country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Student()
	{
	
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
