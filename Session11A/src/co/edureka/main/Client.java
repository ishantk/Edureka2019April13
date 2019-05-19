package co.edureka.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

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
		
		/*Employee e1 = new Employee(null, "Jack", "Chief Engr", "+91 99900 10088", 70000);

		Employee e2 = new Employee();
		e2.setEid(null);
		e2.setName("George");
		e2.setDesignation("Admin");
		e2.setPhone("+91 9111 9876 11");
		e2.setSalary(55000);*/

		/*System.out.println(e1);
		System.out.println(e2);*/
		
		// Objects are constructed in RAM. Objects are temporary :)
		// We need to save the object data in database.
		
		//Configuration config = null;
		AnnotationConfiguration config = null;
		SessionFactory factory = null;
		Session session = null;
		Session anotherSession = null; // multiple sessions
		Transaction transaction = null;
		
		try {
			
			//config = new Configuration();
			//config.configure(); // Reads hibernate.cfg.xml file
			
			config = new AnnotationConfiguration();
			config.configure();
			
			factory = config.buildSessionFactory(); // obtain SessionFactory from Configuration
			
			session = factory.openSession(); // Create Connection with Database
			
			transaction = session.beginTransaction(); // Perform any operation in hibernate as a transaction
			
			// 1. Insert Operation in DB
			// save method will insert the data in database by creating a table Employee automatically :)
			//session.save(e1);
			//session.save(e2);
			
			// 2. Fetch Single Record from DB
			/*Employee emp = (Employee)session.get(Employee.class, 5);
			System.out.println(emp);
			
			// 3. Update Data in DB. Before update get the data !!
			emp.setName("Jack Johnson");
			emp.setSalary(78900);
			session.update(emp);*/
			
			// 4. Delete data from DB
			/*Employee emp = new Employee();
			emp.setEid(5); // we just need id which is primary key value
			
			session.delete(emp);*/
			
			// 5. Fetch All Records from DB
			// 5.1 HQL i.e. Hibernate Query Language
			//String hql = "From Employee"; // select * from Employee
			/*String hql = "From Employee where salary > 55000"; // select * from Employee where salary > 60000
			List<Employee> employees = session.createQuery(hql).list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			// Lets say we do not wish to explore HQL
			// 5.2 Use Criteria API
			/*Criteria criteria = session.createCriteria(Employee.class);
			criteria.add(Restrictions.gt("salary", 55000));
			//criteria.add(Restrictions.between(propertyName, lo, hi));
			List<Employee> employees = criteria.list();
			for(Employee emp : employees){
				System.out.println(emp);
			}*/
			
			//session.createSQLQuery("").addEntity(Employee.class) | Explore this SQL Query in Hibernate
			
			
			// Execute a batch of 100 SQL Statements
			/*for(int i=1;i<=100;i++){
				Employee emp = new Employee(null, "Emp"+i, "SE", "+91 99999 888"+i, 30000+i);
				session.save(emp);
			}*/
			
			// Fetch 2 records using session.get api
			Employee e1 = (Employee)session.get(Employee.class, 2);
			System.out.println(e1);
			Employee e2 = (Employee)session.get(Employee.class, 4);
			System.out.println(e2);
			
			// Re-Fetch the same records again
			Employee e3 = (Employee)session.get(Employee.class, 2);
			System.out.println(e3);
			Employee e4 = (Employee)session.get(Employee.class, 4);
			System.out.println(e4);
			
			
			transaction.commit(); // Execute SQL Statements as a transaction
			
			System.out.println(">> Hibernate Executed the SQL Statements :)");
			
		} catch (Exception e) {
			System.out.println(">> Some error: "+e);
			e.printStackTrace(); // to get the line number
		}finally {
			session.close(); // Till session is not closed, it will maintain data fetched in cache automatically
		}
		
		
	}

}
