package com.syntax.class19;

public class AccessMembers {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name = "Gozde";	//public
		emp.lastName = "Doe";	
		emp.age = 30;			//protected
		emp.salary = 100000;	//default
		//emp.ssn; //PRIVATE AM
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		
	}

}
