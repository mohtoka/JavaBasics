package com.syntax.class23;

public class Volume {
	
	
	public int vol(int length, int width) {
		return length*width;
	}
	
	public int vol(int length) {
		return length * length;
	}
	
	public int vol (int length, int width, int height) {
		return length * width * height;
	}

	public static void main(String[] args) {
		
		Volume v = new Volume();
		
		System.out.println(v.vol(10));
		System.out.println(v.vol(10, 20));
		
	}
}
