package com.salesforce.cdev.webservices.SOAP;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "com.salesforce.cdev.webservices.SOAP.IMultipleMessages") 
public class MultipleMessages implements IMultipleMessages {
	@Override
	public ValidationResultSOAP validateAddress(AddressSOAP address) {
		ValidationResultSOAP vr = new ValidationResultSOAP(address);
		return vr;
	}

	@Override
	public List<ValidationResultSOAP> validateMultipleAddress(List<AddressSOAP> multipleAddresses) {
		List<ValidationResultSOAP> output = new ArrayList<ValidationResultSOAP>();
		for (AddressSOAP address : multipleAddresses) {
			output.add(new ValidationResultSOAP(address));
		}
		return output;
	}

	@Override
	public AddressSOAP getValidAddress() {
		ValidationResultSOAP vr = new ValidationResultSOAP();
		return (AddressSOAP) vr.getValidAddress();
	}
}