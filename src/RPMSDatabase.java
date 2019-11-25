import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class RPMSDatabase {
	private Connection conn;
	/**
	 * initialize the connection to the jdbc
	 */
	public void initializeConnection() {
		try {
            //Driver driver = new com.mysql.jdbc.Driver();
            //DriverManager.registerDriver(driver);
//			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "Tjxdatabase");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	/**
	 * close connection to database
	 */
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * insert property with arguments, usually by lanlord or manager
	 */
	public void insertProperty(String propertytype,Landlord landlordName, int bedrooms, int bathrooms, int sqft, int payment,
			int yrbuilt, String status) {
		try {
			String email = landlordName.getpName().getFistName()+"@email.com";
			String sql = "INSERT INTO property(propertytype,Owner, bedrooms, bathrooms, sqft, status,payment,yrbuilt)";
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Insert successful!");
			stmt.close();
		} catch (SQLException e) {
			System.out.println("problem inserting property");
			e.printStackTrace();
		}
;
	}
	 public void updatePropertyStatus(Property p, String newStatus) {
		 try {
			 	String type = p.getPropertyType();
			 	Name name = p.getLandlordName().pName;
			 	Email email = new Email(name);
			 	int bedr= p.getBedrooms();
			 	int bathr= p.getBathrooms();
				String sql = "UPDATE property SET Status = newStatus WHERE PropertyType = type, Owner = email,Bedrooms = bedr, Bathrooms = bathr";
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(sql);
				stmt.close();
			} catch (SQLException e) {
				System.out.println("problem updating property status");
				e.printStackTrace();
			}
	 }
	public void createPropertyTable() {
		return;
	}
	public void testDemo() {
		String sql = "update property set bedrooms = 500 where PropertyType = 'Apartment', Owner = 'AB@email.com'";
		try {
			Statement stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args)  {
		RPMSDatabase myRpms = new RPMSDatabase();
		myRpms.initializeConnection();
		
		Landlord l = new Landlord(new Name("TE","ST"));
		Property p = new Apartment(l, 10, 10, 10,10, 10, "Available");
		myRpms.insertProperty("Apartment", l, 10, 10, 10, 10, 10, "Available");
//		myRpms.updatePropertyStatus(p, "NonAvailable");
		

		myRpms.closeConnection();
	}
	

}
