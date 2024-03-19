package Assignment;

import java.util.Scanner;

public class PermutationString {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = scn.nextLine();
		int n = str.length();
		permute(str, 0, n-1);
	}
	public static void permute(String str, int l, int r) {
		if (l==r)
			System.out.println(str);
		else {
			for(int i=l; i<=r; i++) {
				str=swap(str, l, i);
				permute(str, l+1,r);
				str=swap(str, l, i);
			}
		}
	}
	public static String swap(String str, int i, int j) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
	}
}
