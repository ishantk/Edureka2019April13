class Employee{
	// property of clqss
	static int numOfEmployees = 0;
	// constructor : property of object and is accessing property of class
	Employee(){
		numOfEmployees++;
	}
	// property of class which can be accessed by class name or references of objects
	static void showEmployees(){
		System.out.println(">> Employees: "+numOfEmployees);
	}
}
public class StaticAgain {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(); // 1
		Employee e2 = new Employee(); // 2
		Employee e3 = new Employee(); // 3
		Employee e4 = new Employee(); // 4
		Employee e5 = new Employee(); // 5
		
		e1.showEmployees(); // 5
		
	}

}
