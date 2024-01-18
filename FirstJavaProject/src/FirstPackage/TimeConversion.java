package FirstPackage;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		// Enter the second
		System.out.println("Enter the second : ");
		int second = scn.nextInt();
		
		//conversion of second to hours minutes seconds
		int sec = second%60;
		int min1 = second/60;
		int min = min1%60;
		int hour = min1/60;
		
		System.out.println(hour + " hours " + min + " minutes " + sec + " seconds ");

	}
}
