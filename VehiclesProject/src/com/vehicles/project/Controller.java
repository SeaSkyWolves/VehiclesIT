package com.vehicles.project;

public class Controller {
	
	
	
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
	
	
}
