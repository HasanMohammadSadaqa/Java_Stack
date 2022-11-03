package com.oopadvanced.AbstractArt;

public class Sculpture extends Art{
	protected String material;
	protected static int Sculcount = 0;
	//Constructor
	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
		Sculcount ++;
	}
	
	@Override
	public void viewArt() {
		
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	
}
