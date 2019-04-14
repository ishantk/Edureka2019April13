
public class DataOperation {

	// whatever we write in main is executed when we run our java program !!
	public static void main(String[] args) {
		
		// Creating Storage Container
		int phonePrice = 10000;

		// Read Container
		System.out.println("Phone is Priced at \u20b9"+phonePrice);
		
		int taxes = (phonePrice * 18) / 100;
		System.out.println("Taxes shall be \u20b9"+taxes);
		
		// Updating Container
		//phonePrice = phonePrice + taxes;
		phonePrice += taxes; // translated as:  phonePrice = phonePrice + taxes;
		
		System.out.println("Phone with taxes is priced at \u20b9"+phonePrice);
		
		int remainder = 10 % 3;
		System.out.println("Remainder is: "+remainder);
		
		int num = 15;
		num %= 4;
		System.out.println("num is: "+num); // 3
		
		// HW:  Implement Caesar Cipher
		// http://practicalcryptography.com/ciphers/caesar-cipher/
		
		num++; // num = num + 1 | postfix | is increment later
		++num; // num = num + 1 | prefix  | increment first
		
		--num;
		
		System.out.println("num now is: "+num); // 4 
		
		// Budget to buy the Phone
		int budget = 11800;
		System.out.println("Can phone be purchaed? "+(phonePrice <= budget));
		
		int x = 10;
		int y = 20;
		
		System.out.println("is x and y same? "+(x==y));
		System.out.println("is x and y not same? "+(x!=y));
		
		num = 5;
		System.out.println(++num + num++ +num +-- num + num --);
					     // 6	 + 6	 + 7  +    6   + 6     = 31 

		// Various combinations for operators : Rules how operators shall perform when given such an above use case !!
		// Refer Associativity and Precedence Tables !!
		// System.out.println(+num -num*num / num * num --);
		// http://cs-fundamentals.com/java-programming/java-operators-precedence-and-associativity.php
		
		int p = 10;
		int q = 200;
		int r = 30;
		
		System.out.println("Is r greatest than p and q? "+( r>p && r>q ) );
		System.out.println("Is r greater than p or q? "+!( r>p || r>q ) );
		
		// Shift Operators | >> | << | >>>(Positive Numbers)
		int n1 = 12;
		int n2 = n1 >> 2; // divide n1 by 2 pow 2  : 12/4 -> 3
		int n3 = n1 << 3; // multiply n1 by 2 pow 3: 12*8 -> 96
		
		System.out.println("n2 is: "+n2);
		System.out.println("n3 is: "+n3);
		
		// 12 : 	0 0 0 0 1 1 0 0 
		// 12 >> 2	_ _ 0 0 0 0 1 1 -> 0 0 0 0 0 0 1 1 | 3
		// 12 << 3  0 1 1 0 0 0 0 0 -> 96

	}

}
