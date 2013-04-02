package sfdc.cdev.webservices;

import java.util.List;

public interface IValidationResult {
	public Boolean getIsValid();
	public IAddress getValidAddress();
	public IAddress getTestAddress();
	public List<Difference> getDifferences();
}
