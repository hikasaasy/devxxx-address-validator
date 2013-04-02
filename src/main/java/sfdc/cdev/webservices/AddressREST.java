package sfdc.cdev.webservices;

public class AddressREST implements IAddress {
	private IAddress address;

	// Getters
	@Override
	public String getLine1() {
		return address.getLine1();
	}

	@Override
	public String getLine2() {
		return address.getLine2();
	}

	@Override
	public String getCity() {
		return address.getCity();
	}

	@Override
	public String getState() {
		return address.getState();
	}

	@Override
	public String getZipCode() {
		return address.getZipCode();
	}

	@Override
	public String getCountry() {
		return address.getCountry();
	}

	@Override
	public String getHTML() {
		return address.getHTML();
	}

	// Setters
	@Override
	public void setLine1(String value) {
		address.setLine1(value);
	}

	@Override
	public void setLine2(String value) {
		address.setLine2(value);
	}

	@Override
	public void setCity(String value) {
		address.setCity(value);
	}

	@Override
	public void setState(String value) {
		address.setState(value);
	}

	@Override
	public void setZipCode(String value) {
		address.setZipCode(value);
	}

	@Override
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