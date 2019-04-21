// Textual representation of a Counter Object
class Counter{
	
	int count;			// property of object
	static int sCount;  // property of class
	
	// Constructor : Property of Object
	// we do not have static constructors -> error to have them
	Counter(){
		count = 1;
		sCount = 1;
	}
	
	// method : property of object. can access property of class
	void incrementCounter(){
		count++; // increment by 1
		sCount++;
	}
	
	// method : property of object. can access property of class
	void showCount(){
		System.out.println(">> count is: "+count+" and sCount is: "+sCount);
	}
}


public class Quiz {

	public static void main(String[] args) {
		
		Counter c1 = new Counter(); // c1: 1 1
		Counter c2 = new Counter(); // c2: 1 1
		Counter c3 = c1;			// Reference Copy | c3 and c1 points to the same object
		
		c1.incrementCounter();		// c1: 2 2
		c2.incrementCounter();		// c2: 2 3
		c3.incrementCounter();		// c1: 3 // c3 and c1 is same 4
		
		c1.incrementCounter();		// c1 : 4 5
		c2.incrementCounter();		// c2 : 3 6
		c3.incrementCounter();		// c1 : 5 7
		
		c3.incrementCounter();		// c1 : 6 

		Counter c4 = new Counter(); //         1
		
		// sCount will be same for all objects. it is a common attribute for objects which is in the Class as a Container
		c1.showCount(); // >> count is: 6 and sCount is: 1
		c2.showCount(); // >> count is: 3 and sCount is: 1
		c3.showCount(); // >> count is: 6 and sCount is: 1
		
	}

}
