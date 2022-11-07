package com.springprojects.FruityLoops.models;

public class Items {
	    // MEMBER VARIABLES
	    private String name;
	    private double price;
	    
	    // CONSTRUCTOR
	    public Items(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
	  //getter and setters
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
}
