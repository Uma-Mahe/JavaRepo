package Assignment;

import java.util.Scanner;

public class MergeStringReverseOrder {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String str1 = scn.next();
		System.out.print("Enter the second string : ");
		String str2 = scn.next();
		
		StringBuilder result = new StringBuilder();
		char ch1, ch2;
		
		for(int i=0; i<str1.length() || i<str2.length(); i++) {
			if (i<str1.length()) {
				ch1=str1.charAt(i);
				result.append(ch1);
			}
			if (i<str2.length()) {
				ch2=str2.charAt(i);
				result.append(ch2);
			}
		}
		System.out.println(result.reverse().toString());
	}
}
