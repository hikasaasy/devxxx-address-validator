package sfdc.cdev.webservices;

public class Address implements IAddress {
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	@Override
	public String getLine1() {
		return line1;
	}

	@Override
	public void setLine1(String line1) {
		this.line1 = line1.trim();
	}

	@Override
	public String getLine2() {
		return line2;
	}

	@Override
	public void setLine2(String line2) {
		this.line2 = line2.trim();
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public void setCity(String city) {
		this.city = city.trim();
	}

	@Override
	public String getState() {
		return state;
	}

	@Override
	public void setState(String state) {
		this.state = state.trim();
	}

	@Override
	public String getZipCode() {
		return zipCode;
	}

	@Override
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode.trim();
	}

	@Override
	public String getCountry() {
		return country;
	}

	@Override
	public void setCountry(String country) {
		this.country = country.trim();
	}


	@Override
	public String getHTML() {
		String out = "";
		
		out += line1 + "<br/>";
		out += line2 + "<br/>";
		out += city + "<br/>";
		out += state + "<br/>";
		out += zipCode + "<br/>";
		out += country + "<br/>";
		
		return  out;
	}
}