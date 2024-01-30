package Assignment;
import java.util.Scanner;

import org.testng.annotations.Test;

public class FactorOfNumber {
	@Test
	public  void main() {
		
		Scanner scn = new Scanner(System.in);
				System.out.print("Enter a Number : ");
		int value = scn.nextInt();
		if (value % 2 != 0) {
			for (int i = 1; i <= value/2 ; i=i+2) {
				//System.out.println("i : " + i);
				if ((value % i) == 0) {
				System.out.println(i + " ");
				}
			}
		}
		else {
			for (int i = 1; i <= value/2 ; ++i) {
				//System.out.println("i : " + i);
				if ((value % i) == 0) {
				System.out.println(i + " ");
				}
			}
		
		}
		
		System.out.println(value);
	}
}
