package Assignment;

import java.util.Scanner;

public class SumOfNumbersInString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scn.next();
		
		System.out.println(sumOfNumber(str));
	}
	public static int sumOfNumber(String str) {
		String temp = "0";
		int sum=0;
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp = temp+ch;
			} else {
				sum = sum + Integer.parseInt(temp);
				temp="0";
			}
		}
		System.out.println(temp);
		return sum+Integer.parseInt(temp);
	}
}
