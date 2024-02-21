package Assignment;

import java.util.Scanner;

public class ConvertStringCase {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = scn.nextLine();
		StringBuffer strBuffer = new StringBuffer(str.length());
		
		for(int i=0; i<str.length(); i++) {
			char c= str.charAt(i);
			System.out.println(c);
			if (Character.isUpperCase(c)) {
				c=Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)){
				c=Character.toUpperCase(c);
			}
			strBuffer.append(c);
		}
		
		System.out.println(strBuffer.toString());
		scn.close();
	}
}
