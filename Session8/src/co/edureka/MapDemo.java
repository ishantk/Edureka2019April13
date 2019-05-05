package co.edureka;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
	
		// key, value -> which can be any type of your choice
		// remember keys are unique but values can be same
		//Map<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(345, "Paul");
		map.put(111, "Leo");
		map.put(541, "Mike");
		map.put(666, null);
		map.put(768, "Fionna");
		map.put(434, "Sia");
		map.put(null, "Harry");
		
		map.put(434, "George"); // Update Operation in Map
		
		// Key Value Pair is also known as Entry: 434, "George"
		
		System.out.println(">> map is: "+map);
		System.out.println("Size of map is: "+map.size());

		String name = map.get(434);
		System.out.println(">> name for key 434 is: "+name);
		
		if(map.containsKey(111)){
			System.out.println("111 key exists and value at 111 is: "+map.get(111));
		}
		
		if(map.containsValue("Harry")){
			System.out.println("Harry is in the map");
		}
		
		Set<Integer> keys = map.keySet(); // Extract all the keys of HashMap
		Iterator<Integer> itr = keys.iterator();
		
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			System.out.println(">> Key: "+key+"\tValue: "+value);
		}
		
		map.remove(111);
		//map.clear();
		//map.putAll(); put all the key value pairs of one map into another
		
		System.out.println("============");
		Set<Entry<Integer, String>> entries = map.entrySet();
		Iterator<Entry<Integer, String>> itr1 = entries.iterator();
		while(itr1.hasNext()){
			Entry<Integer, String> entry = itr1.next();
			System.out.println(">> "+entry.getKey()+" : "+entry.getValue());
		}
		
		
		// Hashtable is THREAD-SAFE i.e. Synchronized :)
		// no null key and no null values
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(345, "Paul");
		table.put(111, "Leo");
		table.put(541, "Mike");
		//table.put(666, null); // no null value allowed
		table.put(768, "Fionna");
		table.put(434, "Sia");
		//table.put(null, "Harry"); // no null key allowed
		
		System.out.println(table);
		
	}

}
