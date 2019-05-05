package co.edureka;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Jennie");
		names.add("John");
		names.add("Daisy");
		names.add("Fionna");
		names.add("Kia");
		
		System.out.println("names is "+names);
		
		//Set<String> set = new HashSet<String>();
		//HashSet<String> set = new HashSet<String>(); // Adds Data Uniquely
		TreeSet<String> set = new TreeSet<String>();
		// HashSet uses Hashing technique to store data in memory rather than indexing
		set.add("John");
		set.add("Jennie");
		set.add("John");
		set.add("Daisy");
		set.add("Fionna");
		set.add("Kia");
		
		System.out.println("set is "+set);
		
		if(set.contains("Fionna")){
			System.out.println("Fionna is in the Set");
		}
		
		set.remove("Daisy");
		
		System.out.println(">> set now is: "+set+" and size is: "+set.size());
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String name = itr.next();
			System.out.println(">> name is: "+name);
		}
		
	}

}
