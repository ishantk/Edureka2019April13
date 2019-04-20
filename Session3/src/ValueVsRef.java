
public class ValueVsRef {
	
	void show1(int x){ 			// Passing Value as Input to Method
		x = x * 2;
		System.out.println(">> x is: "+x);
	}
	
	void show2(int[] arr){	 	// Passing Reference as Input to Method
		System.out.println(">> arr is: "+arr);
		arr[0] = 100;
		arr[4] = 400;
	}

	public static void main(String[] args) {
		
		int a = 10;
		int b = a; 		// Value Copy, because a contains data which is a value i.e. 10
		b = 11;
		
		System.out.println(">> a is: "+a);
		System.out.println(">> b is: "+b);
		
		int[] a1 = {10, 20, 30, 40, 50};
		int[] a2 = a1; // Reference Copy, because a1 contains HashCode of Array which is copied to a2 
		System.out.println(">> a1 is: "+a1);
		System.out.println(">> a2 is: "+a2);
		
		// Manipulate data in Array
		a2[1] = 111;
		a2[3] = 333;
		
		for(int elm : a1){
			System.out.print(elm+"  ");
		}
		
		System.out.println();
		
		ValueVsRef vRef = new ValueVsRef();
		vRef.show1(a);
		System.out.println(">> a is: "+a);
		
		vRef.show2(a1);
		
		for(int elm : a1){
			System.out.print(elm+"  ");
		}

	}

}
