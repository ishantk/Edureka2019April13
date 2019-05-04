package co.edureka.threads;

class MyThread extends Thread{
	
	public void run(){
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(1000); // 1 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(">> MyThread: "+i);
		}
	}
	
}

public class ThreadsAgain {

	public static void main(String[] args) {
		
		System.out.println("==Main Started==");
		
		MyThread mRef = new MyThread();
		System.out.println("mRef State 1 is: "+mRef.getState());
		
		mRef.start();
		System.out.println("mRef State 2 is: "+mRef.getState());
		
		try {
			mRef.join(); // join is a command which says execute my tasks 1st and let others wait
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		System.out.println("mRef State 3 is: "+mRef.getState());
		
		
		for(int i=1;i<=10;i++){
			
			try {
				Thread.sleep(500); // .5 sec
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("** MainThread: "+i);
		}
		
		System.out.println("==Main Finished==");
		
	}

}
