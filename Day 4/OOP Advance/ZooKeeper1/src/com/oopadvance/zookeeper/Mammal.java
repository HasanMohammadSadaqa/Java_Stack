package com.oopadvance.zookeeper;

public class Mammal {
	protected double energyLevel;

	//getter & setter
	public double getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(double energyLevel) {
		this.energyLevel = energyLevel;
	}
	//constructor
	Mammal(){
		this.energyLevel = 100;
	}
	//Methods 
	public double displayEnergy() {
		System.out.println("Energy is: " + energyLevel);
		return energyLevel;
	}
}
