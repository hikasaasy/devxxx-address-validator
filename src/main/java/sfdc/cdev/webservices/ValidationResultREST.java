package sfdc.cdev.webservices;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement  
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ValidationResultREST implements IValidationResult {
	private ValidationResult vr;

	public List<Difference> getDifferences() {
		return vr.getDifferences();
	}

	public Boolean getIsValid() {
		return vr.getIsValid();
	}

	public IAddress getValidAddress() {
		return new AddressREST(vr.getValidAddress());
	}

	public IAddress getTestAddress() {
		return  new AddressREST(vr.getTestAddress());
	}

	// Constructors
	public ValidationResultREST() {
		super();
		vr = new ValidationResult();
	}
	public ValidationResultREST(IAddress address) {
		super();
		vr = new ValidationResult(address);
	}
}