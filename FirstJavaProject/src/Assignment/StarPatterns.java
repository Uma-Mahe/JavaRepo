package Assignment;

public class StarPatterns {
	public static void main(String[] args) {
		
		System.out.println("Pattern 1");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 2");
		for (int i=5; i>=1; i--) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 3");
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 4");
		for (int i=5; i>=1; i--) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 5");
		for (int i=1; i<10; i=i+2) {
			for (int j=10-i; j>1; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 6");
		for (int i=1; i<10; i=i+2) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=10-i; j>=1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 7");
		for (int i=1; i<10; i=i+2) {
			for (int j=10-i; j>1; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1; i<9; i=i+2) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=8-i; j>=1; j--) {
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 8");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i =1; i<=4; i++) {
			for (int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 9");
		for (int i =5; i>=1; i--) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=5-i; j++) {
				System.out.print("*");
			}		
			System.out.println();
		}
		for (int i=4; i>=1 ; i--) {
			for(int j=0; j<=4-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("Pattern 10");
		for (int i =1; i<=5; i++) {
			for (int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for (int j=0; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 11");
		for (int i=5; i>=1; i--) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 12");
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=2; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 13");
		for (int i=5; i>=1; i--) {
			for(int j=0; j<5-i; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=4; i>=1; i--) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 14");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=5; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=4; i>=1; i--) {
			for (int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for (int j=5; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern 15");
		for (int i=1; i<=5; i++) {
			for (int k=1; k<=i; k++) {
				if (k==1 || i==5 || k==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Pattern 16");
		for (int i=5; i>=1; i--) {
			for (int k=1; k<=i; k++) {
				if (k==1 || i==5 || k==i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
