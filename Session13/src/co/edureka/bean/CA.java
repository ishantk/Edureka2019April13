package co.edureka.bean;

import java.util.Date;

public class CA {
	
	public void sayHello(String name){
		String dateTime = new Date().toString();
		String hello = "Hello, "+name+"\nIts:"+dateTime;
		System.out.println(hello);
	}
	
}
