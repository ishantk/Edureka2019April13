
public class MethodSytanx {

	// Method with Inputs but no return
	void addNumbers(int num1, int num2){
		int num3 = num1 + num2;
		System.out.println("Sum of "+num1+" and "+num2+" is: "+num3);
	}
	
	// Method with Input(s) and return
	// int is now return type which means any integer value should be returned back from the method
	int squareOfNumber(int num){
		int square = num * num;
		return square; // last statement of function
	}
	
	// Method with no Inputs and no return
	void sayHello(){
		System.out.println(">> This is Hello from Java");
	}
	
	public static void main(String[] args) {
		
		MethodSytanx mRef = new MethodSytanx();
		
		mRef.addNumbers(10, 20);
		mRef.addNumbers(13, 29);
		
		int result = mRef.squareOfNumber(7);
		System.out.println("Square of 7 is: "+result);
		System.out.println("Square of 9 is: "+mRef.squareOfNumber(9));
		
		mRef.sayHello();
		

	}

}
