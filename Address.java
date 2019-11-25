
public class Address {
	private String city;
	private String street;
	private String postcode;
	private int houseNum;
	public Address() {
		this.city = " ";
		this.street = " ";
		this.postcode = " ";
		this.houseNum = 0;
	}
	public Address(int num,String street, String city, String postcode) {
		this.city = city;
		this.street = street;
		this.postcode = postcode;
		this.houseNum = num;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	
	
}
