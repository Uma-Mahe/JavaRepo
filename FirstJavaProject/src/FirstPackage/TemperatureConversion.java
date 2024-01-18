package FirstPackage;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		
		// Enter the Temperature 
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the temperature : ");
		double temp = scn.nextDouble();
		
		// Conversion of Celsius to Fahrenheit
		double fahrenheit = 1.8* temp + 32;
		double kelvin = temp + 273;
		
		System.out.println(temp + " Celsius = " + fahrenheit + " Fahrenheit");
		System.out.println(temp + " Celsius = " + kelvin + " Kelvin");
		
}
}
