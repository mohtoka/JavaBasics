package com.syntax.class19;

public class Task {

	//first task
	protected int sum(int[] a){
		int sum = 0;
		for (int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	//second task
	public static String reversed(String s){
		String rev = "";
		for (int i = s.length()- 1; i>=0; i--) {
			rev+= s.charAt(i);
		}	
		return rev;
	}

	//third task
	private static String vowels(String s){
		String vow = "";
		for (int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				vow+= s.charAt(i);
			}
		}
		return vow;
	}
	
	public static void main(String[] args) {
		
		Task t = new Task();
		
		//first task
		int[] array = {1, 10, 100, 1000, 10000, 100000};
		System.out.println(t.sum(array));
		
		//second task
		System.out.println(Task.reversed("hello"));
		
		//third task
		System.out.println(Task.vowels("hello how are you"));
	}
}




