// For an e-Commerce app we need to write various different objects as products
// ex : Mobile, TV, Shoe, Bottle, Chair etc...

// Product class contains common attributes and common method execution !!
// Code in Product was being repeated again and again in Child Classes
class Product{
	
	// Attributes of Product
	int pid;
	String name;
	String brand;
	int price;
	
	Product(){
		System.out.println(">> Product Object Constructed");
	}
	
	void setDataForProduct(int pid, String name, String brand, int price){
		this.pid = pid;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
	void showDataForProduct(){
		System.out.println("===="+pid+" | "+name+"====");
		System.out.println("Brand: "+brand);
		System.out.println("Price: "+price);
	}
}

class Mobile extends Product{
	
	// Attributes of Mobile Object
	String os;
	int ram;
	
	Mobile(){
		System.out.println(">> Mobile Object Constructed");
	}
	
	void setDataForMobile(int pid, String name, String brand, int price, String os, int ram){
		setDataForProduct(pid, name, brand, price);
		this.os = os;
		this.ram = ram;
	}
	
	void showDataForMobile(){
		showDataForProduct();
		System.out.println("OS: "+os);
		System.out.println("RAM: "+ram);
		System.out.println("=====================");
	}
	
}

// If we wish to create n different objects we have to write n different classes
// But, similar code is being repeated !!

class TV extends Product{
	
	// Attributes of TV Object
	String technology;
	int screenSize;
	
	TV(){
		System.out.println(">> TV Object Constructed");
	}
	
	void setDataForTV(int pid, String name, String brand, int price, String technology, int screenSize){
		setDataForProduct(pid, name, brand, price);
		this.technology = technology;
		this.screenSize = screenSize;
	}
	
	void showDataForTV(){
		showDataForProduct();
		System.out.println("Tech: "+technology);
		System.out.println("Size: "+screenSize);
		System.out.println("=====================");
	}
	
}


public class WhyInheritance {

	public static void main(String[] args) {
		
		Mobile m1 = new Mobile();
		m1.setDataForMobile(101, "iPhoneX", "Apple", 80000, "iOS", 4);
		m1.showDataForMobile();
		
		System.out.println();
		
		TV t1 = new TV();
		t1.setDataForTV(201, "Curved LEDTV", "Samsung", 50000, "OLED", 50);
		t1.showDataForTV();

	}

}

// Code Redundancy is now Removed using Inheritance Technique :)