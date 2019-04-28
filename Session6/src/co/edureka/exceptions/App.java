package co.edureka.exceptions;

public class App {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");

		int[] arr = {10, 20, 30, 40, 50};
		try{
			System.out.println(">> arr[10] is: "+arr[10]); // now we know 10th index does not exist
		}/*catch(ArrayIndexOutOfBoundsException aRef){
			System.out.println(">> Some Exception Occurred !!");
		}*/
		catch(Exception eRef){ // Exception is Parent to all the exceptions : RTP
			//System.out.println(">> Some Exception Occurred !!"+eRef);
			eRef.printStackTrace(); // This will show line number as well
		}
		
		System.out.println(">> App Finished");
		
	}

}
