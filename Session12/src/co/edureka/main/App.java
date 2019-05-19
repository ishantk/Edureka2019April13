package co.edureka.main;

import java.applet.Applet;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import co.edureka.model.Connection;

public class App {

	public static void main(String[] args) {
		
		// In Java we write Object construction statement to create object and dump data in it !!
		/*Connection con = new Connection();
		con.setUrl("jdbc:mysql://localhost");
		con.setUser("john.wt");
		con.setPassword("pass@123");
		con.setDbName("edureka");
		
		System.out.println(">> con is: "+con);*/
		
		// Spring FW: Do not create objects !!
		// 			  Spring IOC Container will create objects
		// 		      We should configure the objects in XML File
		// 			  This is known as Inversion of Control | IOC
		
		// Why should we configure an object in XML file ??
		// Because if you need to change data in object, we need to recompile and execute our code :)
		// i.e. we need to change our source code !!
		
		// IOC Container will be responsible to read XML file and create and manage objects on our behalf !!
		
		/* Spring Procedure:
		   1. Create a Bean Class
		   2. Link Spring Core Jar Files in project build path
		   3. Copy anyname.xml file in src directory
		   4. Configure Objects data in that XML file
		   5. In class with main method write IOC Container API to get references to Objects
		   	  5.1. BeanFactory
		   	  5.2. ApplicationContext | implementation of BeanFactory itself
		 */

		// 1. IOC Container - BeanFactory
		//Resource resource = new ClassPathResource("beans.xml"); // Read beans.xml file
		//BeanFactory factory = new XmlBeanFactory(resource);
		
		// We are now not creating an object rather just obtaining reference to the object from BeanFactory IOC Container
		/*Connection c1 = (Connection)factory.getBean("cRef1"); 
		Connection c2 = factory.getBean("cRef2", Connection.class);
		
		System.out.println("c1 is: "+c1);
		System.out.println("c2 is: "+c2);*/
		
		// If we do not request for objects, no object will be created by IOC Container BeanFactory
		
		// 2. IOC Container - ApplicationContext | Better to use
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/*Connection c1 = (Connection)context.getBean("cRef1"); 
		Connection c2 = context.getBean("cRef2", Connection.class);
		
		System.out.println("c1 is: "+c1);
		System.out.println("c2 is: "+c2);*/
		
		// If we do not request for objects, objects will be created by IOC Container ApplicationContext before hand
		
		// singleton : Lets Re-Fetch the same bean again it will always be 1 object
		// prototype : Lets Re-Fetch the same bean again it will always create a new Object
		/*Connection c1 = context.getBean("cRef1", Connection.class);
		Connection c2 = context.getBean("cRef1", Connection.class);
		
		System.out.println("c1 is: "+c1);
		System.out.println("c2 is: "+c2);*/
		
		//Connection c1 = context.getBean("cRef1", Connection.class);
		
		ClassPathXmlApplicationContext cxt = (ClassPathXmlApplicationContext)context; // Downcasting
		cxt.close(); // close IOC Container
		
	}

}
