package sfdc.cdev.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name = "SOAPService")
@SOAPBinding(style = Style.DOCUMENT, use= Use.LITERAL)
public interface ISOAPService {	
	@WebMethod(operationName = "validateAddress")
	public ValidationResultSOAP validateAddress(@WebParam(name = "Address") AddressSOAP address);

	@WebMethod(operationName = "getValidAddress")
	public AddressSOAP getValidAddress();
}
