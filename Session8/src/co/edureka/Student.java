package co.edureka;

public class Student {

	int roll;
	String name;
	int age;
	String phone;
	String email;
	
	public Student() {
	
	}

	public Student(int roll, String name, int age, String phone, String email) {
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", phone=" + phone + ", email=" + email
				+ "]";
	}
	
}
