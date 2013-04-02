package sfdc.cdev.webservices;

import javax.jws.WebService;

@WebService(endpointInterface = "sfdc.cdev.webservices.ISOAPService") 
public class SOAPService implements ISOAPService {
	@Override
	public ValidationResultSOAP validateAddress(AddressSOAP address) {
		ValidationResultSOAP vr = new ValidationResultSOAP(address);
		return vr;
	}

	@Override
	public AddressSOAP getValidAddress() {
		ValidationResultSOAP vr = new ValidationResultSOAP();
		return (AddressSOAP) vr.getValidAddress();
	}
}