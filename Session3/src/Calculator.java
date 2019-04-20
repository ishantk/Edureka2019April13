
public class Calculator {

	void add(int num1, int num2){
		int result = num1 + num2;
		System.out.println(num1+ " and "+num2+" addition is: "+result);
	}
	
	// if we use the same method name again, we will get error
	// this error will only come if inputs are also same
	// * same in type and same in number
	//void add(int num1, int num2){
	/*void add(int n1, int n2){
		int result = n1 + n2;
		System.out.println(n1+ " and "+n2+" addition is: "+result);
	}*/
	
	// We can use the same method name again, only if we have **different inputs** 
	// Polymorphism : Compile Time Polymorphism (Method Overloading)
	void add(int num1, int num2, int num3){
		int result = num1 + num2+ num3;
		System.out.println(num1+ ", "+num2+" and "+num3+" addition is: "+result);
	}
	
	void add(double num1, double num2){
		double result = num1 + num2;
		System.out.println(num1+ " and "+num2+" addition is: "+result);
	}
	
	void add(int num1, double num2){
		double result = num1 + num2;
		System.out.println(num1+ " and "+num2+" addition is: "+result);
	}
	
	void add(double num1, int num2){
		double result = num1 + num2;
		System.out.println(num1+ " and "+num2+" addition is: "+result);
	}
	
	
	
	// Rule to Overloading
	/*
	 	1. Method name should be same
	 	2. Inputs must be unique i.e. different
	 		2.1 number of inputs (increase or decrease and type shall be same)
	 		2.2 type of inputs (change the types)
	 		2.3 Sequence of Inputs
	 	3. Return type has no role to play
	 	
	 */
	
	public static void main(String[] args) {
		
		Calculator cRef = new Calculator();
		cRef.add(10, 20); 		// Linking Method Execution with Definition. This linking is done by Compiler !!
		cRef.add(10, 20, 30);
		
		cRef.add(2.2, 3.3);
		
		cRef.add(12, 2.2);
		cRef.add(2.2, 13.7);
	}

}
