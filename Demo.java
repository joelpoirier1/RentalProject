import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class Demo {
/*
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		Name name = new Name("Jack", "K");
//		String test = name.getName();
//		System.out.printf("%s", test);
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "Tjxdatabase");
		String sql = "update account set balance = 500 where id = 1";
		Statement stmt = conn.createStatement();
		int count = stmt.executeUpdate(sql);
		System.err.println(count);
		stmt.close();
		conn.close();
	}

*/
	public static void main(String[] args) throws SQLException, IOException {
		RPMSDatabase myRpms = new RPMSDatabase();
		myRpms.initializeConnection();
		
//		Landlord l = new Landlord(new Name("TE","ST"));
//		Property p = new Apartment(59,l, 10, 10, 10,10, 10, "Available","58ave Calgary Alberta");
//		myRpms.insertProperty(generateRandomInRange(10,100),"Apartment", l, 10, 10, 10, 10, 10, "Available","105 20ave Calgary");
//		myRpms.insertProperty(generateRandomInRange(10,100),"DetachedHouse", l, 11, 12, 13, 14, 15, "Available","202 10ave Calgary");
//		myRpms.updatePropertyStatus("2ave Calgary", "Available");
		/*
		int i = generateRandomInRange(10,100);
		System.out.println(i);
		int j = generateRandomInRange(10,100);
		System.out.println(j);
		*/
		Scanner input = new Scanner(System.in);
		System.out.println("Who are you?(1.Regular Renter,2.Registered Renter, 3.LandLord, 4.Manager)");
		int choice = input.nextInt();
		if(choice == 1 ) {
			System.out.println("Select Function you want to use?(1.Search House, 2 Exit)");
			int choiceOne = input.nextInt();
			if(choiceOne==1) {
				System.out.println("Enter the type of the Property(1.Apartment, 2.TownHouse, 3.DetachedHouse, 4.AttachecHouse):");
				int num = input.nextInt();
				String houseType  = " ";
				if(num == 1)
					houseType = "Apartment";
				if(num ==2)
					houseType = "TownHouse";
				if(num ==3)
					houseType = "DetachedHouse";
				if(num ==4)
					houseType = "AttachedHouse";
				if(num != 1 && num !=2 && num!=3 && num!=4) {
					System.err.println("Bad input");
					System.exit(1);
				}
				System.out.println("Enter the number of the bedrooms:");
				int bedrooms = input.nextInt();
				System.out.println("Enter the number of the bathrooms:");
				int bathrooms = input.nextInt();
				myRpms.searchByAllCondition(houseType, bedrooms, bathrooms);
			
			}
			else if(choiceOne==2) {
			System.err.println("Exit System");
			System.exit(1);
			}
			
		}
		if(choice == 2) {
			System.out.println("Enter username:");
			String username = input.next();
			if(!myRpms.checkUsername(username,"Registered Renter")) {
				System.err.println("Invalid Username!");
				System.exit(1);
			}
			System.out.println("Enter password:");
			String password = input.next();
			if(!myRpms.checkPassword(password,username,"Registered Renter")) {
				System.err.println("Invalid password!");
				System.exit(1);
			}
			System.out.println("Login successfully!");
			System.out.println("Select Function you want to use?(1.Search House, 2 Exit)");
			int choiceOne = input.nextInt();
			if(choiceOne==1) {
				System.out.println("Enter the type of the Property(1.Apartment, 2.TownHouse, 3.DetachedHouse, 4.AttachecHouse):");
				int num = input.nextInt();
				String houseType  = " ";
				if(num == 1)
					houseType = "Apartment";
				if(num ==2)
					houseType = "TownHouse";
				if(num ==3)
					houseType = "DetachedHouse";
				if(num ==4)
					houseType = "AttachedHouse";
				if(num != 1 && num !=2 && num!=3 && num!=4) {
					System.err.println("Bad input");
					System.exit(1);
				}
				System.out.println("Enter the number of the bedrooms:");
				int bedrooms = input.nextInt();
				System.out.println("Enter the number of the bathrooms:");
				int bathrooms = input.nextInt();
				myRpms.searchByAllCondition(houseType, bedrooms, bathrooms);
			
			}
			else if(choiceOne==2) {
			System.err.println("Exit System");
			System.exit(1);
			}
			
		}
		
		if(choice== 3) {
			System.out.println("Enter username:");
			String username = input.next();
			if(!myRpms.checkUsername(username,"Registered Renter")) {
				System.err.println("Invalid Username!");
				System.exit(1);
			}
			System.out.println("Enter password:");
			String password = input.next();
			if(!myRpms.checkPassword(password,username,"Registered Renter")){
				System.err.println("Invalid password!");
				System.exit(1);
			}
			System.out.println("Login successfully!");
			System.out.println("Select Function you want to use?(1.Property Registration, 2.Updating state of property, 3. Exit)");
			int choiceThree = input.nextInt();
			if(choiceThree== 1) {
				System.out.println("Enter the type of your Property(1.Apartment, 2.TownHouse, 3.DetachedHouse, 4.AttachecHouse)");
				int num = input.nextInt();
				String houseType  = " ";
				if(num == 1)
					houseType = "Apartment";
				if(num ==2)
					houseType = "TownHouse";
				if(num ==3)
					houseType = "DetachedHouse";
				if(num ==4)
					houseType = "AttachedHouse";
				if(num != 1 && num !=2 && num!=3 && num!=4) {
					System.err.println("Bad input");
					System.exit(1);
				}
				System.out.println("Enter the number of the bedrooms:");
				int bedrooms = input.nextInt();
				System.out.println("Enter the number of the bathrooms:");
				int bathrooms = input.nextInt();
				System.out.println("Enter your firstname:");
				String firstname = input.next();
				System.out.println("Enter your lastname:");
				String lastname = input.next();
				System.out.println("Enter the sqft of your property:");
				int sqft = input.nextInt();
				System.out.println("Enter the address of your property:");
				String address = input.next();
				System.out.println("Enter the monthly payment of your property:");
				int payment = input.nextInt();
				System.out.println("Enter the year built of your property:");
				int yrbuilt = input.nextInt();
				Landlord l = new Landlord(new Name(firstname,lastname));
				myRpms.insertProperty(generateRandomInRange(10,100),houseType, l, bedrooms, bathrooms, sqft, payment, yrbuilt, "Available",address);
			}
			if(choiceThree==2) {
				System.out.println("Enter the address of your property:");
				String address = input.next();
				System.out.println("What status do you want to update?");
				String newStatus = input.next();
				myRpms.updatePropertyStatus(address, newStatus);
			}
			else if(choiceThree==3) {
				System.out.println("Exit System");
				System.exit(1);
			}
		}
		
		if(choice==4) {
			System.out.println("Enter username:");
			String username = input.next();
			if(!myRpms.checkUsername(username,"Registered Renter")) {
				System.err.println("Invalid Username!");
				System.exit(1);
			}
			System.out.println("Enter password:");
			String password = input.next();
			if(!myRpms.checkPassword(password,username,"Registered Renter")){
				System.err.println("Invalid password!");
				System.exit(1);
			}
			System.out.println("Login successfully!");
			System.out.println("Select Function you want to use?(1.Updating state of property, 2.Asking for Report, 3. Exit)");
			int choiceFour = input.nextInt();
			if(choiceFour == 1) {
				System.out.println("Enter the address of the property you would like to update:");
				String address = input.next();
				System.out.println("What status do you want to update?");
				String newStatus = input.next();
				myRpms.updatePropertyStatus(address, newStatus);
			}
			if(choiceFour==2) {
				System.out.println("Generating...");
				myRpms.generateReport();
			}
			else if(choiceFour == 3) {
				System.out.println("Exit System");
				System.exit(1);
			}
		}
		
		
		
		
		myRpms.closeConnection();
	}

	public static int generateRandomInRange(int min, int max) {
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	

}
