package com.oopadvance.zookeeper;

/**
 * @author Dell
 *
 */
public class TestGorilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla gorilla = new Gorilla();
		
		//Test throwSomething Method
		gorilla.throwSomthing("stone");
		gorilla.throwSomthing("trash");
		gorilla.throwSomthing("Banana");
		
		//Test eatBananas Method
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		//Test climb
		gorilla.climb();
	}

}
