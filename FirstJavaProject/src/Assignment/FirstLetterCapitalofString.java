package Assignment;

import java.util.Scanner;

public class FirstLetterCapitalofString {
	public static void printFirstCaptalize(String str) {
		String capitalizeStr ="";
		String[] word = str.split(" ");
		for(int i=0; i<word.length; i++) {
			String[] allChar = word[i].split("");
			capitalizeStr = capitalizeStr+allChar[0].toUpperCase();
			for (int j=1; j<allChar.length; j++) {
				capitalizeStr=capitalizeStr+allChar[j];
			}
			capitalizeStr = capitalizeStr+" ";
		}
		System.out.println(capitalizeStr);
	} 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = scn.nextLine();
		printFirstCaptalize(str);
	}
}
