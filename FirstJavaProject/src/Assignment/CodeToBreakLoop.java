package Assignment;

import java.util.Scanner;

public class CodeToBreakLoop {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int i = scn.nextInt();
		while (true) {
			System.out.println(i);
			if (i<0) {
				break;
			}
		}
	}
}