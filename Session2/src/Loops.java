
public class Loops {

	public static void main(String[] args) {
		
		int num = 7;
		int i = 1;
		
		/*System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));
		i++;
		System.out.println(num+" "+i+"'s are "+(num*i));*/
		
		// 1. while loop which checks condition before entry
		while(i<=10){
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}
		
		System.out.println(); 
		
		
		// 2. do while loop which checks condition at exit
		num = 9;
		i = 11;
		do{
			System.out.println(num+" "+i+"'s are "+(num*i));
			i++;
		}while(i<=10); // condition checking is at exit
		
		System.out.println();
		
		// 3. for loop
		for(int n=11, j=1; j<=10; j++){
			System.out.println(n+" "+j+"'s are "+(n*j));
		}
		
	}

}
