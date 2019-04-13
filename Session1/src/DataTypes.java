
public class DataTypes {

	public static void main(String[] args) {
		
		// 1. How to create a Single Value Container
		byte age = 10;				// 0 0 0 0 1 0 1 0 -> 10 in 8 bits of data
		// byte(data type) represents type and size of SVC
		// age(variable) is the name of SVC
		// 10(literal) is data in the container
		
		// 2. Update data in Storage Container
		age = 20;
		
		// 3. Read Data from Storage Container
		System.out.println("age is: "+age);
		
		// 4. age will be deleted automatically when main finishes
		
		//age = 300; // error: out of range of age
		
		// Create Operations
		int salary = 750000; // 32 bits of data
		
		float pi = 3.14f;
		double d = 123.45;
		
		char ch = 'A';
		
		boolean isInternetEnabled = true;
		
		// Update Operations
		pi = 3.144f;
		d = 654.456;
		ch = 'x';
		isInternetEnabled = false;
		
		System.out.println("pi is: "+pi);
		System.out.println("d is: "+d);
		System.out.println("ch is: "+ch);
		System.out.println("isInternetEnabled is: "+isInternetEnabled);
		
		ch = 65; // ASCII CODE
		System.out.println("ch now is: "+ch);
		
		ch = '\u20b9'; // UNICODE
		System.out.println("ch now is: "+ch);
		
	}

}
