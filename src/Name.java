
public class Name {
	private String firstName;
	private String lastName;
	public Name() {
		this.firstName = " ";
		this.lastName = " ";
	}
	public String getName() {
		return firstName + lastName;
	}
	public Name(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	public String getFistName() {
		return firstName;
	}
	public void setFistName(String fistName) {
		this.firstName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
