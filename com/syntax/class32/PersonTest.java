package com.syntax.class32;

import java.util.*;
import java.util.Map.Entry;

public class PersonTest {
	
	public static void main(String[] args) {
		
		Map<Integer, Person> person = new TreeMap<>();
		
		person.put(34408945, new Person("Toka", "Mohamed", 23, 100000));
		person.put(34587295, new Person("Tasnim", "Mohamed", 22, 111111));
		person.put(59587603, new Person("Selsabil", "Mohamed", 17, 222222));
		
		Set<Entry<Integer, Person>> entry = person.entrySet();
		
		
		System.out.println("==========Using For Loop==========");
		for(Entry<Integer, Person> e : entry) {
			int key = e.getKey();
			Person value = e.getValue();
			System.out.print("ID: " + key + ". ");
			value.print();
			System.out.println("----------");
		}
		
		System.out.println("==========Using Iterator==========");

		Iterator<Entry<Integer, Person>> iterator = entry.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, Person> ent = iterator.next();
			int key = ent.getKey();
			Person value = ent.getValue();
			System.out.print("ID: " + key + ". ");
			value.print();
			System.out.println("----------");
		}
		
		
		
	}

}
