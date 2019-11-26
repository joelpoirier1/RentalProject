
public class Apartment extends Property {
	private String houseType;
	public Apartment(int r, Landlord landlordName, int bedrooms, int bathrooms, int sqft, int payment,
			int yrbuilt, String status, String address) {
		super(r, landlordName, bedrooms, bathrooms, sqft, payment, yrbuilt, status, address);
		this.houseType = "Apartment";
	}

}
