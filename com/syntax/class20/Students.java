package com.syntax.class20;

public class Students {

	String name;
	int math, science, english;

	Students(String stName, int mathGrade, int scienceGrade, int englishGrade) {
		math = mathGrade;
		science = scienceGrade;
		english = englishGrade;
		name = stName;
	}

	void averageGrade() {
		int average = (english + science + math) / 3;

		System.out.println(name + "'s grade average is " + average);
	}

	public static void main(String[] args) {
		Students toka = new Students("Toka", 100, 93, 85);
		toka.averageGrade();
		
		Students asel = new Students("Asel", 100, 90, 78);
		asel.averageGrade();
		
	}
}
