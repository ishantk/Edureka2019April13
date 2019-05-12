package co.edureka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.edureka.model.User;

public class DBHelper {

	Connection con; // con is a reference variable which shall point to Connection Object
	
	// 1. Load the Driver -> We will do it in Constructor
	public DBHelper(){
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> 1. Driver Loaded");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// 2. Create Connection with DataBase	  
	public void createConnection(){
		try {
			
			String url = "jdbc:mysql://localhost/edureka";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println(">> 2. Connection Created");
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	// 3. Write SQL Statement and Execute it
	public int registerUser(User user){ 
		
		int i = 0;
		
		try {
			
			String sql = "insert into User values(null, ?, ?, ?)";
			PreparedStatement pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.name);
			pStmt.setString(2, user.email);
			pStmt.setString(3, user.password);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return i;
	}
	
	// 3. Write SQL Statement and Execute it - Login
	public int loginUser(User user){ 
		
		int i = 0;
		
		try {
			// SQL Query to authenticate user in DataBase :)
			String sql = "select * from User where email = ? and password = ?";
			PreparedStatement pStmt = con.prepareStatement(sql);
			pStmt.setString(1, user.email);
			pStmt.setString(2, user.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			if(rs.next()){ // Record Exists
				user.name = rs.getString(2);
				i = 1; // we will have i as 1 for successful authentication
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
		return i;
	}
	
	// 4. Close the Connection
	public void closeConnection(){
		try {
			con.close();
			System.out.println(">> 4. Connection Closed");
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}		
	}
	
}
