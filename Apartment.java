
public class Apartment extends Property {
	private String houseType;
	public Apartment(Landlord landlordName, int bedrooms, int bathrooms, int sqft, int payment,
			int yrbuilt, String status) {
		super(landlordName, bedrooms, bathrooms, sqft, payment, yrbuilt, status);
		this.houseType = "Apartment";
	}

}
