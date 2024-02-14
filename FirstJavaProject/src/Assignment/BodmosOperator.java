package Assignment;

import java.util.Scanner;

public class BodmosOperator {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the value for i : ");
		int i=scn.nextInt();
		System.out.print("Enter the value for j : ");
		int j=scn.nextInt();
		System.out.print("Enter the value for k : ");
		int k=scn.nextInt();
		System.out.print("Enter the value for m : ");
		int m=scn.nextInt();
		int result = ((i-j)*k)+m;
		System.out.println("Answer is : " + result);
	}
}
