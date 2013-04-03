package com.salesforce.cdev.webservices.SOAP;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

import com.salesforce.cdev.webservices.common.Difference;
import com.salesforce.cdev.webservices.common.IAddress;
import com.salesforce.cdev.webservices.common.IValidationResult;
import com.salesforce.cdev.webservices.common.ValidationResult;

@XmlRootElement  
@XmlAccessorType(XmlAccessType.NONE)
public class ValidationResultSOAP implements IValidationResult {
	private ValidationResult vr;

	@XmlElement
	public List<Difference> getDifferences() {
		return vr.getDifferences();
	}

	@XmlElement
	public Boolean getIsValid() {
		return vr.getIsValid();
	}

	@XmlElement
	public AddressSOAP getValidAddress() {
		return new AddressSOAP(vr.getValidAddress());
	}

	@XmlElement
	public AddressSOAP getTestAddress() {
		return new AddressSOAP(vr.getTestAddress());
	}

	// Constructors
	public ValidationResultSOAP() {
		super();
		vr = new ValidationResult();
	}
	public ValidationResultSOAP(IAddress address) {
		super();
		vr = new ValidationResult(address);
	}
}