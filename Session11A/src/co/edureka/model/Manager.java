package co.edureka.model;

public class Manager {

	// Attributes
	Integer mid;
	String name;
	String email;
	String phone;
	Integer salary;
	
	Project project; // HAS-A Relation -> 1 to 1 i.e. 1 Manager Object Refers to 1 Project object
	
	public Manager() {
	
	}

	public Manager(Integer mid, String name, String email, String phone, Integer salary, Project project) {
		this.mid = mid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.project = project;
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", salary=" + salary
				+ ", project=" + project + "]";
	}
	
	
}
