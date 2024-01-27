package Assignment;


import java.util.Scanner;

public class ArithmeticCalculation {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the integer A :");
		int A = scn.nextInt();
		System.out.println("Enter the integer B :");
		int B = scn.nextInt();

		// Calculation of sum, difference, product, average, distance, max and min
		int sum = A + B;
		int difference = A - B;
		int product = A*B;
		double average = (double)(A + B)/2;
		int distance = Math.abs(A - B);
		int max = Math.max(A, B);
		int min = Math.min(A, B);
		
		System.out.println("sum : "+sum);
		System.out.println("Difference : "+ difference);
		System.out.println("Product : "+ product);
		System.out.println("Average : "+ average);
		System.out.println("Distance : "+ distance);
		System.out.println("Maximum : "+ max);
		System.out.println("Minimum : "+ min);
	
	}
}
