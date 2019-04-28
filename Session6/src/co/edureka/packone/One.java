package co.edureka.packone;

// One is public
public class One {

	// Four Access Modifiers : private, default, protected and public
	// They can be used with attributes or methods.
	// with static or non static both !! :)
	
	private void pvtShow(){
		System.out.println(">> This is private show of One");
	}
	
	void defShow(){
		System.out.println(">> This is default show of One");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of One");
	}
	
}

// Two is default
class Two{
	
	private void pvtShow(){
		System.out.println(">> This is private show of Two");
	}
	
	void defShow(){
		System.out.println(">> This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println(">> This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println(">> This is public show of Two");
	}	
}

// We can create multiple default classes
//class Five{
//	
//}

// We cannot create private and protected class :) 
/* errors below:
private class Three{
	
}

protected class Three{
	
}
*/

// Error : If you create a public class in java, name of the source file should be same as that of class name !!
//public class Four {

//}