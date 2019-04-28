interface Inf1{
	// Attributes:
	int i = 10; 	// public static final int i = 10;
	
	// Methods: Rules
	// abstract method : which will have no definition
	// 					it can be created only in abstract class or interfaces :)
	void show();	// public abstract void show();
	void hello();   // public abstract void hello();
}

interface Inf2{
	void show();
	void bye();
}

// 3. Interface to Interface
//    Supports Multiple Inheritance
interface Inf extends Inf1, Inf2{
	
}

class CA implements Inf{//Inf1, Inf2{ // This is Multiple Implementation and not Multiple Inheritance
	
	public void show(){
		System.out.println(">> This is show from CA");
	}
	
	public void hello(){
		System.out.println(">> This is hello from CA");
	}
	
	public void bye(){
		System.out.println(">> This is bye from CA");
	}
	
	// Regular or concrete method
	void sayHello(String name){
		System.out.println(">> Hello "+name+" !!");
	}
}

public class InfDemo {

	public static void main(String[] args) {
		
		// Polymorphic Statement : Reference Variable of Interface can point to the object which implements it
		/*Inf1 iRef1 = new CA(); 
		
		iRef1.show();
		iRef1.hello();
		//iRef1.bye(); // error
		
		System.out.println();
		
		Inf2 iRef2 = new CA();
		iRef2.show();
		iRef2.bye();
		//iRef2.hello(); // error
		
		System.out.println("i is "+Inf1.i);
		System.out.println("i is "+CA.i); // Class which implements Interface can access attributes of that interface
										  // Since attributes are final hence, they are just read only variables
		//Inf1.i = 100; // error
		*/
		
		Inf iRef = new CA();
		iRef.show();
		iRef.hello();
		iRef.bye();
		System.out.println("i is "+Inf.i);
		
		// With Ref Var of Interface we can access only those methods which belongs it !!
		//iRef.sayHello("John"); // error
		
		CA cRef = new CA();
		cRef.show();
		cRef.hello();
		cRef.sayHello("John");
		cRef.bye();
	}

}
