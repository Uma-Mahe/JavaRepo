import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter an integer : ");
		int N = scn.nextInt();
		int sum = 0;
		int value = 0;
		
		while (N != 0) {
			value = N%10;
			sum = sum + value;
			N = N/10;
		}
		
		System.out.println("Sum of the digits in integer: " + sum);
	}

}
