package co.edureka.exceptions;

public class MultipleCatch {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		int[] arr = {10, 20, 30, 40, 50};
		
		int a = 10, b = 0, c=0;

		try{
			c = a/b;
			System.out.println(">> arr[1] is: "+arr[1]);
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println(">> Some Exception: "+aRef);
		}catch (ArithmeticException ae) {
			System.out.println(">> Some Arithmetic Exception: "+ae);
		}*/
		catch(Exception e){
			System.out.println(">> Some Exception: "+e);
		}finally{
			System.out.println(">> This is important and must be executed");
			// Memory Cleanup Instructions 
		}
		
		System.out.println(">> c is: "+c);
		
		System.out.println(">> App Finished");

	}

}
