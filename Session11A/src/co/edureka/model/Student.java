package co.edureka.model;

import java.util.List;

public class Student {

	Integer roll;
	String name;
	
	List<Certificate> certificates; // HAS-A Relationship -> 1 to Many | List is a Collection
	
	public Student() {
	
	}

	public Student(Integer roll, String name, List<Certificate> certificates) {
		this.roll = roll;
		this.name = name;
		this.certificates = certificates;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Certificate> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", certificates=" + certificates + "]";
	}
	
}
