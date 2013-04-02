package sfdc.cdev.webservices;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement  
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class ValidationResultREST implements IValidationResult {
	private ValidationResult vr;

	@Override
	public List<Difference> getDifferences() {
		return vr.getDifferences();
	}

	@Override
	public Boolean getIsValid() {
		return vr.getIsValid();
	}

	@Override
	public IAddress getValidAddress() {
		return new AddressREST(vr.getValidAddress());
	}

	@Override
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