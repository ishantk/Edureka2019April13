package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Employee;


/*
 	Hibernate Procedure:
 	1. Create a Java Object Structure
 	2. Link hibernate jar files with your project
 	3. Link database driver jar file with your project
 	4. Copy hibernate.cfg.xml file in src directory and change it as per your database :)
 	5. Copy anyname.hbm.xml file in src directory and change it as per your java class :)
 	6. In client class with main method, execute hibernate APIs
 */

public class Client {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(null, "Mike Meo", "Chief Engr", "+91 99999 00088", 90000);

		Employee e2 = new Employee();
		e2.setEid(null);
		e2.setName("Sia Shawn");
		e2.setDesignation("Admin");
		e2.setPhone("+91 9800 9876 11");
		e2.setSalary(55000);

		System.out.println(e1);
		System.out.println(e2);
		
		// Objects are constructed in RAM. Objects are temporary :)
		// We need to save the object data in database.
		
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Reads hibernate.cfg.xml file
			
			factory = config.buildSessionFactory(); // obtain SessionFactory from Configuration
			
			session = factory.openSession(); // Create Connection with Database
			
			transaction = session.beginTransaction(); // Perofrm any operation in hibernate as a transaction
			
			// save method will insert the data in database by creating a table Employee automatically :)
			session.save(e1);
			session.save(e2);
			
			transaction.commit(); // Execute SQL Statements as a transaction
			
			System.out.println(">> Hibernate Executed the SQL Statements :)");
			
		} catch (Exception e) {
			System.out.println(">> Some error: "+e);
			e.printStackTrace(); // to get the line number
		}
		
		
	}

}
