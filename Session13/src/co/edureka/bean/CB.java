package co.edureka.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CB {

	CA ca; // HAS-A Relation | 1 to 1 mapping
	
	public CB() {
	
	}

	//@Autowired
	public CB(CA ca) {
		this.ca = ca;
		System.out.println(">> Constructor Based DI");
	}


	public CA getCa() {
		return ca;
	}

	@Autowired
	public void setCa(CA ca) {
		this.ca = ca;
		System.out.println(">> Setter Based DI");
	}
	
}
