package com.salesforce.cdev.webservices.SOAP;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(name = "MultipleMessages")
@SOAPBinding(style = Style.DOCUMENT, use= Use.LITERAL, parameterStyle=ParameterStyle.WRAPPED)
public interface IMultipleMessages {
	@WebMethod(operationName = "validateAddress")
	public ValidationResultSOAP validateAddress(@WebParam(name = "Address") AddressSOAP address);

	@WebMethod(operationName = "validateMultipleAddresses")
	public List<ValidationResultSOAP> validateMultipleAddress(@WebParam(name = "Addresses") List<AddressSOAP> multipleAddresses);

	@WebMethod(operationName = "getValidAddress")
	public AddressSOAP getValidAddress();
}