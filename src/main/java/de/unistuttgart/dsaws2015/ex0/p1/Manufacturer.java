package de.unistuttgart.dsaws2015.ex0.p1;

public class Manufacturer {
	private String name;
	private String street;
	private String city;
	private String country;
	
	
	public Manufacturer() {
		this.name="DefaultName";
		this.street="DefaultStreet";
		this.city="DefaultCity";
		this.country="DefaultCountry";
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
