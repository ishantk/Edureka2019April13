
public class MethodsInMemory {
	
	void areaOfCircle(double radius){
		double area = 3.14 * radius * radius;
		System.out.println(">> Area is: "+area);
	}
	
	

	public static void main(String[] args) {
		
		System.out.println(">> main started");
		
		int num1 = 10;
		int num2 = 20;
		
		int result = num1 + num2;
		System.out.println(">> Result is: "+result);
		
		// Object Construction Statement
		MethodsInMemory mRef = new MethodsInMemory();
		mRef.areaOfCircle(6.6);
		
		// System.out.println(">> area is: "+area); // error
		
		System.out.println(">> main finished");

	}

}
