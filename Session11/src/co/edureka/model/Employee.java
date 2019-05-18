package co.edureka.model;

// Bean or Model or POJO
public class Employee {

	int eid;
	String name;
	int salary;
	
	public Employee() {
	
	}

	public Employee(int eid, String name, int salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
