package Assignment;

import java.util.Scanner;

public class MoneyReturnCoinChange {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the amount in Rupees bought for items : ");
		int price = scn.nextInt();
		System.out.print("Enter the amount in Rupees given : ");
		int givenAmount = scn.nextInt();
		int change = givenAmount-price;
		System.out.println("Amount to Return as change : " + change +"Rupees");
		
		int tenRupees = change/10;
		if (tenRupees>0) {
			System.out.print(tenRupees + " -Ten Rupee");
		}
		change=change%10;
		int fiveRupees = change/5;
		if (fiveRupees>0) {
			System.out.print(fiveRupees + " -Five Rupee ");
		}
		change=change%5;
		int twoRupees = change/2;
		if (twoRupees>0) {
			System.out.print(twoRupees + " -Two Rupee ");
		}
		change=change%2;
		int oneRupee = change/1;
		if (oneRupee>0) {
			System.out.print(oneRupee + " -One Rupee ");
		}
	}

}
