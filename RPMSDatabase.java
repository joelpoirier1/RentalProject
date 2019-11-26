import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import com.mysql.cj.protocol.Resultset;


import javafx.scene.chart.PieChart.Data;

//
//import java.sql.Connection;
//import java.sql.Driver;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;
//public class RPMSDatabase {
//	private Connection conn;
//	/**
//	 * initialize the connection to the jdbc
//	 */
//	public void initializeConnection() {
//		try {
//			Driver driver = new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
////			Class.forName("com.mysql.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "Tjxdatabase");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//	/**
//	 * close connection to database
//	 */
//	public void closeConnection() {
//		try {
//			conn.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//	/**
//	 * insert property with arguments, usually by lanlord or manager
//	 */
//	public void insertProperty(String propertytype,Landlord landlordName, int bedrooms, int bathrooms, int sqft, int payment,
//			int yrbuilt, String status) {
//		try {
//			String email = landlordName.getpName().getFistName()+"@email.com";
//			String sql = "INSERT INTO property(PropertyType,Owner, Bedrooms, Bathrooms, Sqft, Status,payment,YrBuilt)VALUES(?,?,?,?,?,?,?,?)";
//			PreparedStatement stmt = conn.prepareStatement(sql);
//			stmt.setString(1, propertytype);
//			stmt.setString(2, email);
//			stmt.setInt(3, bedrooms);
//			stmt.setInt(4, bathrooms);
//			stmt.setInt(5, sqft);
//			stmt.setString(6, status);
//			stmt.setInt(7, payment);
//			stmt.setInt(8, yrbuilt);
//			int count = stmt.executeUpdate();
//			System.out.println(count);
//			System.out.println("Insert successful!");
//			stmt.close();
//		} catch (SQLException e) {
//			System.out.println("problem inserting property");
//			e.printStackTrace();
//		}
//
//	}
//	public synchronized void updatePropertyStatus(Property p, String newStatus) {
//		PreparedStatement stmt = null;
//		try {
//			 	String type = p.getPropertyType();
//			 	Name name = p.getLandlordName().pName;
//			 	Email email = new Email(name);
//			 	String e = email.getEmail();
//			 	int bedr= p.getBedrooms();
//			 	int bathr= p.getBathrooms();
//				String sql = "UPDATE property SET Status = ? WHERE PropertyType =? AND Owner = ? ANDBedrooms = ? ADN Bathrooms = ?";
//				stmt = conn.prepareStatement(sql);
//				stmt.setString(1, newStatus);
//				stmt.setString(2, type);
//				stmt.setString(3,e);
//				stmt.setInt(4, bedr);
//				stmt.setInt(5,bathr);
//				stmt.executeUpdate();
//				stmt.close();
//			} catch (SQLException e) {
//				System.out.println("problem updating property status");
//				e.printStackTrace();
//			}
//	 }
//	public void createPropertyTable() {
//		return;
//	}
//
////	public static void main(String[] args) {
////		RPMSDatabase myRpms = new RPMSDatabase();
////		myRpms.initializeConnection();
////		
////		Landlord l = new Landlord(new Name("TE","ST"));
////		Property p = new Apartment(l, 10, 10, 10,10, 10, "Available");
////		myRpms.insertProperty("Apartment", l, 10, 10, 10, 10, 10, "Available");
//////		myRpms.updatePropertyStatus(p, "NonAvailable");
////		
////
////		myRpms.closeConnection();
////	}
//	
//
//}

public class RPMSDatabase {
	private Connection conn;
	private ResultSet rs;
	/**
	 * initialize the connection to the jdbc
	 */
	public void initializeConnection() {
		try {
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
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
	public void insertProperty(int x, String propertytype,Landlord landlordName, int bedrooms, int bathrooms, int sqft, int payment,
			int yrbuilt, String status,String address) {
		try {
			String email = landlordName.getpName().getName()+"@email.com";
			String sql = "INSERT INTO property(PropertyID,PropertyType,Owner, Bedrooms, Bathrooms, Sqft, Status,payment,YrBuilt,Address)VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, x );
			stmt.setString(2, propertytype);
			stmt.setString(3, email);
			stmt.setInt(4, bedrooms);
			stmt.setInt(5, bathrooms);
			stmt.setInt(6, sqft);
			stmt.setString(7, status);
			stmt.setInt(8, payment);
			stmt.setInt(9, yrbuilt);
			stmt.setString(10, address);
			int count = stmt.executeUpdate();
			System.out.println(count);
			System.out.println("Insert successful!");
			stmt.close();
		} catch (SQLException e) {
			System.out.println("problem inserting property");
			e.printStackTrace();
		}

	}


	public boolean checkUsername(String email, String accountType) {
		return true;
	}
	public boolean checkPassword(String password, String email, String accountType) {
		return true;
	}
//	private static int getRandomNumberInRange(int min, int max) {
//		
//	        return min + (int)(Math.random() * ((max - min) + 1));
//	    
//	}
	
	public void updatePropertyStatus(String address, String newStatus) throws SQLException {
		PreparedStatement stmt = null;
//		String type = p.getPropertyType();
//		Name name = p.getLandlordName().pName;
//		Email email = new Email(name);
//		String e = email.getEmail();
//		int bedr= p.getBedrooms();
//		int bathr= p.getBathrooms();
		String sql = "UPDATE property SET Status = ? WHERE Address = ?";
		stmt = conn.prepareStatement(sql);
		stmt.setString(1, newStatus);
		stmt.setString(2, address);
//		stmt.setString(3, e);
//		stmt.setInt(4, bedr);
//		stmt.setInt(5,bathr);
		int count = stmt.executeUpdate();
		System.out.println(count);
		System.out.println("Update successful!");
		stmt.close();
	}
	public void generateReport() {
		String sql = "SELECT * FROM PROPERTY";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet data = stmt.executeQuery(sql);
			this.rs = data;
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Here is the result of your query:");
			int columnsNumber = rsmd.getColumnCount();
			if(rs.next()==false) {
				System.out.println("The database is empty!!");
			}else{
				System.out.println("Periodic Report of listed House:");
				System.out.println("------------------------------------------------------------------------");
				do {
					for (int i = 1; i <= columnsNumber; i++) {
						if (i > 1) 
							System.out.print(",  ");
						String columnValue = rs.getString(i);
						System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
					}
					System.out.println("");
			}while (rs.next());				
		}
			
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Search by all condition
	 */
	public void searchByAllCondition(String houseType, int bedrooms, int bathrooms) {
		String sql = "SELECT * FROM property WHERE PropertyType = '"+houseType+"' AND Bedrooms = '"+bedrooms+"'AND Bathrooms = '"+bathrooms+"'";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
//			stmt.setString(1, houseType);
//			stmt.setInt(2, bedrooms);
//			stmt.setInt(3, bathrooms);
			ResultSet data = stmt.executeQuery(sql);
			this.rs = data;
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Here is the result of your query:");
			int columnsNumber = rsmd.getColumnCount();
			if(rs.next()==false) {
				System.out.println("Sorry... no result found. Check it out later!");
			}else{
				do {
					for (int i = 1; i <= columnsNumber; i++) {
						if (i > 1) 
							System.out.print(",  ");
						String columnValue = rs.getString(i);
						System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
					}
					System.out.println("");
			}while (rs.next());				
		}
			
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

