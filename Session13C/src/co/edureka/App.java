package co.edureka;

public class App {

	public static void main(String[] args) {
		
		//Connection c1 = new Connection();
		//Connection c2 = new Connection();
		
		//System.out.println("c1 is: "+c1); // HashCode of Object pointed by c1
		//System.out.println("c2 is: "+c2); // HashCode of Object pointed by c2
	
		
		Connection c1 = Connection.getConnection();
		Connection c2 = Connection.getConnection();
		
		System.out.println("c1 is: "+c1); // HashCode of Object pointed by c1
		System.out.println("c2 is: "+c2); // HashCode of Object pointed by c2
		
	}
	

}
