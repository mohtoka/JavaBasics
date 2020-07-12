package com.syntax.class15;

public class SplitTask1 {

	public static void main(String[] args) {

		String s = "My Name is Toka";
		String ar[] = s.split(" ");
		String news = "";
		for (String sent : ar) {
			news+=sent;
		}
		System.out.println(news);

	
	
	
	
	}

}
