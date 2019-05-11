package co.edureka.main;

import co.edureka.dao.DBHelper;
import co.edureka.model.Employee;

public class App {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		e1.eid = 0;
		e1.name = "John Watson";
		e1.phone = "+91 97756 00111";
		e1.email = "john.watson@example.com";
		e1.salary = 77312;
		/*
		Employee e2 = new Employee(0, "Leo", "+91 99956 77777", "leo@example.com", 75000);
		
		System.out.println(e1);
		System.out.println(e2);
		*/
		
		// Challenge : Data is in the Object. Object is in the RAM. RAM is Volatile.
		// Data shall be lost and we must save data of Employee Object
		// 1. Files -> Plain Files eg: .csv / .json / .html or etc
		// 2. XML -> Tag Based 
		// 3. DataBase -> Tables
		
		// DAO - Data Access Object
		// 1. Load the Driver
		DBHelper db = new DBHelper();
		// 2. Create Connection with Database
		db.createConnection();
		// 3. Write and Execute SQL Statement
		//db.insertEmployee(e1);
		//db.insertEmployee(e2);
		
		//db.updateEmployee(e1);
		
		//db.deleteEmployee(3);
		
		//db.fetchEmployees();
		
		//db.executeProcedure(e1);
		
		db.executeBatch();
		
		// 4. Close Connection
		db.closeConnection();
	}

}
