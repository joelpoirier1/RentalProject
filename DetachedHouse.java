
public class DetachedHouse extends Property{
	private String houseType;
	public DetachedHouse(Landlord landlordName, int bedrooms, int bathrooms, int sqft, int payment,
			int yrbuilt, String status) {
		super(landlordName, bedrooms, bathrooms, sqft, payment, yrbuilt, status);
		this.houseType = "DetachedHouse";
	}

}
