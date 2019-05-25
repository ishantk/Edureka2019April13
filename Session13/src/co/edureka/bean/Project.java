package co.edureka.bean;

public class Project {

	// Attributes 
	String title;
	String technology;
	int timeLine;
	
	public Project() {
	
	}

	public Project(String title, String technology, int timeLine) {
		this.title = title;
		this.technology = technology;
		this.timeLine = timeLine;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public int getTimeLine() {
		return timeLine;
	}

	public void setTimeLine(int timeLine) {
		this.timeLine = timeLine;
	}

	@Override
	public String toString() {
		return "Project [title=" + title + ", technology=" + technology + ", timeLine=" + timeLine + "]";
	}
	
}
