package co.edureka.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		//Queue<Integer> queue = new PriorityQueue<Integer>();			// Polymorphic Statement
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();	// Direct Object Construction
		
		for(int i=10;i>0;i--){
			queue.add(i);
		}
		
		// We added like below:
		// (Head)10  9  8  7  6  5  4  3  2  1(Tail)
		
		// But PriorityQueue will sort data in ascending order
		// (Head)1  2  3  4  5  6  7  8  9  10(Tail)
		
		// Fetch Head of Queue
		/*System.out.println("Head is: "+queue.peek()); // peek method return head of queue
		System.out.println("Size of Queue is: "+queue.size()); // 10
		queue.poll(); // Remove Head of Queue
		System.out.println("Head is: "+queue.peek()+" and size is: "+queue.size()); // ??
		*/
		
		for(int i=1; i<=queue.size(); i++){
			System.out.println("Head is: "+queue.peek());
			queue.poll();
		}
		
		

	}

}
