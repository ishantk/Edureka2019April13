package co.edureka.model;

public class Project {

	// Attributes
	Integer pid;
	String name;
	String technology;
	Integer duration;
	Integer numOfEmps;
	
	Manager manager; // HAS-A Relation -> 1 to 1 i.e. 1 Project Object Refers to 1 Manager object
	
	
	public Project() {
	
	}

	public Project(Integer pid, String name, String technology, Integer duration, Integer numOfEmps, Manager manager) {
		this.pid = pid;
		this.name = name;
		this.technology = technology;
		this.duration = duration;
		this.numOfEmps = numOfEmps;
		this.manager = manager;
	}



	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTechnology() {
		return technology;
	}


	public void setTechnology(String technology) {
		this.technology = technology;
	}


	public Integer getDuration() {
		return duration;
	}


	public void setDuration(Integer duration) {
		this.duration = duration;
	}


	public Integer getNumOfEmps() {
		return numOfEmps;
	}


	public void setNumOfEmps(Integer numOfEmps) {
		this.numOfEmps = numOfEmps;
	}


	public Manager getManager() {
		return manager;
	}


	public void setManager(Manager manager) {
		this.manager = manager;
	}


	@Override
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + ", technology=" + technology + ", duration=" + duration
				+ ", numOfEmps=" + numOfEmps+"]";
	}
	
	
}
