
public class BreakAndContinue {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++){
			
			if(i > 5){
				break; // terminate the loop
			}
			
			System.out.println("(B) i is: "+i);
			
		}
		
		System.out.println("*******");
		
		
		for(int i=1; i<=10; i++){
			
			if(i < 5){
				continue; // takes the loop in next iteration by skipping below statements
			}
			
			System.out.println("(C) i is: "+i);
			
		}
		
		// explore goto label in java in context of loops
		

	}

}
