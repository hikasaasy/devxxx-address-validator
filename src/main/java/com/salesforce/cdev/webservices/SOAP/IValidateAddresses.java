package com.salesforce.cdev.webservices.SOAP;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name = "ValidateAddresses")
@SOAPBinding(style = Style.DOCUMENT, use= Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface IValidateAddresses {
	@WebMethod(operationName = "ValidateAddresses")
	public List<ValidationResultSOAP> validateAddresses(@WebParam(name = "Address") List<AddressSOAP> multipleAddresses);
}