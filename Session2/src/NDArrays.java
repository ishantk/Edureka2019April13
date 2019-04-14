
public class NDArrays {

	public static void main(String[] args) {
				//  0    1   2   3   4
		int[] a1 = {10, 20, 30, 40, 50};
		System.out.println("a1 is: "+a1+" and length is: "+a1.length);
		
		// Array of Arrays
		int[][] a2 = {
						{10, 20}, 				//0
						{10, 20, 20, 40},		//1
						{10, 20, 30},			//2
						{10},					//3
						{10, 20, 30, 40, 50}	//4
					 };
		
		System.out.println("a2 is: "+a2+" and length is: "+a2.length); 
		for(int i=0;i<a2.length;i++){ // 0 to 4 as a2 length is 5
			System.out.println("a2["+i+"] is: "+a2[i]+" and length is: "+a2[i].length);
		}
		
		//System.out.println("a2[4] length is: "+a2[4].length); // ?
		
		// Read single element of multi dim array
		System.out.println(a2[2][1]); // 20
		
		System.out.println();
		
		for(int i=0;i<a2.length;i++){ // i: 0, 1, 2, 3, 4
			
			for(int j=0; j<a2[i].length;j++){ // i:0, j:0,1 | i:1, j:0,1,2,3 | i:2, j:0,1,2 | i:3, j:0 | i:4, j:0, 1, 2, 3,4
				System.out.print(a2[i][j]+"  ");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// HW: Explore Enhanced For Loop on Multi Dim Arrays

		// 5 Arrays with each Array containing 6 elements and all of them shall be 0
		int[][] a3 = new int[5][6];
		
		// 5 Arrays with each Array elements not yet known
		int[][] a4 = new int[5][];
		a4[0] = new int[2]; // 0th Array shall have 2 elements as 0 values
		a4[1] = new int[5]; // 1st Array shall have 5 elements as 0 values
		a4[2] = new int[7]; // 2nd Array shall have 7 elements as 0 values
		a4[3] = new int[9]; // 3rd Array shall have 9 elements as 0 values
		a4[4] = new int[15];// 4th Array shall have 15 elements as 0 values
		
		for(int i=0;i<a4.length;i++){ 
			
			for(int j=0; j<a4[i].length;j++){
				System.out.print(a4[i][j]+"  ");
			}
			
			System.out.println();
		}

	}

}
