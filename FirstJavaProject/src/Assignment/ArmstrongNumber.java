package Assignment;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println(" Enter a number to find its Armstrong Number or not : ");
		int number = scn.nextInt();
		int duplicateNumber = number;
		int value, armNo = 0;
		
		while (number != 0) {
			value = number % 10;
			armNo = armNo + (value*value*value);
			number = number/10;
		}
		if (duplicateNumber == armNo) {
		System.out.println(armNo + " is an Armstrong Number");
		}
		else {
			System.out.println(armNo + " is not an Armstrong Number");
		}
	}
}
