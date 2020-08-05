package com.syntax.class24;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.salary = 90000;
		e.getPaid();
		
		Contractor c = new Contractor();
		c.hourly = 50;
		c.getPaid();
		
		FullTime ft = new FullTime();
		ft.salary = 95000 ;
		ft.getPaid();
		
	}

}
