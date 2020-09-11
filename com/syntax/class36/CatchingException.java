package com.syntax.class36;

public class CatchingException {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b);
		}catch(Exception ae) {
			//Exception ae = new ArithmeticException();
			//ae.printStackTrace();					//NAME + MESSAGE + DETAILS
			//System.out.println(ae.getMessage());	//MESSAGE
			
			System.out.println(ae);					//NAME + MESSAGE
		}
		
		
		System.out.println("End of the code");
		
		
		
		
		
	}

}
