package Assignment;

import java.util.Scanner;

public class LuhnAlgorithm {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the 16 digit integer : ");
		String cardNo = scn.next();
		
		int digit = cardNo.length();
		int sum=0;
		boolean alter=false;
		
		for (int i = digit-1; i>=0; i--) {
			int d = Integer.parseInt(cardNo.substring(i, i+1));
			if (alter) {
				d = d*2;
				if (d>9) {
					d -= 9;
				}
			}
			sum = sum+d;
			alter = !alter;
		}
		System.out.println(sum%10 == 0);
	}
}
