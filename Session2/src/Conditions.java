
public class Conditions {

	public static void main(String[] args) {
		
		// regular if/else
		int orderPriceAtCheckOut = 1000;
		
		if(orderPriceAtCheckOut >= 5000){
			System.out.println("Please Apply PromoCode Flat50 to get 50% Off");
		}else{
			System.out.println("Please Apply PromoCode Flat20 to get 20% Off");
		}
		
		// Nested if/else
		
		boolean isInternetEnabled = true;
		boolean isGPSEnabled = false;
		
		if(isInternetEnabled){
			if(isGPSEnabled){
				System.out.println("You can browse Google Maps");
			}else{
				System.out.println("Please Enable GPS Connection and Try Again !!");
			}
		}else{
			System.out.println("Please Enable Internet and Try Again !!");
		}
		
		// Ladder if/else
		if(orderPriceAtCheckOut >= 9000){
			System.out.println("Please Apply PromoCode Flat50 to get 50% Off");
		}else if(orderPriceAtCheckOut >=5000 && orderPriceAtCheckOut<9000){
			System.out.println("Please Apply PromoCode Flat30 to get 30% Off");
		}else if(orderPriceAtCheckOut >=2000 && orderPriceAtCheckOut<5000){
			System.out.println("Please Apply PromoCode Flat10 to get 10% Off");
		}else{
			System.out.println("Please buy something else to avail discounts");
		}
		
		// switch case : Explore the same !! (C & C++ other than pointers)
		
	}

}
