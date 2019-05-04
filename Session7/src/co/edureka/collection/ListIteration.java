package co.edureka.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Harry");	// 0	
		names.add("Mike");
		names.add("Daisy");
		names.add("Mark");
		names.add("George");
		names.add("Daisy"); //n-1
		
		// Different Ways to Iterate in ArrayList :)
		// 1. Basic For Loop
		System.out.println("== 1. Basic For Loop ==");
		for(int i=0;i<names.size();i++){
			String name = names.get(i);
			System.out.println(">> "+name);
		}
		
		System.out.println();
		
		// 2. Enhanced For Loop
		System.out.println("== 2. Enhanced For Loop ==");
		for(String name : names){
			System.out.println(">> "+name);
		}
		
		System.out.println();
		
		// 3. Iterator API -> Can iterate in forward direction
		System.out.println("== 3. Iterator API ==");
		Iterator<String> itr = names.iterator();
		/*System.out.println(">> "+itr.next());
		System.out.println(">> "+itr.next());*/
		
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(">> "+name);
			
			if(name.equals("Daisy")){
				itr.remove(); // Iterator can also remove data from ArrayList
			}
		}

		System.out.println(">> List names is: "+names);
		
		System.out.println();
		
		// 4. ListIterator API -> Can iterate in both directions
		System.out.println("== 4. ListIterator API ==");
		ListIterator<String> listItr = names.listIterator();
		
		while(listItr.hasNext()){
			String name = listItr.next();
			System.out.println(">> "+name);
		}

		System.out.println("=====");
		
		while(listItr.hasPrevious()){
			String name = listItr.previous();
			System.out.println(">> "+name);
		}
		
		System.out.println();
		
		// 5. Enumeration API -> just like iterator but cannot remove the data
		System.out.println("== 5. Enumeration API ==");
		Enumeration<String> enm = Collections.enumeration(names);
		while(enm.hasMoreElements()){
			String name = enm.nextElement();
			System.out.println(">> "+name);
		}
		
		// Vector is Thread-Safe i.e. Synchronized :)
		Vector<String> vector = new Vector<String>();
		vector.add("Harry");	// 0	
		vector.add("Mike");
		vector.add("Daisy");
		vector.add("Mark");
		vector.add("George");
		vector.add("Daisy"); //n-1
		
		System.out.println(">> Vector is: "+vector);
	}

}
