package co.edureka.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import co.edureka.model.Employee;

/*
 	 1. Load the Driver
 	 	  Driver is a .jar file which will be provided by DB Vendor
 	 	  .jar is a collection of many .class files (Java Archive) | Library
 		  1.1 Download .jar file from DB vendor's Web site
 		  1.2 Link the .jar file with our project
 		  1.3 Use API Class.forname to load the Driver in our Java Program
 		  
 	2. Create Connection with DataBase	  
 		2.1 URL, username, password for the DataBase
 		2.2 Use API's Connection and DriverManager to create Connection with database
 		
 	3. Write SQL Statement and Execute it
 		3.1 Write SQL Statement to be execute like below: 
 		String sql = "insert into Employee values(null, 'Jack', '+91 98765 98765', 'jack@example.com', 47500)";
 		3.2 Use API's either Statement or PreparedStatement to perform SQL Statement execution
 		
 	4. Close the Connection
 		use method close to close the connection
 */

// Data Access Object -> We created a class DBHelper which shall be used to perform DB Operations by following OOPS
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
	public void insertEmployee(Employee emp){ // Lets take Employee Object as input to the method
		try {
			
			/*
			// Write SQL Statement, but we have concatenated data in SQL Statement :)
			// We have substituted the data in the SQL Statement
			String sql = "insert into Employee values(null, '"+emp.name+"', '"+emp.phone+"', '"+emp.email+"', "+emp.salary+")";
			
			// Execute Statement
			Statement stmt = con.createStatement(); // Get Reference to Statement API Object
			int i = stmt.executeUpdate(sql); // executeUpdate method will perform 3 SQL Execution -> 1. insert, 2. update, 3. delete
			
			if(i>0){
				System.out.println(">> 3. Employee "+emp.name+" inserted");
			}else{
				System.out.println(">> 3. Employee "+emp.name+" not inserted");
			}
			*/
			String sql = "insert into Employee values(null, ?, ?, ?, ?)";
			PreparedStatement pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.name);
			pStmt.setString(2, emp.phone);
			pStmt.setString(3, emp.email);
			pStmt.setInt(4, emp.salary);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> 3. Employee "+emp.name+" inserted");
			}else{
				System.out.println(">> 3. Employee "+emp.name+" not inserted");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void updateEmployee(Employee emp){ // Lets take Employee Object as input to the method
		try {
			
			
			String sql = "update Employee set name = ?, phone = ?, email = ?, salary = ? where eid = ?";
			PreparedStatement pStmt = con.prepareStatement(sql);
			pStmt.setString(1, emp.name);
			pStmt.setString(2, emp.phone);
			pStmt.setString(3, emp.email);
			pStmt.setInt(4, emp.salary);
			pStmt.setInt(5, emp.eid);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> 3. Employee "+emp.name+" Updated");
			}else{
				System.out.println(">> 3. Employee "+emp.name+" not Updated");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void deleteEmployee(int eid){ 
		try {
			
			String sql = "delete from Employee where eid = ?";
			PreparedStatement pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, eid);
			
			int i = pStmt.executeUpdate();
			
			if(i>0){
				System.out.println(">> 3. Employee with "+eid+" Deleted");
			}else{
				System.out.println(">> 3. Employee with "+eid+" not Deleted");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}	
	
	public void fetchEmployees(){ 
		try {
			
			String sql = "select * from Employee"; // Read all rows from Table
			PreparedStatement pStmt = con.prepareStatement(sql);
			 
			// ResultSet shall contain all the fetched rows :)
			ResultSet rs = pStmt.executeQuery(); // executeQuery method is used to fetch records in a ResultSet
			
			// We will read data from ResultSet and put it into an Object
			while(rs.next()){
				Employee emp = new Employee();
				emp.eid = rs.getInt(1);  // emp.eid = rs.getInt("eid");
				emp.name = rs.getString(2);
				emp.phone = rs.getString(3);
				emp.email = rs.getString(4);
				emp.salary = rs.getInt(5);
				
				System.out.println(emp);
				System.out.println("------------------------------------------------");
			}
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void executeProcedure(Employee emp){ // Lets take Employee Object as input to the method
		try {
			String sql = "{ call addEmployee(?, ?, ?, ?) }";
			CallableStatement cStmt = con.prepareCall(sql);
			cStmt.setString(1, emp.name);
			cStmt.setString(2, emp.phone);
			cStmt.setString(3, emp.email);
			cStmt.setInt(4, emp.salary);
			
			cStmt.execute();
			
			System.out.println(">> Procedure Executed !!");
			
		} catch (SQLException e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public void executeBatch(){ 
		try {
			
			String sql1 = "delete from Employee where eid = 6";
			String sql2 = "update Employee set ename = 'Ms Daisy Donna', salary = 95900 where eid = 7"; // thr is a problem in SQL Statement -> ename is not the column
			
			
			Statement stmt = con.createStatement();
			
			con.setAutoCommit(false); // We shall manage transaction
			
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			stmt.executeBatch();
			con.commit(); // Execute the batch as a Transaction
			
			System.out.println(">> Transaction Executed !!");
			
		} catch (SQLException e) {
			
			System.out.println(">> OOPS!! Some Error Occured !! :(");
			
			try {
				con.rollback();
				System.out.println(">> We have RollBacked Transaction");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
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
