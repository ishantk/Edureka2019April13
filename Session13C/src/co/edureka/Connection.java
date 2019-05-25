package co.edureka;

public class Connection {

	// Created 1 Connection Object within the class itself
	private static Connection con = new Connection();
	
	// No one outside the class can now create objects of Connection
	private Connection(){
		System.out.println(">> Connection Object Constructed");
	}
	
	public static Connection getConnection(){
		return con;
	}
	
}
