package co.edureka.exceptions;

public class Query {

	private static String calculate() {
		try {
			int i = 1, b = 0, c;
			c = i / b;

		} catch (Exception e) {
			return "Error";
		}

		// return null;
		
		finally {
			return "No error";
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println(">> App Started");
		
		String data = calculate();
		System.out.println(">> data is: "+data);
		
		System.out.println(">> App Finished");
		
	}

}
