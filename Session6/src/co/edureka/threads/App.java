package co.edureka.threads;

/*class Task{
	
	void executeTask(){
		for(int i=1;i<=100;i++){
			System.out.println(">> Priniting @@John's Profile.pdf@@ Page#"+i);
		}
	}
}
*/

//1. extends Thread Class
class Task extends Thread{ // We are creating Task as a Child Thread now !!
	
	public void run(){ // override run method of Thread Parent
		for(int i=1;i<=10;i++){
			System.out.println(">> Priniting @@John's Profile.pdf@@ Page#"+i);
		}
	}
}

class CA{
	
}

// 2. Implement Runnable Interface
//class AnotherTask extends CA, Thread{ // Multiple Inheritance Not Supported
class AnotherTask extends CA implements Runnable{
	public void run(){ // override run method of Thread Parent
		for(int i=1;i<=10;i++){
			System.out.println(">> Priniting $$Fionna's Profile.pdf$$ Page#"+i);
		}
	}
}

public class App {

	// main is known as main thread
	// main thread will perform tasks in a sequence
	public static void main(String[] args) {
		
		System.out.println(">> App Started"); 								// T1
		
		Task tRef = new Task(); 											// T1.5
		//tRef.executeTask();
		
		Runnable r = new AnotherTask(); // polymorphic Statement
		Thread th = new Thread(r);		// Create a Direct Thread Object by passing runnable ref var in constructor
		
		tRef.start(); // start method belongs to Thread and it internally executes run method !!
		th.start();
		
		for(int i=1;i<=10;i++){												// T2
			System.out.println(">> Printing **LearningJava.pdf** Page#"+i);
		}
		
		System.out.println(">> App Finsihed");	 							// T3

	}

}
