package FirstPackage;

import java.util.Scanner;

public class PositiveOrNegative {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int value = scn.nextInt();
		
		if (value > 0) {
			System.out.println("Number is Positive");
		}
		else if (value < 0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is Zero");
		}
	}

}
