package co.edureka.model;

/*
 	SQL Command to create a table: 
 	create table Employee(
 		eid int primary key auto_increment, 
 		name varchar(256),
 		phone varchar(20),
 		email varchar(256),
 		salary int
 	)
 	
 	INSERT
 	insert into Employee values(null, 'Jack', '+91 98765 98765', 'jack@example.com', 47500)
 	
 	UPDATE
 	update Employee set name = 'Jack Johnson', phone = '+91 99000 11000', email='jack.js@example.com', salary = 79800 where eid = 1
 	
 	DELETE
 	delete from Employee where eid = 2
 	
 	RETRIEVE
 	select * from Employee
 	select * from Employee where salary > 60000
 	
 	CREATE PROCEDURE
 	CREATE PROCEDURE `addEmployee`(IN `name` VARCHAR(256), IN `phone` VARCHAR(256), IN `email` VARCHAR(256), IN `age` INT) NOT DETERMINISTIC NO SQL SQL SECURITY DEFINER insert into Employee values(null, name, phone, email, age)
 	
 */

public class Employee {

	// Attributes:
	public int eid;
	public String name;
	public String phone;
	public String email;
	public int salary;
	
	public Employee() {
	
	}

	public Employee(int eid, String name, String phone, String email, int salary) {
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", phone=" + phone + ", email=" + email + ", salary="
				+ salary + "]";
	}
	
}
