import java.util.ArrayList;

public class RegisteredRenter extends Person implements Observer{
	private Email loginEmail;
	private String loginPassword;
	private Property properties;
	private String houseStatus;
	
	public RegisteredRenter(Name name) {
		super(name);
	}

	@Override
	public void update(String houseStatus) {
		this.houseStatus = houseStatus;
		System.out.println();
		System.out.println("\nNotification to RegisteredRenter house observer: house status Changed");		
	}
	
	public void sendEmail(Landlord l){
		System.out.println("Email sent!");
	}
	public void setEmail() {
		String s  =this.pName + "@email.com";
		this.loginEmail.setEmail(s);
	}

	

}
