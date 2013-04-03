package com.salesforce.cdev.webservices.REST;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/rest")
public class Service {
	@POST
	@Path("/validate")
	@Consumes("application/json")
	@Produces("application/json")
	public ValidationResultREST validateAddress(AddressREST address) {
		ValidationResultREST vr = new ValidationResultREST(address);
		return vr;
	}

	@POST
	@Path("/validateMultipleAddress")
	@Consumes("application/json")
	@Produces("application/json")
	public List<ValidationResultREST> validateMultipleAddress(List<AddressREST> multipleAddresses) {
		List<ValidationResultREST> output = new ArrayList<ValidationResultREST>();
		for (AddressREST address : multipleAddresses) {
			output.add(new ValidationResultREST(address));
		}
		return output;
	}

	@GET
	@Path("/getValidAddress")
	@Produces("application/json")
	public AddressREST getValidAddress() {
		ValidationResultREST vr = new ValidationResultREST();
		return (AddressREST) vr.getValidAddress();
	}
}