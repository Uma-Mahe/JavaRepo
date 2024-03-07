package Assignment;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = scn.nextLine();
		String revStr="";
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			revStr=ch+revStr;
		}
		System.out.println("Reverse string using nonrecursive : " + revStr);
		System.out.println("Reverse string using recursive : " + recursiveReverse(str));
		
	}
	public static String recursiveReverse(String str) {
		if (str.isEmpty())
			return str;
		return recursiveReverse(str.substring(1))+str.charAt(0);
	}
}
