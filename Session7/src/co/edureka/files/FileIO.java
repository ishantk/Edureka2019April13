package co.edureka.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

class Order{
	
	// Attributes
	int oid;
	String dishName;
	int quantity;
	int price;
	String restaurant;
	
	Order(){
		
	}

	// Paremeterized Constructor
	public Order(int oid, String dishName, int quantity, int price, String restaurant) {
		this.oid = oid;
		this.dishName = dishName;
		this.quantity = quantity;
		this.price = price;
		this.restaurant = restaurant;
	}
	
	public String ordertoCSV(){
		return oid+","+dishName+","+quantity+","+price+","+restaurant+"\n";
	}
	
}

public class FileIO {

	void saveDataInFile(String data){
		
		try {
			
			File file = new File("/users/ishantkumar/Downloads/orders.csv");
			/*if(file.exists()){
				System.out.println(">> File "+file.getName()+" exists !!");
			}else{
				System.out.println(">> File "+file.getName()+" does not exists !!");
			}*/
			
			// FileOutputStream API writes the data in any type of file but in bytes
			// FileOutputStream is a Binary Stream : This will make data flow in the form of bytes :)
			//FileOutputStream stream = new FileOutputStream(file);
			/*FileOutputStream stream = new FileOutputStream(file, true); // true means append mode enabled
			
			stream.write(data.getBytes());

			stream.close(); // Release memory Resources*/
			
			// FileOutputStream is a Textual Stream : This will make data flow in the form of text :)
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file, true); // true means append mode enabled :)
			writer.write(data);
			writer.close();
			
			System.out.println(">> Data "+data+" Written in File "+file.getName());
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
		
	}
	
	/*void readDataFromFile(){
		try {
			File file = new File("/users/ishantkumar/Downloads/orders.csv");
			
			// FileInputStream to read the data in the form of bytes
			FileInputStream stream = new FileInputStream(file);
			
			System.out.println("************************");
			int i = 0;
			// We are reading byte by byte :)
			while( (i = stream.read()) != -1 ){ // -1 denotes end of file
				System.out.print( (char)i );
			}
			System.out.println("************************");
			stream.close();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}*/
	
	void readDataFromFile(){
		try {
			File file = new File("/users/ishantkumar/Downloads/orders.csv");
			
			// FileReader to read the data in the form of text
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader); // We can read file line by line instead of character by character
			
			System.out.println("************************");
			
			String line = "";
			while( (line = buffer.readLine()) != null ){
				System.out.println(line);
			}
			
			
			System.out.println("************************");
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println(">> Some Exception: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		
		Order o1 = new Order(3, "French Toast", 3, 300, "ABC Veggies");
		Order o2 = new Order(2, "Burger", 5, 150, "Mc Donalds");
		
		System.out.println(o1.ordertoCSV());
		System.out.println(o2.ordertoCSV());
		
		// Challenge : Data in Objects is temporary as Objects are created in RAM area
		//   		   We must save the data
		// 1. Files : Where we can save this data in objects permanently
		

		FileIO fRef = new FileIO();
		//fRef.saveDataInFile(o1.ordertoCSV()); // Save a CSV String into a File
		fRef.readDataFromFile();
		
	}

}
