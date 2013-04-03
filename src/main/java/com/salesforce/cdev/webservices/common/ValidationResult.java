package com.salesforce.cdev.webservices.common;

import java.util.ArrayList;
import java.util.List;

public class ValidationResult implements IValidationResult {
	// IValidationResult	
	public Boolean getIsValid() {
		return isValid;
	}
	
	public Address getValidAddress() {
		Address validAddress = new Address();
		
		validAddress = new Address();
		validAddress.setId("Salesforce.com HQ");
		validAddress.setLine1("One Market");
		validAddress.setLine2("Suite 300");
		validAddress.setCity("San Francisco");
		validAddress.setState("CA");
		validAddress.setZipCode("94105");
		validAddress.setCountry("USA");
		return validAddress;
	}
	
	public IAddress getTestAddress() {
		return testAddress;
	}
	
	public List<Difference> getDifferences() {
		return differences;
	}

	// private variables
	private IAddress testAddress;
	private List<Difference> differences;
	private Boolean isValid;
		
	// Constructors
	public ValidationResult() {
		// Nothing
	}
	public ValidationResult(IAddress testAddress) {
		this.testAddress = testAddress;
		validate();
	}
	
	// Methods
	private void validate() {
		isValid = true;
		differences = new ArrayList<Difference>();
		Address validAddress = getValidAddress();
		
		isValid &= validatePart("Line1", testAddress.getLine1(), validAddress.getLine1());
		isValid &= validatePart("Line2", testAddress.getLine2(), validAddress.getLine2());
		isValid &= validatePart("City", testAddress.getCity(), validAddress.getCity());
		isValid &= validatePart("State", testAddress.getState(), validAddress.getState());
		isValid &= validatePart("ZipCode", testAddress.getZipCode(), validAddress.getZipCode());
		isValid &= validatePart("Country", testAddress.getCountry(), validAddress.getCountry());
	}
	private Boolean validatePart(String fieldName, String testValue, String validValue) {
		Boolean isValidPart = true;
		
		if ((testValue == null) || (!testValue.equalsIgnoreCase(validValue))) {
			isValidPart = false;
			differences.add(new Difference(fieldName, validValue, testValue));
		}
		
		return isValidPart;
	}
}