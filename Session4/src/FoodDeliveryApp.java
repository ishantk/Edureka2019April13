// 2. Textual Representation of an Object User : Structure of User Object
// Whatever we write in class do not belong to class, it belongs to Object
// We code in class which is basically property of Object  :)
class User{
	
	// Attributes : Property of Object and not of class
	String name;
	String phone;
	String email;
	char gender;
	int age;
	String address;
	
	// Constructor : Property of Object and not of class, will be automatically executed when object is created in heap memory
	// NoArg Constructor or Default Constructor
	User(){
		name = "NA";
		phone = "0161 5000017";
		email = "NA";
		gender = 'U';
		age = 18;
		address = "NA";
	}
	
	// Constructor Overloading
	// Parameterized Constructor : Which Takes Inputs
	User(String name, String p, String email, char gender, int age, String address){
		// LHS this.name represents Object's attribute and RHS name represents method's input 
		this.name = name;
		phone = p; // LHS phone is understood as Object's phone attribute and RHS is function's property
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.address = address;
		// this is a reference variable which shall hold the hash code of object
	}
	
	// Methods : Property of Object and not of class
	void writeDataInUser(String name, String p, String email, char gender, int age, String address){
		// LHS this.name represents Object's attribute and RHS name represents method's input 
		this.name = name;
		phone = p; // LHS phone is understood as Object's phone attribute and RHS is function's property
		this.email = email;
		this.gender = gender;
		this.age = age;
		this.address = address;
		// this is a reference variable which shall hold the hash code of object
	}
	
	void showUserDetails(){
		System.out.println("===Details of: "+name+"===");
		System.out.println("Phone\t"+phone);
		System.out.println("Email\t"+email);
		System.out.println("Gedner\t"+gender);
		System.out.println("Age\t"+age);
		System.out.println("Address\t"+address);
		System.out.println("==========================");
	}
}


public class FoodDeliveryApp {

	// Execution of our App shall begin here
	public static void main(String[] args) {
		
		int i = 10;
		
		// 3. Object Construction Statement
		// Create a real object from its drawing i.e. class in the memory
		User u1 = new User();
		// u1 is a reference variable and not an object
		// u1 holds hash code of Object which will be created by new operator in the Heap area dynamically i.e. at Run Time
		
		User u2 = new User();
		
		// Below is not Object Construction:
		User u3 = u1; // This is Reference Copy
		// u3 and u1 are 2 ref vars which will point to the same object !! :)
		
		//User u4 = null; // Reference variable can either have hash codes or nulls in java
		//u4 = new User(); // Object Construction
		
		System.out.println("i is: "+i);
		System.out.println("u1 is: "+u1);
		System.out.println("u2 is: "+u2);
		System.out.println("u3 is: "+u3);
		
		// Write Data in Object !!
		
		/*
		// We shall use Reference Variable and access the attribute of an object with . operator
		u1.name = "John";
		u1.phone = "+91 99999 88888";
		u3.email = "john@example.com";
		u3.gender = 'M';
		u1.age = 20;
		u3.address = "Redwood Shores";
		
		u2.name = "Fionna";
		u2.phone = "+91 77777 88888";
		u2.email = "fionna@example.com";
		u2.gender = 'F';
		u2.age = 22;
		u2.address = "Pristine Magnum";
		
		// Update Data in Object
		u1.name = "John Watson";
		u1.age = 33;
		
		// Read Data from Object
		System.out.println(u1.name+" is "+u1.age+" years old and lives in "+u1.address);
		System.out.println(u2.name+" is "+u2.age+" years old and lives in "+u2.address);
		System.out.println(u3.name+" is "+u3.age+" years old and lives in "+u3.address);
		*/
		// Deletion of Object will be taken care by Garbage Collector Automatically when object is no longer required !!

		// Challenge : if we have to create n-number of objects it will be difficult to write and read data in them
		//			   we will be doing a redundant task to copy paste and write data in object for approx 6 lines of code every time
		
		
		u1.writeDataInUser("John", "+91 99999 88888", "john@example.com", 'M', 20, "Redwood Shores");
		u2.writeDataInUser("Fionna", "+91 77777 88888", "fionna@example.com", 'F', 22, "Pristine Magnum");
		
		u3.showUserDetails(); // as u1 and u3 shall be pointing to the same object
		u2.showUserDetails();
		
		User u4 = new User(); // User(); -> execution of constructor (Default)
		// if we didnt write data some default values are being shown !!
		u4.showUserDetails();
		
		// The moment we create object we write data as well
		User u5 = new User("Mike", "+91 99999 00000", "mike@example.com", 'M', 26, "Country Homes");
		u5.showUserDetails();
		
	}

}
