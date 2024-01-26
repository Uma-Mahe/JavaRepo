import java.util.Scanner;

public class FactorOfNumber {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a Number : ");
		int value = scn.nextInt();
		
		for (int i = 1; i <= value ; i++) {
			if ((value % i) == 0) {
				System.out.println("Factor of the Number : " + i);
			}
		}
	}
}
