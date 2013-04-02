package sfdc.cdev.webservices;

public class Address implements IAddress {
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1.trim();
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2.trim();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city.trim();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state.trim();
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode.trim();
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country.trim();
	}

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