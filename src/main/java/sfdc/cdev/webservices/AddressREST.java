package sfdc.cdev.webservices;

public class AddressREST implements IAddress {
	private IAddress address;

	// Getters
	public String getLine1() {
		return address.getLine1();
	}

	public String getLine2() {
		return address.getLine2();
	}

	public String getCity() {
		return address.getCity();
	}

	public String getState() {
		return address.getState();
	}

	public String getZipCode() {
		return address.getZipCode();
	}

	public String getCountry() {
		return address.getCountry();
	}

	public String getHTML() {
		return address.getHTML();
	}

	// Setters
	public void setLine1(String value) {
		address.setLine1(value);
	}

	public void setLine2(String value) {
		address.setLine2(value);
	}

	public void setCity(String value) {
		address.setCity(value);
	}

	public void setState(String value) {
		address.setState(value);
	}

	public void setZipCode(String value) {
		address.setZipCode(value);
	}

	public void setCountry(String value) {
		address.setCountry(value);
	}
	
	// Constructors
	public AddressREST() {
		super();
		this.address = new Address();
	}
	public AddressREST(IAddress address) {
		super();
		this.address = address;
	}
}