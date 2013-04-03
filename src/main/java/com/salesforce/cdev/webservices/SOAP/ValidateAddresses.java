package com.salesforce.cdev.webservices.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "com.salesforce.cdev.webservices.SOAP.IValidateAddresses") 
public class ValidateAddresses implements IValidateAddresses {
	@Override
	public List<ValidationResultSOAP> validateAddresses(List<AddressSOAP> multipleAddresses) {
		List<ValidationResultSOAP> output = new ArrayList<ValidationResultSOAP>();
		for (AddressSOAP address : multipleAddresses) {
			output.add(new ValidationResultSOAP(address));
		}
		return output;
	}
}