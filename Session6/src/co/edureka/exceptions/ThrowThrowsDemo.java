package co.edureka.exceptions;

// Any Exception which is child of RuntimeException falls under the category of UNCHECKED Exception
// Hence, MyBankingException IS-AN UNCHECKED Exception
class MyBankingException extends RuntimeException{
	MyBankingException(String message){
		super(message);
	}
}

// Any class which is not the child of RuntimeException falls under the category of CHECKED Exceptions
//Hence, YourBankingException IS-A CHECKED Exception
class YourBankingException extends Exception{
	YourBankingException(String message){
		super(message);
	}
}

class Banking{
	
	int balance = 10000;
	int minBalance = 2500;
	int attempts = 0;
	
	void withdraw(int amount) throws YourBankingException{
		
		balance = balance - amount;
		
		if(balance<=2500){
			balance = balance + amount;
			System.out.println(">> \u20b9"+amount+" cannot be withdrawn balance is Low: \u20b9"+balance);
			attempts++;
		}else{
			System.out.println(">> \u20b9"+amount+" withdrawn and new balance is: \u20b9"+balance);
		}
		
		
		/*if(attempts==3){
			// Throwing an UNCHECKED Exception. ArithmeticException is Child of RuntimeException
			//ArithmeticException aRef = new ArithmeticException("Illegal Attempts made: "+attempts);
			//throw aRef; // Let us crash the program ourselves
			
			// Throwing an UNCHECKED MyBankingException which is a Customized Exception. MyBankingException is Child of RuntimeException
			MyBankingException mRef = new MyBankingException("Illegal Attempts made: "+attempts);
			throw mRef;
		}*/
		
		if(attempts==3){
			// Throwing an CHECKED YourBankingException which is a Customized Exception. YourBankingException is Child of Exception
			YourBankingException yRef = new YourBankingException("Illegal Attempts made: "+attempts);
			throw yRef; // we get error while throwing a CHECKED Exception
		}
		
	}
	
}

public class ThrowThrowsDemo {

	public static void main(String[] args) {
	
		System.out.println(">> Banking Started");

		Banking bRef = new Banking();
		
		// What can be loss to the bank if such attempts happens ?? : Banks Resources shall be occupied. Performance of Bank Software shall degrade !!
		try{
			for(int i=1;i<=500;i++){
				bRef.withdraw(3000);
			}
		}catch(Exception e){
			System.out.println(">> Some Error: "+e);
		}
		
		System.out.println(">> Banking Finished");
	}

}
