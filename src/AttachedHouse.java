
public class AttachedHouse extends Property{
	private String houseType;
	public AttachedHouse(Landlord landlordName, int bedrooms, int bathrooms, int sqft, int payment,
			int yrbuilt, String status) {
		super(landlordName, bedrooms, bathrooms, sqft, payment, yrbuilt, status);
		this.houseType = "AttachedHouse";
	}

}
