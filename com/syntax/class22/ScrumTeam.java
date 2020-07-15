package com.syntax.class22;

public class ScrumTeam extends Employee{
	
	String ceremonies;
	
	void buildSoftware() {
		System.out.println("I work together with my team to build software");
	}
	void attendMeetings() {
		System.out.println("I attend Meetings");
	}
	void displayScrumTeam() {
		display();
		System.out.println("Ceremonies are " + ceremonies);
	}

}
