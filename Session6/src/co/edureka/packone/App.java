package co.edureka.packone;

class CX extends One{
	
}

public class App {

	public static void main(String[] args) {
		
		// We can create object of public or default class in the same package class :)
		/*One oRef = new One();
		Two tRef = new Two();

		//oRef.pvtShow(); // error : private remains only within the class. cannot be accessed outside 
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println();
		
		//tRef.pvtShow();
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();*/
		
		CX cRef = new CX();
		//cRef.pvtShow();
		cRef.defShow();
		cRef.protShow();
		cRef.pubShow();
		
	}

}
