package co.edureka;

interface FoodItem{
	String description();
	int price();
}

class VeggieBurger implements FoodItem{
	
	public String description() {
		return "VeggieBurger loaded with Greens";
	}
	
	public int price() {
		return 100;
	}
}

abstract class FoodDecorator implements FoodItem{
	
	FoodItem item;
	
	public FoodDecorator(FoodItem item) {
		this.item = item;
	}
	
	public String description() {
		return item.description();
	}
	
	public int price() {
		return item.price();
	}
}

class BurgerMeal extends FoodDecorator{
	
	BurgerMeal(FoodItem item){
		super(item);
	}
	
	public String description() {
		return super.description() + ". Meal With Coke and Fries !!";
	}
	
	public int price() {
		return super.price() + 75;
	}
}

public class DecoratorApp {

	public static void main(String[] args) {
		
		VeggieBurger vBurger = new VeggieBurger();
		//System.out.println(vBurger.description());
		//System.out.println(vBurger.price());
		
		// Decorator Design Pattern : Dynamically modified behavior of Object
		FoodItem item = new BurgerMeal(vBurger);
		System.out.println(item.description());
		System.out.println(item.price());
		
	}

}
