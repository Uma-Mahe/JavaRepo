package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class TwoLastMaxMinArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of array : ");
		int num = scn.nextInt();
		System.out.print("Enter the integer values : ");
		int[] arr = new int[num];
		for (int i =0; i<num; i++) {
			arr[i] = scn.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Two Minimum numbers in array : " + arr[0] + " " + arr[1]);
		System.out.println("Two Maximum numbers in array : " + arr[num-2]+ " " + arr[num-1]);
	}
}
