
public class MultiValueContainer {

	public static void main(String[] args) {
		
		// a1 is a single value container
		int a1 = 10;
		System.out.println("a1 is: "+a1); // 10
		
		// a2 is a multi value container
		// Homogeneous i.e. data is same type : Array
		// Fixed size i.e. 5 with elements indexed from 0 to 4
		
		// Create Operation : how we can create an Array
		
		// 1. Implicit Syntax 
		int[] a2 = {10, 20, 30, 40, 50};  // -> int[] a2 = new int[]{10, 20, 30, 40, 50};
		System.out.println("a2 is: "+a2); // HashCode
		// a2 is a Reference Variable since it is holding HashCode of Array
		
		// 2. Explicit Syntax
		int[] a3 = new int[]{10, 20, 30, 40, 50}; 
		// new shall create array in heap area i.e. dynamically (at run time)
		System.out.println("a3 is: "+a3);
		
		// Reference Copy
		int[] a4 = a2;
		System.out.println("a4 is: "+a4);
		
		// 3. Array with Size and default values 
		// We have the size but default values i.e. values as 0
		int[] a5 = new int[6]; // create an array with 6 elements having all values as 0
		System.out.println("a5 is: "+a5);
		
		// Put bracket before or after :)
		//int a6[] = new int[10];
		//int a7[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Read Before Update:");
		System.out.println("(B) a2[1] is: "+a2[1]);
		System.out.println("(B) a3[3] is: "+a3[3]);
		System.out.println("(B) a4[4] is: "+a4[4]);
		System.out.println("(B) a5[5] is: "+a5[5]);
		
		// Update Operation
		a2[1] = 111;
		a3[3] = 222;
		a4[4] = 444;
		a5[5] = 555;
		
		// Read Operation
		System.out.println("Read After Update:");
		System.out.println("(A) a2[1] is: "+a2[1]);
		System.out.println("(A) a3[3] is: "+a3[3]);
		System.out.println("(A) a4[4] is: "+a4[4]);
		System.out.println("(A) a5[5] is: "+a5[5]);
		
		// Length of Arrays:
		System.out.println("Length of a2 is: "+a2.length);
		System.out.println("Length of a3 is: "+a3.length);
		System.out.println("Length of a4 is: "+a4.length);
		System.out.println("Length of a5 is: "+a5.length);
		
		// Read All Operation on Arrays : Using for loop
		System.out.println("Reading all elements of a2");
		for(int i=0;i<a2.length;i++){
			System.out.print(a2[i]+"  ");
		}
		
		System.out.println();
		System.out.println("Reading all elements of a3");
		for(int i=0;i<a3.length;i++){
			System.out.print(a3[i]+"  ");
		}

		System.out.println();		
		
		System.out.println("Reading all elements of a4");
		for(int i=0;i<a4.length;i++){
			System.out.print(a4[i]+"  ");
		}

		System.out.println();
		
		System.out.println("Reading all elements of a5");
		for(int i=0;i<a5.length;i++){
			System.out.print(a5[i]+"  ");
		}
		
		// Read All Operation : Using Enhanced i.e. for-each loop
		
		System.out.println();
		
		System.out.println("Reading all elements of a2 with Enhanced For Loop");
		
		// first of 0 index value shall be copied into elm and than 1, 2, 3, and lastly 4th index...
		// Read only loop for reading the arrays. used with arrays only !!
		for(int elm : a2){
			System.out.print(elm+"  ");
		}
	}

}
