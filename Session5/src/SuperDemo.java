class A{
	
	int x;
	
	A(){
		x = 10;
		System.out.println(">> A Object Constructed");
	}
	
	A(int a){
		x = a;
		System.out.println(">> A Object Constructed with a as input");
	}
}

class B extends A{
	B(){
		System.out.println(">> B Object Constructed");
	}
	
	B(int a){
		super(a);
		System.out.println(">> B Object Constructed with a as input");
	}
}

class C extends B{
	C(int a){
		//super(); // this statement is inserted by compiler : super() makes Parent's constructor execution
		super(a);
		System.out.println(">> C Object Constructed");
	}
}

/*
 	A
 	|
 	B
 	|
 	C
 */

public class SuperDemo {

	public static void main(String[] args) {
		C cRef = new C(111);
		System.out.println(">> x is: "+cRef.x); // x of A Object i.e. GrandParent Object's Data
	}

}
