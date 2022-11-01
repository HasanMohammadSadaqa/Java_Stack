package com.oopadvance.zookeeper;

public class Gorilla extends Mammal {
	//Methods
	
	//throwSomthing Method
	public void throwSomthing(String sth) {
		System.out.println("Gorilla threw " + sth);
		super.energyLevel -= 5;
	}
	
	//eatBananas Method
	public void eatBananas() {
		System.out.println("Hey There i ate alot of Bananas!!");
		super.energyLevel += 10;
	}
	
	//climb Method
	public void climb() {
		System.out.println("Hey ther I climbed the tree, amazing!! ");
		super.energyLevel -= 10;
	}
	
}
