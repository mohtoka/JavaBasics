package com.syntax.class24;

public class BirdTest {
	
	public static void main(String[] args) {
		
		//compile time polymorphism--checks which methods youre allowed to use
		Bird bird = new BabyBird();	//implicit, up casting
		//runtime polymorphism--checks if methods is overriden to execute first
		bird.fly();
		bird.eat();
		bird.sleep();
		// bird.cry();
		
		BabyBird bb = new BabyBird();
		bb.fly();
		bb.eat();
		bb.sleep();
		bb.cry();
		
		BabyBird baby = (BabyBird) new Bird();
		
		baby.fly();
		baby.sleep();
		baby.eat();
		baby.cry();
	}

}
