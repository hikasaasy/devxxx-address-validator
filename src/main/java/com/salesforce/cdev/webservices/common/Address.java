package com.salesforce.cdev.webservices.common;

public class Address implements IAddress {
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	public String getLine1() {
		return line1;
	}

	public void setLine1(String value) {
		this.line1 = (value == null) ? null : value.trim();
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String value) {
		this.line2 = (value == null) ? null : value.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String value) {
		this.city = (value == null) ? null : value.trim();
	}

	public String getState() {
		return state;
	}

	public void setState(String value) {
		this.state = (value == null) ? null : value.trim();
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String value) {
		this.zipCode = (value == null) ? null : value.trim();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String value) {
		this.country = (value == null) ? null : value.trim();
	}

	public String getHTML() {
		String out = "";
		
		out += line1 + "<br/>";
		out += line2 + "<br/>";
		out += city + "<br/>";
		out += state + "<br/>";
		out += zipCode + "<br/>";
		out += country + "<br/>";
		
		return  out;
	}
}