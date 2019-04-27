/*class Cab{
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	void bookCab(String source, String destinition){
		System.out.println(">> Cab Booked from "+source+" to "+destinition);
	}
}*/

// abstract class cannot have objects
// So as developer we will now not be able to create object of Cab
// We cannot create Objects, but RTE i.e. JVM will create Parent object and then the Child Object
/*abstract class Cab{
	
	Cab(){
		System.out.println(">> Cab Object Constructed");
	}
	
	// Hence, definition of bookCab is no longer required
//	void bookCab(String source, String destinition){
//		System.out.println(">> Cab Booked from "+source+" to "+destinition);
//	}
	
	// Create the method as abstract, which can be only done in an abstract class as a rule
	// abstract method has no definition
	// abstract method becomes a RULE create by Parent, which child must define
	// for n number of abstract methods we got n number of rules to be defined by children
	abstract void bookCab(String source, String destinition);
	
	// Concrete Method -> not a rule
	void show(){
		System.out.println(">> This is show");
	}
}*/

// Lets Refine RTP to the Best !!
interface Cab{
	
	// interface cannot have constructor : Neither we, nor RTE can create its objects
//	Cab(){
//		System.out.println(">> Cab Object Constructed");
//	}
	
	
	// Rule not by Parent
	void bookCab(String source, String destinition); //-> public abstract void bookCab(String source, String destinition);
	
	// We cannot have Concrete Method -> not a rule
//	void show(){
//		System.out.println(">> This is show");
//	}
}
// interfaces are not extended i.e. they cannot be Parent !!
// interfaces they cannot have objects and hence, we have no object to object inheritance coming into this concept
// Hence, no Parent Child Relationship w.r.t. interface 
class UberGo implements Cab{//extends Cab{
	UberGo(){
		System.out.println(">> UberGo Object Constructed");
	}
	
	// Overriding
	public void bookCab(String source, String destinition){ // This has to be defined as its a rule in Parent
		System.out.println(">> UberGo Booked from "+source+" to "+destinition);
	}
}

class UberPremier implements Cab{//extends Cab{
	UberPremier(){
		System.out.println(">> UberPremier Object Constructed");
	}
	
	// Overriding
	public void bookCab(String source, String destinition){
		System.out.println(">> UberPremier Booked from "+source+" to "+destinition);
	}
}

class UberHire implements Cab{//extends Cab{
	UberHire(){
		System.out.println(">> UberHire Object Constructed");
	}
	
	// Overriding
	public void bookCab(String source, String destinition){
		System.out.println(">> UberHire Booked from "+source+" to "+destinition);
	}
}


// Run Time Polymorphism
public class RTP {

	public static void main(String[] args) {
		
		//Cab cRef = new Cab();
		
		/*
		Cab cRef;
		cRef = new Cab();
		cRef.bookCab("Pristine Magnum", "Country Homes");
		*/
		
		/*
		UberGo uRef;
		uRef = new UberGo();
		uRef.bookCab("Pristine Magnum", "Country Homes"); // Execute Child's Version and not Parent's Version
		*/

		Cab cRef; // reference variabl of Parent i.e. Cab
		
		// Rule4: Parent's Reference Variable can Point to Child Object but vice versa isn't allowed
		
		// RTP : Run Time Polymorphism
		// Ref Variable of interface can point to the object which implements it !!
		cRef = new UberGo(); // ref var of Parent is pointing to the object of child
		cRef.bookCab("Pristine Magnum", "Country Homes"); // UberGo : overriding
		//System.out.println("cRef is: "+cRef);
		
		System.out.println();
		
		cRef = new UberPremier();
		cRef.bookCab("Pristine Magnum", "Country Homes"); // UberPremier : overriding
		//System.out.println("cRef is: "+cRef);
		
		System.out.println();
		
		cRef = new UberHire();
		cRef.bookCab("Pristine Magnum", "Country Homes"); // UberHire : overriding
		//System.out.println("cRef is: "+cRef);
		
		// Same ref var cRef is pointing to different child objects . Polymorphism i.e. more than 1 form
		// with same ref variable we are executing the same bookCab method which shall give different outputs at run time
		
		System.out.println();
		
		// Below statements are not specific
		//cRef = new Cab();
		//cRef.bookCab("Pristine Magnum", "Country Homes"); // Is this execution meaningful ??
		
		// We shall refine the program so that no cab object can be created directly and hence no bookCab method on Cab Object shall be executed !!
	}

}
