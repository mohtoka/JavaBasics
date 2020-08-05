package com.syntax.class29;


import java.util.ArrayList;

public class ArrayListIntro {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("hello");
		arrayList.add("Welcome");
		arrayList.add("How are you");
		
		System.out.println("Original arrayList = " + arrayList);
		
		//how many elements in arrList
		int arrayListSize = arrayList.size();
		System.out.println("original size = " + arrayListSize);
		
		String elementIndex2 = arrayList.get(2);
		System.out.println(elementIndex2);
		
		arrayList.add("Goodbye");
		arrayList.add("Thank you");
		
		System.out.println("second size = " + arrayList.size());
		
		arrayList.remove(0);
		System.out.println("size after removing ind 0 = " + arrayList.size());
		
		arrayList.set(2, "Bye");
		System.out.println("arrayList after adding " + arrayList);
		
		
	}

}
