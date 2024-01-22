package FirstPackage;

import java.util.Scanner;

public class WeekdayGeneration {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a integer between 1 to 7 : ");
		int value = scn.nextInt();
		if (value == 1) {
		System.out.println("Sunday");
		}
		else if (value == 2) {
		System.out.println("Monday");
		}
		else if (value == 3) {
		System.out.println("Tuesday");
		}
		else if (value == 4) {
		System.out.println("Wednesday");
		}
		else if (value == 5) {
		System.out.println("Thursday");
		}
		else if (value == 6) {
		System.out.println("Friday");
		}
		else {
		System.out.println("Saturday");
		}
		
		
	}

}
