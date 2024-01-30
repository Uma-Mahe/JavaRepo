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
			//System.out.println(digit);
			
			revNumber = revNumber*10 + digit;
			//System.out.println(num1);
			
			num = num/10;
			//System.out.println(num);
			
		}
		System.out.println("Reverse Number : " + revNumber);
	}
}
