package co.edureka.bean;

public class Product {

	// Attributes
	String name;
	String brandName;
	int price;
	int inventory;
	
	public Product() {
	
	}

	public Product(String name, String brandName, int price, int inventory) {
		this.name = name;
		this.brandName = brandName;
		this.price = price;
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}
	
	public void purchaseProduct(String where, String when, String paymentType){
		System.out.println(">> Product Purchase Start <<");
		if(inventory>0){ // Pre Processing
			
			// Core Business Logic
			System.out.println(">> Please process with payments for Product "+name+" to be purchased");
			System.out.println(">> Please pay "+price+" using "+paymentType);
			
			System.out.println("=======");
			// Post Processing
			System.out.println(">> Product "+name+" shall be shipped to "+where+" in "+when);
		}
		System.out.println(">> Product Purchase Finished <<");
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", brandName=" + brandName + ", price=" + price + ", inventory=" + inventory
				+ "]";
	}
	
}
