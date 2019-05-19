package co.edureka.main;

import java.util.ArrayList;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.model.Certificate;
import co.edureka.model.Student;

public class OneToMany {

	public static void main(String[] args) {
		
		Certificate c1 = new Certificate();
		c1.setName("CCNA");
		
		Certificate c2 = new Certificate();
		c2.setName("OCJP");
		
		Certificate c3 = new Certificate();
		c3.setName("AWS");
		
		List<Certificate> certificates = new ArrayList<Certificate>();
		certificates.add(c1); // 0
		//certificates.add(c2); // 1
		certificates.add(c3); // 2
		
		Student s1 = new Student();
		s1.setName("Kia");
		s1.setCertificates(certificates); // Fulfillment of 1 to Many Relationship
		
		System.out.println(s1);
		
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
	
			session.save(s1); // Saving Student will also save Certificates List in Database
			
			transaction.commit(); // Execute SQL Statements as a transaction
			
			System.out.println(">> Hibernate Executed the SQL Statements :)");
			
		} catch (Exception e) {
			System.out.println(">> Some error: "+e);
			e.printStackTrace(); // to get the line number
		}
		
	}

}
