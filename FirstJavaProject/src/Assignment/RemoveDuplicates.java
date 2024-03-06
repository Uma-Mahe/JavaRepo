package Assignment;

import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str= scn.next();
		removeDuplicate(str);
	}
	public static void removeDuplicate(String str) {
		String newStr = new String();
		int length = str.length();
		for (int i=0; i<length; i++) {
			char charDuplicate = str.charAt(i);
			if (newStr.indexOf(charDuplicate)<0) {
				newStr = newStr+charDuplicate;
			}
		}
		System.out.println(newStr);
	}
}
