package com.oopadvance.zookeeper;

public class Bat extends Mammal {
	//constructor to initialize default value 
	public Bat() {
		// TODO Auto-generated constructor stub
		super.setEnergyLevel(300);
	}
	
	//Methods
	//fly Method 
	public void fly() {
		System.out.println("Bat take off sound");
		this.energyLevel -=50;
		this.displayEnergy();
	}
	
	//eatHumans Method
	public void eatHumans() {
		System.out.println("Bat is eating humans now!!!");
		this.energyLevel +=25;
		this.displayEnergy();
	}
	
	//attackTown Method
	public void attackTown() {
		System.out.println("The town is burning!!");
		this.energyLevel -=100;
		this.displayEnergy();
	}
}
