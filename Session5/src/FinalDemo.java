final class X{ // final class cannot be inherited
	
	final void show(){ // final method cannot be overrided by child
		
	}
}

// Below are Rule Books and if we make them final they will be of no use !! Hence, final keyword isnt allowed !!

//final interface Inf{ // error
	
//}

//final abstract class AC{ // error
	
//}

class Y{ // extends X{ : error
	// error
//	void show(){ // Overriding
//		
//	}
	
}


public class FinalDemo {

	// Property of class and cannot be modified
	// Symbolic Constants
	final static String companyName = "ABC International";
	
	public static void main(String[] args) {
		
		int x = 10;
		x = 100; // we can modify x
		
		// cannot be modified
		final int y = 10;
		//y = 100; // we cannot modify y : error
		
		System.out.println(">> "+FinalDemo.companyName);

	}

}
