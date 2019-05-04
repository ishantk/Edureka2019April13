package co.edureka.collection;

import java.util.ArrayList;
import java.util.List;

class Book{
	String author;
	int price;
	
	public String toString(){
		return author+" - "+price;
	}
}

public class ListDemo {

	public static void main(String[] args) {
		
		//List list1 = new ArrayList(); 		// Polymorphic Statement -> ArrayList implements List
		// Hetrogeneous | Can store any type of object
		ArrayList list1 = new ArrayList(); 		// Direct Object Construction 
		
		// Homogeneous
		ArrayList<String> list2 = new ArrayList<String>();		// can only store Strings
		
		ArrayList<Book> list3 = new ArrayList<Book>();			// can only store book Objects
		
		Book b1 = new Book();
		b1.author = "John";
		b1.price = 500;
		
		Book b2 = new Book();
		b2.author = "Jack";
		b2.price = 300;
		
		//System.out.println(b1);
		//System.out.println(b2);
		
		// >> 1. Add Data in List <<
		//list1.add(0, "John");	// 0 indexes
		list1.add("John");		// 0 indexes
		list1.add(10);
		list1.add(2.2);
		list1.add('A');
		list1.add(b1);
		list1.add("Kim");
		list1.add("Fionna");	// n-1 index
		
		list2.add("Harry");		// 0
		list2.add("Mike");
		list2.add("Daisy");
		list2.add("Mark");
		list2.add("George");
		list2.add("Daisy"); // Duplicacy is supported in ArrayList | n-1
		//list2.add(10); // err
		//list2.add(b1); // err
		
		list3.add(b1);		// 0
		list3.add(b2);		// 1
		//list3.add(10);     // err
		//list3.add("John"); // err
		
		// >> 2. Print Data in List <<
		// Data shall be printed the way we have listed it :)
		System.out.println("==list1==");
		System.out.println(list1);
		System.out.println("==list2==");
		System.out.println(list2);
		System.out.println("==list3==");
		System.out.println(list3);
		
		// >> 3. Size of List <<
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		
		// >> 4. Get Single Object from List <<
		Object o = list1.get(2); // Since we dont know what index can be of what type, we have Object class which is parent of all classes in java and can point to any type
		String s = list2.get(4);
		Book b = list3.get(1);
		
		System.out.println(o);
		System.out.println(s);
		System.out.println(b);
		
		// >> 5. Delete element from List <<
		System.out.println(">> list2 is: "+list2+" | "+list2.size());
		list2.remove(2);
		System.out.println(">> list2 now is: "+list2+" | "+list2.size());
		
		// >> 6. Update element from List <<
		list2.set(2, "Sia");
		System.out.println(">> list2 now is: "+list2+" | "+list2.size());
		
		// >> 7. Common Methods <<
		if(list2.contains("Sia")){
			System.out.println(">> Sia is in the List");
		}
		
		//list2.clear(); // remove all
		
		//System.out.println(">> list2 now is: "+list2);
		
		ArrayList<String> students = new ArrayList<String>();
		students.add("John");
		students.add("Jennie");
		students.add("Jim");
		
		students.addAll(list2);
		System.out.println(">> student is: "+students);
		
		int idx = students.indexOf("Daisy");
		System.out.println(">> index is: "+idx);
		
	}

}
