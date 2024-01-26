import java.util.Scanner;

public class PrimeNumberOrNot {
	
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter an integer : ");
		int value = scn.nextInt();
		int flag = 0;
		if (value == 0 || value == 1) {
			System.out.println("The integer " + value + " is not Prime Number");	
		}
		else {
		for (int i=2 ; i<=value/2 ; i++) {
			
			int reminder = value % i ;
			System.out.println(i);
			
			if (reminder == 0 ) {
				System.out.println("The integer " + value + " is not Prime Number" );
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("The integer " + value + " is Prime Number");
		}
		}
	}

}
