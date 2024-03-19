package Assignment;

import java.util.Scanner;

public class PenultimateWordofSentence {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str= scn.nextLine();
		String[] words = str.split(" ");
		System.out.println("Penulmate Word of Sentence : " + words[words.length-2]);
	}
}
