package FirstPackage;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the second : ");
		int second = scn.nextInt();
		int sec = second%60;
		int min1 = second/60;
		int min = min1%60;
		int hour = min1/60;

		System.out.println(hour + " hour " + min + " minutes " + sec + " seconds ");

	}
}
