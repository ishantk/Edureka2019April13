package co.edureka.main;

import co.edureka.model.CB;
import co.edureka.model.CC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.CA;

public class Inheritance {

	public static void main(String[] args) {
		
		// Inheritance Relationship: Multi-Level Relationship :)
		
		CA ca = new CA();
		ca.setNum1(10);
		
		CB cb = new CB();
		cb.setNum1(100);
		cb.setNum2(200);
		
		CC cc = new CC();
		cc.setNum1(1000);
		cc.setNum2(2000);
		cc.setNum3(3000);
		
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
	
			// We are saving 3 different objects in the database.
			session.save(ca);
			session.save(cb);
			session.save(cc);
			
			transaction.commit(); // Execute SQL Statements as a transaction
			
			System.out.println(">> Hibernate Executed the SQL Statements :)");
			
		} catch (Exception e) {
			System.out.println(">> Some error: "+e);
			e.printStackTrace(); // to get the line number
		}
	}

}
