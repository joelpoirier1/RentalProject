import java.util.ArrayList;

public class Landlord extends Person {
	private ArrayList<Property> properties;
	private Email loginEmail;
	private String loginPassword;
	
	public Landlord(Name name) {
		super(name);
	}
	public void Landlord(Email loEmail, String password) {
		this.loginEmail = loEmail;
		this.loginPassword = password;
	}
	public void setPropertyStatus(Property p, String newStatus) {
		for(int i = 0; i < properties.size();i++) {
			if(properties.get(i)==p)
				properties.get(i).status = newStatus;
		}
	}
	public void setProperty(Property p) {
		this.properties.add(p);
	}

}
