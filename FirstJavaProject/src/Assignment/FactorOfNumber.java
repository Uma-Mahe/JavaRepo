package Assignment;
import java.util.Scanner;

import org.testng.annotations.Test;

public class FactorOfNumber {
	@Test
	public  void main() {
		
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
