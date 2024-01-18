package FirstPackage;

import java.util.Scanner;

public class SqureCubeFourthPower {
public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	// Enter the value
	System.out.println("Enter the value : ");

	double value = scn.nextDouble();
	
	// Calculation for square, cube and fourth power
	double square = Math.pow(value, 2);
	double cube = Math.pow(value, 3);
	double fourthpower = Math.pow(value, 4);
	
	System.out.println("square : " + square);
	System.out.println("cube : " + cube);
	System.out.println("fourthpower : " + fourthpower);
}
}
