import java.util.ArrayList;

public class Property implements Subject{
	private int randomGeneratedNum;
	private String propertyType;
	private Landlord landlordName;
	private int bedrooms;
	private int bathrooms;
	private int sqft;
	private int payment;
	private int yrbuilt;
	private String address;
	String status;
	private ArrayList<Observer> observers;
	
	public Property(int r, Landlord landlordName, int bedrooms, int bathrooms, int sqft, int payment,
			int yrbuilt, String status, String address) {
		this.randomGeneratedNum = r;
		this.landlordName = landlordName;
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.sqft = sqft;
		this.payment = payment;
		this.yrbuilt = yrbuilt;
		this.status = status;
		this.address = address;
	}
	public String getPropertyType() {
		return propertyType;
	}
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
		o.update(status);
		
	}
	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
		
	}
	@Override
	public void notifyObservers() {
		for(int i = 0; i< observers.size();i++) {
			Observer o = observers.get(i);
			o.update(status);
		}
		
	}
	public Landlord getLandlordName() {
		return landlordName;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	

}
