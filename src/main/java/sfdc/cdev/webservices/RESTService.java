package sfdc.cdev.webservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/rest")
public class RESTService {
	@POST
	@Path("/validate")
	@Consumes("application/json")
	@Produces("application/json")
	public ValidationResultREST validateAddress(AddressREST addressRest) {
		ValidationResultREST vr = new ValidationResultREST(addressRest);
		return vr;
	}
	
	
	 @GET
	 @Path("/getValidAddress")
	 @Produces("application/json")
	 public AddressREST getValidAddress() {	 
		 ValidationResultREST vr = new ValidationResultREST();
		 return (AddressREST) vr.getValidAddress();
	 }	
}