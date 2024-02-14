package Assignment;


import java.util.Scanner;

public class NoOfDaysOfMonth {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter an integer from 1 to 12 to represent a month : ");
		int num = scn.nextInt();
		System.out.print("Enter year in 4 digit : ");
		int year = scn.nextInt();
		int yearMod = year%4;
		
		switch (num) {
			case 1:
				System.out.println("No of day in January is 31");
				break;
			case 2:
				if (yearMod==0) {
				System.out.println("No of day in February is 29");
				break;
				}
				else {
					System.out.println("No of day in February is 28");
				}
			case 3:
				System.out.println("No of day in March is  31");
				break;
			case 4:
				System.out.println("No of day in April is 30");
				break;
			case 5:
				System.out.println("No of day in May is 31");
				break;
			case 6:
				System.out.println("No of day in June is 30");
				break;
			case 7:
				System.out.println("No of day in July is 31");
				break;
			case 8:
				System.out.println("No of day in August is 31");
				break;
			case 9:
				System.out.println("No of day in September is 30");
				break;
			case 10:
				System.out.println("No of day in October is 31");
				break;
			case 11:
				System.out.println("No of day in November is 30");
				break;
			case 12:
				System.out.println("No of day in December is 31");
				break;
		}
	}
}
