package Assignment;

import java.util.Scanner;

public class Palindrome {
	public static boolean palindromeString(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = scn.nextLine();
		
		String str1 = str.toLowerCase();
		if (palindromeString(str1)) {
			System.out.println("The String "+ str + " is a Palindrome");
		} else {
			System.out.println("The String "+ str + " is not a Palindrome");
		}
		scn.close();
	}
}
