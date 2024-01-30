package Assignment;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		int number = scn.nextInt();
		int sum = 0;
		int value = 0;

		while (number != 0) {
			value = number % 10;
			sum = sum + value;
			number = number/10;
		}
		
		System.out.println("Sum of the digits in integer: " + sum);
	}

}
