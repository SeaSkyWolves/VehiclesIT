package controller;

import java.util.ArrayList;
import java.util.List;

import model.Bike;
import model.Car;
import model.Wheel;
import view.View;

public class Controller {
	
	View view;
	
	public Controller(View view){
		this.view = view;
	}
	
	public String getVehicle() {
		String vehicle = view.getVehicle();
		return vehicle;
	}
	
	public String[] getInfo() {
		String plate = "";
		while (!validatePlate(plate)) {
			plate = view.getPlate();
		}

        String brand = view.getString("Quina marca vols que sigui? ");
        
        String color = view.getString("I de quin color?  ");
                      
        System.out.printf("%n");
        
        String[] info = {plate, brand, color};
		return info;
	}
	
	public void setCar(String plate, String brand, String color, Wheel frontWheel, Wheel backWheel) {
    	Car car = new Car(plate, brand, color);
        List<Wheel> frontWheels = new ArrayList<Wheel>();
        List<Wheel> backWheels = new ArrayList<Wheel>();

        frontWheels.add(frontWheel);
        frontWheels.add(frontWheel);
        backWheels.add(backWheel);
        backWheels.add(backWheel);
        
        try {
			car.addWheels(frontWheels, backWheels);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	public void setBike(String plate, String brand, String color, Wheel frontWheel, Wheel backWheel) {
    	Bike bike = new Bike(plate, brand, color);
    	try {
			bike.addWheels(frontWheel, backWheel);
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}	
	}
		
	
	public boolean validatePlate(String plate) {
		int countDigit = 0;
		int countLetter = 0;

		for (char ch: plate.toCharArray()) {
			if (Character.isDigit(ch)){
				++countDigit;
			}
			if (Character.isLetter(ch)){
				++countLetter;
			}
		}
		if ((countDigit == 2) && (countLetter == 4)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean validateDiameter(double WheelDiameter) {
		return !(0.4 < WheelDiameter &&  WheelDiameter < 4);
	}
	
	public Wheel getFrontWheel() {
        String frontWheelBrand = view.getString("Marca roda/es del davant: ");
        
        double frontWheelDiameter = view.getDiameter("Diametre roda/es del davant: ");
        
        Wheel frontWheel = new Wheel(frontWheelBrand, frontWheelDiameter);
		return frontWheel;

	}
	
	public Wheel getBackWheel() {
        String backWheelBrand = view.getString("Marca roda/es del darrere: ");
        
        double backWheelDiameter = view.getDiameter("Diametre roda/es del darrere: ");
        
        Wheel backWheel = new Wheel(backWheelBrand, backWheelDiameter);
		return backWheel;

	}
	
}
