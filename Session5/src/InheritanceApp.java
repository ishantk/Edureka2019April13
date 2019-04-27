class Parent{
	
	// Attributes of Parent
	int wealth;
	String fname;
	String lname;
	
	Parent(){
		wealth = 10000;
		fname = "John";
		lname = "Watson";
		System.out.println(">> Parent Object Constructed");
	}
	
	void showDetails(){
		System.out.println("==================");
		System.out.println(">> Parent Details");
		System.out.println(">> Name: "+fname+" "+lname);
		System.out.println(">> Wealth: "+wealth);
		System.out.println("==================");
	}
}

// Textual Representation how an Object will look like in memory
class Child extends Parent{ // IS-A Relation
	
	// Attributes of Child
	String companyName;
	int salary;
	String fname; // fname over here is property of Child Object, which is also in Parent object
	
	Child(){
		System.out.println(">> Child Object Constructed");
		fname = "Harry"; // fname is of Child and not of Parent
		super.fname = "George";
		companyName = "ABC International";
		salary = 50000;
	}
	
	// We re-defined the method of parent in child with same name and signature
	// Overriding
	void showDetails(){
		
		//super.showDetails();
		
		System.out.println("==================");
		System.out.println(">> Child Details");
		System.out.println(">> Name is: "+fname+" "+lname); // fname is Child Object's Property whereas lname is Parent Object's Property
		System.out.println(">> Company: "+companyName);
		System.out.println(">> Salary: "+salary);
		System.out.println("==================");
	}
	
	void showParentsDetails(){
		super.showDetails(); // Execute showDetails of Parent
		// super is a reference variable which shall point to parent object
	}
}

/*
 	Parent
 	   |
 	Child   
 */

public class InheritanceApp {

	public static void main(String[] args) {
		
		// Object Construction Statement
		//Parent pRef = new Parent();
		
		Child cRef = new Child();
		
		// Rule 1: Before the Object of Child, Parent Object is Constructed !!
		// Rule 2: With the Child, we can access properties of Parent !!
		// Rule 3: Within the Child, we can re create the same property of Parent !! In this case Child's version will be executed !!
		
		// Child is updating data for Parent !!
		//cRef.fname = "Leo";
		cRef.wealth = 250000;
		
		cRef.fname = "Mike"; // This is updating child's property itself as fname now belongs to child 
		
		//cRef.showDetails(); // We are accessing showDetails() of parent
		
		cRef.showDetails(); // if we have showDetails method available in Child also, than Child's version shall be executed 
		cRef.showParentsDetails();
	}

}
