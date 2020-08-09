package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalsIntoMap {

	public static void main(String[] args) {

		System.out.println("=====Access all variables and call all methods of Animals=====");
		
		Map<Integer, Animal> life = new LinkedHashMap<>();

		life.put(1, new Dog("Dog", "Grey"));
		life.put(2, new Monkey("Monkey", "Brown"));
		life.put(3, new Zebra("Zebra", "Black & White"));

		System.out.println("=====Using EntrySet=====");

		Set<Entry<Integer, Animal>> entries = life.entrySet();

		
		for (Entry<Integer, Animal> e : entries) {
			Animal animal = e.getValue();
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("----------");
		}

		System.out.println("=====Using values()=====");

		Collection<Animal> values = life.values();

		for (Animal animal : values) {
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("----------");
		}

		Set<Integer> keys = life.keySet();
		
		for(Integer key: keys) {
			Animal animal = life.get(key);
			System.out.println(animal.type);
			System.out.println(animal.color);
			animal.eat();
			animal.sleep();
			System.out.println("----------");
		}
		
		//Task
		//Complete all examples from AnimalsIntoMap class with Iterator
		
		Iterator<Entry<Integer, Animal>> iterator = entries.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, Animal> a = iterator.next();
			Integer key = a.getKey();
			Animal value = a.getValue();
			System.out.println("Animal # " + key + "'s color is " + value.color);
			System.out.println("Animal # " + key + "'s type is " + value.type);
			value.eat();
			value.sleep();
			System.out.println("----------");
		}
		
		
		
		
		
		
	}

}
