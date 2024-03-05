package Assignment;

import java.util.Scanner;

public class ArrayMaxMinNumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of array : ");
		int num = scn.nextInt();
		System.out.print("Enter the values with space : ");
		int[] arr = new int[num];
		for (int i =0; i<num; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println("Maximum Number in Array : "+ maxArray(arr,num));
		System.out.println("Minimum Number in Array : "+ minArray(arr,num));
	}
	
	static int maxArray(int arr[], int n)
	{
		int check = arr[0];
		for (int i =0; i<n; i++) {
			check=Math.max(check, arr[i]);
		}
		return check;
	}
	static int minArray(int arr[], int n)
	{
		int check = arr[0];
		for (int i =0; i<n; i++) {
			check=Math.min(check, arr[i]);
		}
		return check;
	}
}
