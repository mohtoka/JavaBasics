package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class CardTest {
	
	public static void main(String[] args) {
		
		LinkedList<Card> cards = new LinkedList<>();
		
		cards.add(new MasterCard("MasterCard"));
		cards.add(new Visa("Visa"));
		cards.add(new Discover("Discover"));
		
		
		Iterator<Card> c = cards.iterator();
		
		while(c.hasNext()) {
			Card ca = c.next();
			ca.max();
			ca.limit();
			
		}
		
	}

}
