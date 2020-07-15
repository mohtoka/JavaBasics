package com.syntax.class22;

public class EmployeeTest {
	
	
	
	public static void main(String[] args) {
		
		System.out.println("==========Employee==========");
		Employee e = new Employee();
		e.salary = 0.0;
		
		e.work();
		e.getPaid();
		e.display();
		
		System.out.println();
		System.out.println("==========ScrumTeam==========");
		ScrumTeam st = new ScrumTeam();
		st.salary = 0.0;
		st.ceremonies = "Very cool";
		
		st.work();
		st.getPaid();
		st.attendMeetings();
		st.buildSoftware();
		st.displayScrumTeam();
		
		System.out.println();
		System.out.println("==========ProductOwner==========");
		ProductOwner po = new ProductOwner();
		po.salary = 90000;
		po.ceremonies = "Very cool";
		
		po.work();
		po.getPaid();
		po.attendMeetings();
		po.buildSoftware();
		po.communicate();
		po.prioritizePb();
		po.displayScrumTeam();
		
		System.out.println();
		System.out.println("==========ScrumTeam==========");
		ScrumMaster sm = new ScrumMaster();
		sm.salary = 80000;
		sm.ceremonies = "Very cool";
		
		sm.work();
		sm.getPaid();
		sm.attendMeetings();
		sm.buildSoftware();
		sm.shieldTeam();
		sm.doMeetings();
		sm.displayScrumTeam();
		
		System.out.println();
		System.out.println("==========Developer==========");
		Developer d = new Developer();
		d.salary = 70000;
		d.ceremonies = "Very cool";
		
		d.work();
		d.getPaid();
		d.attendMeetings();
		d.buildSoftware();
		d.code();
		d.displayScrumTeam();
		
		System.out.println();
		System.out.println("==========Tester==========");
		Tester t = new Tester();
		t.salary = 60000;
		t.ceremonies = "Very cool";
		
		t.work();
		t.getPaid();
		t.attendMeetings();
		t.buildSoftware();
		t.test();
		t.displayScrumTeam();
		
		System.out.println();
		System.out.println("==========BusinessAnalyst==========");
		BusinessAnalyst ba = new BusinessAnalyst();
		ba.salary = 50000;
		ba.ceremonies = "Very cool";
		
		ba.work();
		ba.getPaid();
		ba.attendMeetings();
		ba.buildSoftware();
		ba.gatherRequirements();
		ba.displayScrumTeam();
		
		
		
	}

}
