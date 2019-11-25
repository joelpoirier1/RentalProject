import java.util.ArrayList;

public class Manager extends Person{
	private Report mReport;
	private ArrayList<Property> rentalProperties;
	private Email loginEmail;
	private String loginPassword;
	
	
	public Manager(Name name) {
		super(name);
	}
	public Report getmReport() {
		return mReport;
	}
	public void setReport(Report mReport) {
		this.mReport = mReport;
	}
	public ArrayList<Property> getRentalProperties() {
		return rentalProperties;
	}
	public void addRentalProperties(Property rentalProperty) {
		rentalProperties.add(rentalProperty);
	}
	public Email getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(Email loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	public void propertyStateActive(Property property) {
		
	}
	

}
