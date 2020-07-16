package com.vehicles.project;

import java.util.Scanner;

public class View {
	Scanner in = new Scanner(System.in);
	Controller controller = new Controller();

	
	public String getPlate() {

		String plate = "";
		while (!controller.validatePlate(plate)) {
			System.out.print("Matrícula?  ");
			plate  = in.nextLine();
		}
        return plate;
	}
	
	
	public double getDiameter(String text) {
		double WheelDiameter = 0;
		while (controller.validateDiameter(WheelDiameter)) {
			System.out.printf("%s", text);
			WheelDiameter = getNumber();
			in.nextLine();
		}
		return WheelDiameter;
	}	
	
	
	public String getVehicle(){
		String answer = "";
		
		while (!answer.equals("c") && !answer.equals("m")) {
			System.out.printf("Que desitges comprar, un cotxe o una moto? (c: cotxe/ b: bicicleta): ");
			answer = in.nextLine();	
			}
		return answer;
		}
	
	
	public double getNumber() {
		double number;
			try {			
				number = in.nextDouble();	
			} catch (Exception e){
				System.out.println("No has escrit el diametre adequat, torna a intentar-ho");
				number = 0;
			}		
		return number;
	}
	
}
