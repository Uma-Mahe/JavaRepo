package Assignment;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of fibonacci series : ");
		int number = scn.nextInt();
		
		int i = 0;
		int j = 1;
		int k = 0;
		
		System.out.print(i + " ");
		System.out.print(j + " ");
		
		for (int count = 1; count <= number-2; count++) {
			k = i + j;
			System.out.print(k + " ");
			i = j;
			j = k;
		}
	}
}
