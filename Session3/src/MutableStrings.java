
public class MutableStrings {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE
		String str = new String("Hello");
		str.concat(" World");
		
		System.out.println(">> str is: "+str);
		
		// MUTABLE Strings i.e. they can be modified
		// Heap Area
		StringBuffer buffer = new StringBuffer("Hello");		// Thread-Safe i.e. Synchronized
		buffer.append(" World");
		
		System.out.println(">> buffer is: "+buffer);
		
		StringBuilder builder = new StringBuilder("Hello"); 	// Not Thread-Safe i.e. Not Synchronized
		builder.append(" World");
		System.out.println(">> builder is: "+builder);
		

	}

}
