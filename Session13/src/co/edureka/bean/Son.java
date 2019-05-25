package co.edureka.bean;

public class Son extends Father{ // IS-A Relationship

	String companyName;
	int salary;
	
	public Son() {
	
	}

	public Son(String companyName, int salary) {
		this.companyName = companyName;
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Son [companyName=" + companyName + ", salary=" + salary + ", fname=" + fname + ", lname=" + lname
				+ ", vehicles=" + vehicles + "]";
	}
	
	
	
}
