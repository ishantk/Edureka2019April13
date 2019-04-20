
public class Strings {
	
	
	static void loginUser(String email, String password){
		if(email.equals("john@example.com") && password.equals("password123")){
			System.out.println(">> Welcome John !!");
		}else{
			System.out.println(">> Invalid Login Credentials");
		}
	}

	public static void main(String[] args) {
		
		// Interned Way of Creating Strings:
		String str1 = "Hello";
		String str2 = "HellO";
		
		// Object Construction Statements:
		String str3 = new String("HelLo");
		String str4 = new String("Hello");
		
		// str1, str2, str3, and str4 are reference variables
		// but when we print these reference variable we dont see HashCodes, rather we see values !!
		
		System.out.println("str1 is: "+str1);
		System.out.println("str2 is: "+str2);
		System.out.println("str3 is: "+str3);
		System.out.println("str4 is: "+str4);
		
		// a toString() method of String is executed when we print the reference variable.
		// so it returns data rather than HashCode
		System.out.println("str1.toString() is: "+str1.toString());
		System.out.println("str2.toString() is: "+str2.toString());
		System.out.println("str3.toString() is: "+str3.toString());
		System.out.println("str4.toString() is: "+str4.toString());
		
		// Comparing References !! We are not comparing the data !!
		if(str1 == str2){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
		
		if(str3 == str4){
			System.out.println("str3 == str4");
		}else{
			System.out.println("str3 != str4");
		}
		
		if(str1 == str3){
			System.out.println("str1 == str3");
		}else{
			System.out.println("str1 != str3");
		}
		
		System.out.println();
		
		if(str1.equals(str2)){
			System.out.println("str1 equals str2");
		}else{
			System.out.println("str1 not equals str2");
		}
		
		if(str3.equals(str4)){
			System.out.println("str3 equals str4");
		}else{
			System.out.println("str3 not equals str4");
		}
		
		if(str1.equals(str3)){
			System.out.println("str1 equals str3");
		}else{
			System.out.println("str1 not equals str3");
		}
		
		System.out.println();
		
		if(str1.compareTo(str2) == 0){
			System.out.println("str1 compared to str2");
		}else{
			System.out.println("str1 not compared to str2");
		}
		
		if(str3.compareTo(str4) == 0){
			System.out.println("str3 compared to str4");
		}else{
			System.out.println("str3 not compared to str4");
		}
		
		System.out.println();
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("str1 equals str2");
		}else{
			System.out.println("str1 not equals str2");
		}
		
		if(str3.equalsIgnoreCase(str4)){
			System.out.println("str3 equals str4");
		}else{
			System.out.println("str3 not equals str4");
		}
		
		System.out.println();
		
		if(str1.compareToIgnoreCase(str2) == 0){
			System.out.println("str1 compared to str2");
		}else{
			System.out.println("str1 not compared to str2");
		}
		
		if(str3.compareToIgnoreCase(str4) == 0){
			System.out.println("str3 compared to str4");
		}else{
			System.out.println("str3 not compared to str4");
		}
		
		Strings.loginUser("john@example.com", "password123");
		
	}

}
