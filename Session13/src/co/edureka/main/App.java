package co.edureka.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.bean.CB;
import co.edureka.bean.Father;
import co.edureka.bean.Manager;
import co.edureka.bean.Son;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Father father = context.getBean("fRef",Father.class);
		//System.out.println(father);
		
		//Son son = context.getBean("sRef",Son.class);
		//System.out.println(son);
		
//		Manager manager = context.getBean("mRef",Manager.class);
//		System.out.println(manager);
//		
//		System.out.println("==Certificates==");
//		System.out.println(manager.getCertificates());
		
		CB cRef = context.getBean("cb", CB.class);
		cRef.getCa().sayHello("Fionna");

	}

}
