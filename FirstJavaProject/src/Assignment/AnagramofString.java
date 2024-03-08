package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramofString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String str1 = scn.nextLine();
		System.out.print("Enter the second string : ");
		String str2 = scn.nextLine();
		if (isAnagram(str1, str2)) 
			System.out.println("The Strings are Anagram");
		else
			System.out.println("The Strings are not anagram");
	}
	public static boolean isAnagram(String str1, String str2) {
		char[] arrStr1= str1.toLowerCase().toCharArray();
		char[] arrStr2= str2.toLowerCase().toCharArray();
		
		if (str1.length()!=str2.length()) {
			return false;
		}
		Arrays.sort(arrStr1);
		Arrays.sort(arrStr2);
		for(int i=0; i<str1.length(); i++) {
			if (arrStr1[i]!=arrStr2[i])
				return false;
		}
		return true;
	}
}
