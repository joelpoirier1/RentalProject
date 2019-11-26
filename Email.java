
public class Email {
	private String email;
	public Email(String email) {
		this.email = email;
	}
	public Email(Name name) {
		this.email = name +"@email.com";
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void sendEmail() {
		System.out.println("Email sent!");
		return;
	}
	public String getEmail() {
		return email;
	}
}