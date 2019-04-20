
public class StringFunctions {

	public static void main(String[] args) {
					//  0								 33	
		String names = "John, Jennie, Jim, Jack, Joe, John";
		int l = names.length();
		System.out.println("Length of names is: "+l); // 34
		
		//char ch = names.charAt(2);
		char ch = names.charAt(l-1);
		System.out.println("ch is: "+ch); // n
		
		//int idx = names.indexOf('J');  //0
		int idx = names.indexOf("John"); //0
		// lastIndexOf -> explore this
		System.out.println("idx is: "+idx);
		
		String s1 = names.toUpperCase(); // this is a manipulation operation i.e. we will be modifying the String
		// Strings are IMMUTABLE i.e. we cannot change them once they are created
		// Manipulation operation will give us a new String in the memory
		
		System.out.println("names is: "+names); // no change
		System.out.println("s1 is: "+s1); // no change
		
		String s2 = names.replace('J', 'K');
		System.out.println("s2 is: "+s2);
		
		String s3 = names.concat(", Fionna");
		System.out.println("s3 is: "+s3);
		System.out.println("names is: "+names);
		
		String[] allNames = names.split(",");
		for(String s : allNames){
			System.out.println(s.trim()); // trim shall remove white spaces from leading and trailing
		}
		//				  0								   33
		//String names = "John, Jennie, Jim, Jack, Joe, John";
		String s4 = names.substring(5); // 0 to 4 will be removed and from 5 till end you will get a new String
		System.out.println("s4 is: "+s4);
		
		String s5 = names.substring(6, 11); // start from 6 less than 11
		System.out.println("s5 is: "+s5);
		
		if(names.contains("Jennie")){
			System.out.println(">> Jennie is in the names");
		}
		
		String email = "johnexample.com";
		if(email.contains("@") && email.contains(".")){
			System.out.println(">> Its a Valid Email");
		}else{
			System.out.println(">> Its an Invalid Email");
		}
		
		String audioFile = "SomeSong.mp3";
		if(audioFile.endsWith(".mp3")){ // startsWith -> when we search data in some list
			System.out.println(">> This is an audio format and can be played");
		}else{
			System.out.println(">> Invalid Audio Format");
		}
		
		// If you wish to convert String into Array
		char[] chArr = names.toCharArray();
	}

}
