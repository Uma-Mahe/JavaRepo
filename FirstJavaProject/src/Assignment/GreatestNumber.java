package Assignment;


import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the first numbers : ");
		int num1 = scn.nextInt();
		
		System.out.print("Enter the second numbers : ");
		int num2 = scn.nextInt();
		
		System.out.print("Enter the third numbers : ");
		int num3 = scn.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Greatest Number is : " + num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println("Greatest Number is : " + num2);
		}
		else {
			System.out.println("Greatest Number is : " + num3);
		}
		
	}
}
