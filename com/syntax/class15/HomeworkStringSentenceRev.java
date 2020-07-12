package com.syntax.class15;

public class HomeworkStringSentenceRev {
	
	public static void main(String[] args) {
		
		//1. create STRING with sentence
		String s = "Hello my name is Toka";
		
		//2. make a second String where reversed value will go
		String rev = "";
		
		//3. split String by each space, add to an array
		String[] ar = s.split(" ");
		
		//4. create for loop
		for(int i = ar.length-1; i>=0; i--) {
			
			//5. add each element in array to rev String
			rev += ar[i] + " ";
		}
		
		//6. print
		System.out.println(rev);
		
	}

}
