
public class AttachedHouse extends Property{
	private String houseType;
	public AttachedHouse(int r,Landlord landlordName, int bedrooms, int bathrooms, int sqft, int payment,
			int yrbuilt, String status, String address) {
		super(r, landlordName, bedrooms, bathrooms, sqft, payment, yrbuilt, status, address);
		this.houseType = "AttachedHouse";
	}

}
