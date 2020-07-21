package com.syntax.class25;

public class StoreTest {
	
	public static void main(String[] args) {
		
		Store macys = new Macys("Macys", "VA");
		Store starb = new Starbucks("Starbucks", "NY");
		Store nike = new Nike("Nike", "LA", "Air Force 1");
		
		Store[] stores={new Macys("Macys", "FL"), 
						new Starbucks("Starbucks", "TX"), 
						new Nike("Nike", "IL", "Flex")}; 
		int size = stores.length;
		System.out.println(size);
		
		for (Store s :stores) {
			s.openHours();
			s.sale();
			System.out.println("----------");
		}
		
		System.out.println("----------LOOPING MY STORES ARRAY----------");
		Store[] myStores = {macys, starb, nike};
		
		for (int i = 0; i<myStores.length; i++) {
			myStores[i].openHours();
			System.out.println("----------");
		}
	}

}
