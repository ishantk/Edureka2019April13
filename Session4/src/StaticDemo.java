class Student{
	
	// Attribute : Property of Object and not of class
	// non static
	int roll;
	String name;
	
	// Attributes: Property of Class and shall not be available in Object
	static int numOfStudents;
	static String schoolName;
	
	// Constructor : non static and property of object
	Student(){
		roll = 0;
		name = "NA";
	}
	
	//Methods: non static and property of object
	void setDataForStudent(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	
	void showStudentDetails(){
		// object's property can access class's property
		System.out.println(">> Student Details: "+roll+" | "+name+" and School: "+schoolName);
	}
	
	// Methods : static is property of class
	static void showSchoolDetails(){
		System.out.println(">> "+schoolName+" school has "+numOfStudents+" students");
		//System.out.println(">> name is: "+name); // error
		// name is object's property and we cannot access it in class's property
	}
}


public class StaticDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setDataForStudent(101, "John");
		s2.setDataForStudent(201, "Fionna");
		
		s1.showStudentDetails();
		s2.showStudentDetails();
		
		// What so ever is static belongs to class
		Student.numOfStudents = 10;
		Student.schoolName = "ABC International School";
		
		s1.schoolName = "XYZ Computer Science";
		
		// class attributes can be accessed by objects or references of those objects
		System.out.println("s1 school is: "+s1.schoolName);
		System.out.println("s2 school is: "+s2.schoolName);
		
		System.out.println(Student.schoolName);
		
		Student.showSchoolDetails();
		s2.showSchoolDetails();
		

	}

}
