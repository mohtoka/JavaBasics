package com.syntax.class21;

public class AnimalsTest {
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.breed = "Something";
		a.color = "Grey";
		a.paws = 4;
		
		a.sleep();
		a.eat();
		
		System.out.println("==========Dog==========");
		Dog d = new Dog();
		d.breed = "Husky";
		d.color = "Yellow";
		d.paws = 4;
		d.tail = true;
		
		d.eat();
		d.sleep();
		d.bark();
		
		System.out.println("==========Cat==========");
		Cat c = new Cat();
		c.breed = "Taby";
		c.color = "Black";
		c.paws = 4;
		c.fur = "Long";
		c.tail = true;
		
		c.eat();
		c.sleep();
		c.purr();
		
		System.out.println("==========Kitten==========");
		Kitten k = new Kitten();
		k.breed = "Siamese";
		k.color = "Orange";
		k.paws = 4;
		k.fur = "Short";
		k.tail = false;
		
		k.eat();
		k.sleep();
		k.purr();
		k.meow();
		
		
		
		
		
		
	}

}
