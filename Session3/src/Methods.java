/*

// Mathematically:
f(x) = x * x
f(2) = 2*2 -> 4

f is the name of function
x and y are inputs
x*x + y*y + 2*x*y is the definition of function

f(x, y) = x*x + y*y + 2*x*y
f(2, 3) = 2*2 + 3*3 + 2*2*3
 
 */

// Function or Method or Procedure or Routine

import java.util.Objects;
import java.util.Scanner; // Scanner is a built in class which is used to read data from Console

public class Methods {
	
	// Method : is created in class
	// void : return type or acknowledgement
	// calculateHike : is name of method, which can be any name of your choice
	// () : input list : it can be containers but here its empty as of now
	// {   } : body or definition i.e. what a function should do
	// all instructions in the definition of function shall be executed in a sequence i.e. one after the other
	
	// non static method or function
	void calculateHike(){
		
		// Object Construction Statement : where you see new operator
		Scanner scanner = new Scanner(System.in);
		// Scanner is an API for us. Application Programming Interfaces !!
		
		System.out.println("Enter Salary of Employee: ");
		int salary = scanner.nextInt(); // Read Integer from Console
		
		System.out.println("Enter Ratings of Employee: ");
		int rating = scanner.nextInt(); // Read Integer from Console
		
		//scanner.close(); // close the scanner to release memory resources
		
		System.out.println("Salary is: "+salary+" and rating is: "+rating);
		
		// Based on Ratings we shall give a hike to employee
		
		int hike = 0; // ideally we should take float/double to include decimal value
		
		if(rating > 3){
			hike = (20*salary)/100;
		}else{
			hike = (10*salary)/100;
		}
		
		salary = salary + hike;
		System.out.println("Hike is: "+hike+" and new Salary is: "+salary);
	}
	
	// static method or function
	static void calculateHikeAgain(){
		
		// Object Construction Statement : where you see new operator
		Scanner scanner = new Scanner(System.in);
		// Scanner is an API for us. Application Programming Interfaces !!
		
		System.out.println("Enter Salary of Employee: ");
		int salary = scanner.nextInt(); // Read Integer from Console
		
		System.out.println("Enter Ratings of Employee: ");
		int rating = scanner.nextInt(); // Read Integer from Console
				
		//scanner.close(); // close the scanner to release memory resources
		
		System.out.println("Salary is: "+salary+" and rating is: "+rating);
		
		// Based on Ratings we shall give a hike to employee
		
		int hike = 0; // ideally we should take float/double to include decimal value
		
		if(rating > 3){
			hike = (20*salary)/100;
		}else{
			hike = (10*salary)/100;
		}
		
		salary = salary + hike;
		System.out.println("Hike is: "+hike+" and new Salary is: "+salary);
	}
	
	// When we will run our java program, main is executed automatically by JVM
	// And whatever we write in main is executed in a sequence 
	public static void main(String[] args) {
		
		// To execute non static method we need to create an Object of Class Methods
		// 1. Object Construction Statement for our class Methods
		//Methods mRef = new Methods();
		
		// Execution of non static method. 
		//mRef.calculateHike(); 
		//mRef.calculateHike();
		// if we wish to have some task to be repeated again and again we can write that task as a method
		
		// To execute a static method we need no Objects.class just use the class name
		//Methods.calculateHikeAgain();
		//Methods.calculateHikeAgain();
		
		int numberOfEmployes = 2;
		for(int i=1;i<=numberOfEmployes;i++){
			Methods.calculateHikeAgain();
		}
		
	}

}
