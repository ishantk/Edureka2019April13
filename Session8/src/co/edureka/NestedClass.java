package co.edureka;

class Outer{
	void show(){
		System.out.println(">> This is show of Outer");
	}
	
	class Inner{
		void show(){
			System.out.println(">> This is show of Inner");
		}
	}
}

public class NestedClass {

	public static void main(String[] args) {
		
		Outer oRef = new Outer();
		Outer.Inner iRef = oRef.new Inner(); // Object in an Object (Containment Relationship)
		
		oRef.show();
		iRef.show();
		
		String s1 = "john";
		String s2 = "john";
		
		if(s1.compareTo(s2) == 0){
			System.out.println(">> Strings are Equal");
		}
		
		// ArrayList<Employee> list = new ArrayList<Employee>(); | Sort ArrayList on the basis of salary or age or experience ??
		// Comparable and Comparator APIs to sort the Collection with Objects defined by Developer
		// Serialization/ Deserialization
		// Saving the state(data) of an Object in File -> Serialization
		// Reading the state(data) of an Object from File and create object back in Program -> Deserialization
	}

}
