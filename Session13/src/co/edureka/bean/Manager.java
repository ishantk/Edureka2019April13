package co.edureka.bean;

import java.util.List;

public class Manager {

	// Attributes:
	String name;
	int teamSize;
	String projectName;
	
	// project is a dependency in Manager
	Project project; 			// Has-A Relationship | 1 to 1 Mapping | 1 manager has 1 project
	
	List<String> certificates;  // Has-A Relationship | 1 to many Mapping | 1 manager has many certificates
	
	public Manager() {
		//project = new Project(); // do not create object like this. -> ** high coupling **
		// Construction of Object of Project is dependent on construction of Manager Object
	}
	
	
	// Create a Separate Constructor where we can pass reference of Project object as Input
	// ** 1. Low Coupling ** | While constructing the object
	public Manager(Project project) {
		this.project = project;
		System.out.println(">> Constructor Based DI");
	}

	public Project getProject() {
		return project;
	}

	// Create a setter where we can pass reference of Project object as Input
	// ** 2. Low Coupling ** | After object construction
	public void setProject(Project project) {
		this.project = project;
		System.out.println(">> Setter Based DI");
	}
	
	public List<String> getCertificates() {
		return certificates;
	}

	public void setCertificates(List<String> certificates) {
		this.certificates = certificates;
	}


	public Manager(String name, int teamSize, String projectName) {
		this.name = name;
		this.teamSize = teamSize;
		this.projectName = projectName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", teamSize=" + teamSize + ", projectName=" + projectName + "]"+project.toString();
	}
	
}
