package Assignment;

import java.util.Scanner;

public class NoOfCharactersInString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str= scn.nextLine();
		int len = str.length();
		int count = 0;
		
		for (int i=0; i<len; i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total no of characters in the string : " + count);
	}

}
