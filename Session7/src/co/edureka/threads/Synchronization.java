package co.edureka.threads;

class Printer{
	
	//void printDocuments(String name, int copies){
	// synchronized method once it will be executed a lock shall be acquired on the method by Thread
	// So, no other thread can access the method till it is not fully executed by thread
	// Lock Acquisition happens automatically
	//synchronized void printDocuments(String name, int copies){
	void printDocuments(String name, int copies){
		for(int i=1;i<=copies;i++){
			System.out.println(">> Printing "+name+" Copy#"+i);
		}
	}
	
	void statusCheck(){
		System.out.println(">> Printer Inks are Fine !!");
	}
	
}

class MyPrintThread extends Thread{
	
	Printer printer;
	
	MyPrintThread(Printer p){
		printer = p;
	}
	
	public void run() {
		
		// Acquire the lock on Object pointed by printer ref var
		// We can execute multiple methods on the same object and hence lock shall be acquired till synchronized block is not exited
		synchronized (printer) {
			
			try {
				printer.wait(); // keep on waiting till anyone notifies this fellow
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			printer.printDocuments("** JavaAssignment1.pdf **", 10);
			printer.statusCheck();
		}
	}
	
}

class YourPrintThread extends Thread{
	
	Printer printer;
	
	YourPrintThread(Printer p){
		printer = p;
	}
	
	public void run() {
		synchronized (printer) {
			printer.printDocuments("## PythonAssignment3.pdf ##", 10);
			
			//printer.notify(); // let waiting thread shall be notified to resume its execution
			printer.notifyAll();
		}
	}
	
}

public class Synchronization {

	public static void main(String[] args) {
		
		System.out.println(">> App Started");
		
		// We have only 1 single Printer Object :)
		Printer pRef = new Printer();
		
		// Task of printing is given to the main thread :)
		//pRef.printDocuments("JavaAssignment1.pdf", 10);
		
		// Lets create a Child Thread to get the printing done
		MyPrintThread mRef = new MyPrintThread(pRef); 		// Reference to Printer Object is passed here
		MyPrintThread mRef1 = new MyPrintThread(pRef); 
		YourPrintThread yRef = new YourPrintThread(pRef);   // Passed the same Reference to Printer Object which was passed in MyPrintThread
		// MyPrintThread and YourPrintThread shall be working on the same single Printer Object  :)
		
		// When both threads shall be started, they will run asynchronously i.e. parllely to the main thread
		mRef.start();
		mRef1.start();
		yRef.start();
		
		// When multiple threads shall work on same single object, than we need synchronization !!
		// eg: 2 users are trying to book the same seat # for a specific movie
		
		
		System.out.println(">> App Finished");
		

	}

}

// In synchronization threads wont run parallely, they shall run in a sequence
// We need Sync in case multiple threads will work on same object :)
