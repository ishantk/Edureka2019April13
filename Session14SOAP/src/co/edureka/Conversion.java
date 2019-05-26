package co.edureka;

import java.util.Date;

// SOAP based Web Service Implementation
// Conversion Class represents Web Service
// Object of WebService Conversion shall be created by Server itself automatically !!
public class Conversion {

	// Web Method is a method in Object. 
	// It should always return some response i.e. it must have return type associated
	// It must be public
	public int mtrsToCms(int mtrs){
		int cms = mtrs * 100;
		return cms;
	}
	
	public int feetToInches(int feet){
		int inches = feet * 12;
		return inches;
	}
	
	public int dollarToINR(int dollar){
		int inr = dollar * 70;
		return inr;
	}
	
	// Method can use DBHelper to save record in Database. We can even use Spring / Hibernate to save data !!
	public String registerUser(String email, String phone){
		Date date = new Date();
		String response = email+" Registered Successfully at "+date;
		return response;
	}
	
}
