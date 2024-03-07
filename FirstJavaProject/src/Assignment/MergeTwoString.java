package Assignment;

import java.util.Scanner;

public class MergeTwoString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String str1 = scn.nextLine();
		System.out.print("Enter the second string : ");
		String str2 = scn.nextLine();

		mergeString(str1, str2);
	}
	public static void mergeString(String str1, String str2) {
		StringBuilder mergeStr = new StringBuilder();
		char ch1, ch2;
		
		for(int i=0; i<str1.length() || i<str2.length(); i++) {
			if (i<str1.length()) {
				ch1=str1.charAt(i);
				mergeStr.append(ch1);
			}
			if (i<str2.length()) {
				ch2=str2.charAt(i);
				mergeStr.append(ch2);
			}
		}
		System.out.println(mergeStr.toString());
	
	}

}
