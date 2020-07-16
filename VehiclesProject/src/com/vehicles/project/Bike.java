package com.vehicles.project;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);
	}
	
	public void addWheels(Wheel frontWheels, Wheel backWheels) {
		this.wheels.add(frontWheels);
		this.wheels.add(backWheels);

	}

}
