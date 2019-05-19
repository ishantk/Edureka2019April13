package co.edureka.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Manager;
import co.edureka.model.Project;

public class OneToOne {

	public static void main(String[] args) {
		
		Project project = new Project();
		project.setName("Celox");
		project.setTechnology("JEE");
		project.setDuration(4);
		project.setNumOfEmps(5);
		
		
		Manager manager = new Manager();
		manager.setName("George Watson");
		manager.setEmail("george.w@example.com");
		manager.setPhone("+91 99999 88888");
		manager.setSalary(60000);
		
		// Fulfillment of HAS-A Relationship
		manager.setProject(project); // 1 to 1
		project.setManager(manager); // 1 to many
		
		System.out.println(manager);
		
		// Hibernate Code to save data in DB
		Configuration config = null;
		SessionFactory factory = null;
		Session session = null;
		Transaction transaction = null;
		
		try {
			
			config = new Configuration();
			config.configure(); // Reads hibernate.cfg.xml file

			
			factory = config.buildSessionFactory(); // obtain SessionFactory from Configuration
			
			session = factory.openSession(); // Create Connection with Database
			
			transaction = session.beginTransaction(); // Perform any operation in hibernate as a transaction
	
			session.save(manager); // Saving Manager will also save Project in Database
			
			transaction.commit(); // Execute SQL Statements as a transaction
			
			System.out.println(">> Hibernate Executed the SQL Statements :)");
			
		} catch (Exception e) {
			System.out.println(">> Some error: "+e);
			e.printStackTrace(); // to get the line number
		}

	}

}
