package co.edureka.threads;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int i = 10;
		// BOXING : Wrapped i which is primitive into Integer Object pointed by iRef
		// Integer is a Wrapper Class in Java for int data type
		// We can now convert primitives into references or Objects :)
		Integer iRef = new Integer(i);
		
		double d = 2.2;
		// BOXING
		Double dRef = new Double(d);

		char ch = 'A';
		// BOXING
		Character cRef = new Character(ch);
		
		// UNBOXING : Fetching primitive back from an Object
		int k = iRef.intValue();
		double e = dRef.doubleValue();
		char dh = cRef.charValue();
		
		String str = "175";
		System.out.println(Integer.parseInt(str)+i);
		
		String s1 = "2.257";
		double num = Double.parseDouble(s1);
		System.out.println("num is: "+num);
		
		
	}

}
