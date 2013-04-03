package com.salesforce.cdev.webservices.SOAP;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlTransient;

import com.salesforce.cdev.webservices.common.Address;
import com.salesforce.cdev.webservices.common.IAddress;

@XmlRootElement
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class AddressSOAP implements IAddress {
	private IAddress address;

	// Getters
	public String getLine1() {
		return address.getLine1();
	}

	public String getLine2() {
		return address.getLine2();
	}

	public String getCity() {
		return address.getCity();
	}

	public String getState() {
		return address.getState();
	}

	public String getZipCode() {
		return address.getZipCode();
	}

	public String getCountry() {
		return address.getCountry();
	}

	public String getId() {
		return address.getId();
	}
	
	@XmlTransient
	public String getHTML() {
		return address.getHTML();
	}

	// Setters
	public void setLine1(String value) {
		address.setLine1(value);
	}

	public void setLine2(String value) {
		address.setLine2(value);
	}

	public void setCity(String value) {
		address.setCity(value);
	}

	public void setState(String value) {
		address.setState(value);
	}

	public void setZipCode(String value) {
		address.setZipCode(value);
	}

	public void setCountry(String value) {
		address.setCountry(value);
	}
	
	public void setId(String value) {
		address.setId(value);
	}
	
	// Constructors
	public AddressSOAP() {
		super();
		this.address = new Address();
	}
	public AddressSOAP(IAddress address) {
		super();
		this.address = address;
	}
}