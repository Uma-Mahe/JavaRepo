package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOccuringCharacter {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = scn.nextLine();
		
		maximumCharacterOccur(str);
	}
	public static void maximumCharacterOccur(String str) {
		char[] chArr = str.toLowerCase().toCharArray();
		Arrays.sort(chArr);
		int max =0;
		int count=0;
		char maxChar = ' ';
		for (int i=1; i<str.length(); i++) {
			if (chArr[i]==chArr[i-1])
				count++;
			else
				count=1;
			if (count>max) {
				max=count;
				maxChar=chArr[i];
			}
		}
		System.out.print(maxChar +" occur "+ max + " times");
	}
}