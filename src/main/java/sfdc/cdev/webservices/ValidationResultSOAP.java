package sfdc.cdev.webservices;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement  
@XmlAccessorType(XmlAccessType.NONE)
public class ValidationResultSOAP implements IValidationResult {
	private ValidationResult vr;

	@Override
	@XmlElement
	public List<Difference> getDifferences() {
		return vr.getDifferences();
	}

	@Override
	@XmlElement
	public Boolean getIsValid() {
		return vr.getIsValid();
	}

	@Override
	@XmlElement
	public AddressSOAP getValidAddress() {
		return new AddressSOAP(vr.getValidAddress());
	}

	@Override
	@XmlElement
	public AddressSOAP getTestAddress() {
		return new AddressSOAP(vr.getTestAddress());
	}

	// Constructors
	public ValidationResultSOAP() {
		super();
		vr = new ValidationResult();
	}
	public ValidationResultSOAP(IAddress address) {
		super();
		vr = new ValidationResult(address);
	}
}