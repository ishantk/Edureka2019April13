
public class NestedLoops {

	public static void main(String[] args) {
		
		/*
		for(int i=1;i<=5;i++){
			System.out.println(">> For i: "+i);
			
			for(int j=1;j<=3;j++){
				System.out.print(j+" "); // print prints in the same line
			}
			
			System.out.println();
			
		}*/
		
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print(j+" "); // print prints in the same line
			}
			
			System.out.println();
		}

	}

}
