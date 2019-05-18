package co.edureka.model;


// Bean or Model or POJO
public class Employee {
	
	// Attributes:
	Integer eid;
	String name;
	String designation;
	String phone;
	Integer salary;
	
	public Employee() {
	
	}

	public Employee(Integer eid, String name, String designation, String phone, Integer salary) {
		this.eid = eid;
		this.name = name;
		this.designation = designation;
		this.phone = phone;
		this.salary = salary;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", designation=" + designation + ", phone=" + phone
				+ ", salary=" + salary + "]";
	}

}
