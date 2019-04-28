package co.edureka.packtwo;

import co.edureka.packone.One;   // Import the class in other package 
//import co.edureka.packone.Two; // We cannot import a default class : error
// Only public lasses can be imported outside the package :)

// Inheritance Across Package
// What can be accessed : From the parent only public can be accessed outside the package 
// We have protected, which can be accessed indirectly
class CA extends One{
	void show(){
		protShow(); // we can access protected indirectly
	}
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();

		//oRef.pvtShow(); // error : private remains only within the class. cannot be accessed outside 
		//oRef.defShow(); // is accessible only within the package
		//oRef.protShow();// is accessible only within the package
		//oRef.pubShow();   // only public is accessible outside the package 
		
		//Two tRef = new Two(); // error
		
		CA cRef = new CA();
		cRef.pubShow(); // only public property is accessible outside the package
		//cRef.defShow(); err
		//cRef.protShow(); err
		cRef.show();
	}

}
