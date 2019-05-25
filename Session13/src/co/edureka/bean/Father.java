package co.edureka.bean;

public class Father {

	// Attributes
	String fname;
	String lname;
	int vehicles;
	
	public Father() {
	
	}

	public Father(String fname, String lname, int vehicles) {
		this.fname = fname;
		this.lname = lname;
		this.vehicles = vehicles;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getVehicles() {
		return vehicles;
	}

	public void setVehicles(int vehicles) {
		this.vehicles = vehicles;
	}

	@Override
	public String toString() {
		return "Father [fname=" + fname + ", lname=" + lname + ", vehicles=" + vehicles + "]";
	}
	
}
