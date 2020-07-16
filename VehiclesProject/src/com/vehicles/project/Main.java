package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			View view = new View();
	
			//Selecting vehicles
			String vehicle = view.getVehicle();
	
			//Vehicles properties 
	        String plate = view.getPlate();
	
			System.out.printf("Quina marca vols que sigui? ");
	        String brand = in.nextLine();	
	        
			System.out.printf("I de quin color?  ");
	        String color = in.nextLine();
	                      
	        System.out.printf("%n");
			
	        System.out.println("Ara toca escollir les rodes");
	
	        //Wheels properties
	        System.out.printf("Marca roda/es del davant: ");
	        String frontWheelBrand = in.nextLine();
	        
	        double frontWheelDiameter = view.getDiameter("Diametre roda/es del davant: ");
	        
			System.out.printf("Marca roda/es del darrere: ");
	        String backWheelBrand = in.nextLine();
	        
	        
	        double backWheelDiameter = view.getDiameter("Diametre roda/es del darrere: ");
	        
	        Wheel frontWheel = new Wheel(frontWheelBrand, frontWheelDiameter);
	        Wheel backWheel = new Wheel(backWheelBrand, backWheelDiameter);
	        
	        if (vehicle == "c") {
	        	Car car = new Car(plate, brand, color);
		        List<Wheel> frontWheels = new ArrayList<Wheel>();
		        List<Wheel> backWheels = new ArrayList<Wheel>();
	
		        frontWheels.add(frontWheel);
		        frontWheels.add(frontWheel);
		        backWheels.add(backWheel);
		        backWheels.add(backWheel);
		        
		        try {
					car.addWheels(frontWheels, backWheels);
					System.out.println("no error");
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
				}
	        } else {
	        	Bike bike = new Bike(plate, brand, color);
	        	try {
					bike.addWheels(frontWheel, backWheel);
					System.out.println("no error");
				} catch (Exception e) {
					System.out.println(e);
					e.printStackTrace();
				}	
	        }
	}

}
