package sfdc.cdev.webservices;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public class SOAPService {
	public ValidationResultSOAP validateAddress(@WebParam(name = "Address") AddressSOAP address) {
		ValidationResultSOAP vr = new ValidationResultSOAP(address);
		return vr;
	}

	public AddressSOAP getValidAddress() {
		ValidationResultSOAP vr = new ValidationResultSOAP();
		return (AddressSOAP) vr.getValidAddress();
	}
}