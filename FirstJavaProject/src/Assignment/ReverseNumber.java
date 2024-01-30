package Assignment;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter an Integer : ");
		int num = scn.nextInt();
		int digit, revNumber = 0;
		
		while (num != 0) {
			digit = num % 10;
			revNumber = revNumber*10 + digit;
			num = num/10;
		}
		System.out.println("Reverse Number : " + revNumber);
	}
}
