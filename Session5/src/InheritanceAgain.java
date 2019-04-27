// Textual Representation how an Object will look like
class CA{
	
	int a;			// Property of Object
	static int b;	// Property of Class
	
	// Property of Object
	CA(){
		a = 10;
		b = 20; // Object's Property can access Class's Property
		System.out.println(">> CA Object Constructed");
	}
	
	// Property of Object
	void showObjectData(){
		System.out.println(">> a is: "+a);
	}
	
	// Property of Class
	static void showClassData(){
		System.out.println(">> b is: "+b);
	}
	
}

// Textual Representation how an Object will look like
class CB extends CA{
	
	// Property of Object
	CB(){
		System.out.println(">> CB Object Constructed");
	}
	
	// We re-defined Parent's method in Child (Object Property) -> Overriding
	void showObjectData(){
		super.showObjectData(); // super is a ref var which points to Parent object
		System.out.println("## a is: "+a);
	}
	
	// We re-defined Parent's method in Child (Class Property) -> Hiding
	static void showClassData(){
		CA.showClassData();  // Access Parent's data with Class name directly
		System.out.println("## b is: "+b);
	}
	
}

/*
 	CA
 	 |
 	CB
 */

public class InheritanceAgain {

	public static void main(String[] args) {
		
		CB cRef = new CB(); // Object Construction Statement
		// R1 : Before Object of Child, Object of Parent shall be constructed 
		
		cRef.showObjectData(); // Since, Child object has no showObjectData method, it will execute Parent's Object method

		
		CB.showClassData(); 	// Since, Child Class has no showClassData method, it will execute Parent Class's method
		//cRef.showClassData();   // Static can be accessed by non static. Object and Object's reference can access Class's Property !!
	}

}
