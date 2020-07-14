package com.syntax.class21;

public class Teacher {

	// Write a Java program called Teacher. Identify features and behavior of that
	// Class. Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
	// that would have it their own features and behavior. Test all 4 classes

	String name;
	String subject;
	boolean isNice;
	
	void teach() {
		System.out.println(name +" teaches " + subject);
	}
	
	void givesTest() {
		System.out.println(name + " gives tests");
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("====Default====");
		Teacher t = new Teacher();
		
		t.name = "Faculty";
		t.subject = "Default";
		t.isNice = false;
		
		t.teach();
		t.givesTest();
		
		System.out.println("====Math====");
		MathTeacher m = new MathTeacher();
		
		m.name = "Mr. Bilal";
		m.subject = "Math";
		m.isNice = true;
		m.lesson = "Algebra";
		
		m.teach();
		m.givesTest();
		m.givesQuizes();
		
		System.out.println("====Chemistry====");
		ChemistryTeacher c = new ChemistryTeacher();
		
		c.name = "Mr. Taskin";
		c.subject = "Chemistry";
		c.isNice = true;
		c.isBoring = false;
	
		c.teach();
		c.givesTest();
		c.givesProjects();
		
		System.out.println("====Piano====");
		PianoTeacher p = new PianoTeacher();
		
		p.name = "Ms. Piano";
		p.subject = "Music";
		p.isNice = false;
		p.instrument = "Piano";
		
		p.teach();
		p.givesTest();
		p.playsMusic();
		
	}
	
	

}
