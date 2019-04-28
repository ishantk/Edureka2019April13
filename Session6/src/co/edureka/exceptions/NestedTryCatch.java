package co.edureka.exceptions;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int a = 10, b = 0, c=0;

		try{
			try{
				c = a/b;
			}catch(ArithmeticException ae){
				System.out.println(">> Arithmetic Exception !!");
			}finally{
				System.out.println(">> finally1");
			}
			System.out.println(">> arr[10] is: "+arr[10]);
		}catch(ArrayIndexOutOfBoundsException aRef){
			//System.out.println(">> Some Exception: "+aRef);
			System.out.println("Some Error Occurred !!");
		}finally{
			System.out.println(">> finally2");
		}
		
		System.out.println(">> c is: "+c);
		
		System.out.println(">> App Finished");

	}

}
