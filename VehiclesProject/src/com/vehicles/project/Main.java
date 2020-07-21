package com.vehicles.project;

import controller.Controller;
import model.Wheel;
import view.View;

public class Main {
	
	
	public static void main(String[] args) {

		View view = new View();
		Controller controller = new Controller(view);

		//Selecting vehicles
		String vehicle = controller.getVehicle();

		//Vehicles properties 
		
		String[] info = controller.getInfo();
		String plate = info[0];
		String brand = info[1];
		String color = info[2];
		
        System.out.println("Ara toca escollir les rodes");

        Wheel frontWheel = controller.getFrontWheel();
        Wheel backWheel = controller.getBackWheel();


        
        if (vehicle == "c") {
        	controller.setCar(plate, brand, color, frontWheel, backWheel);
        } else {
        	controller.setBike(plate, brand, color, frontWheel, backWheel);
        }
        
        
        
}

}
