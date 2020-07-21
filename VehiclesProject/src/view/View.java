package view;

import java.util.Scanner;

public class View {
	Scanner in = new Scanner(System.in);
	
	public String getPlate() {

		System.out.print("Matrícula?  ");
		String plate  = in.nextLine();
        return plate;
	}
	
	
	public String getString(String text) {
		String inputText = "";
		do {
		System.out.printf("%s", text);
		inputText= in.nextLine();
		return inputText;
		} while (inputText == "");
	}	
	
	
	public double getDiameter(String text) {
		double WheelDiameter = 0;
		while (!(0.4 < WheelDiameter &&  WheelDiameter < 4)) {
			System.out.printf("%s", text);
			WheelDiameter = getNumber();
			in.nextLine();
		}
		return WheelDiameter;
	}	
	
	
	public String getVehicle(){
		String answer = "";
		
		while (!answer.equals("c") && !answer.equals("m")) {
			System.out.printf("Que desitges comprar, un cotxe o una moto? (c: cotxe/ m: moto): ");
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
