package Assignment;

public class Tables {
	public static void main(String[] args) {

		System.out.println("Multiplication Table from 1 to 20 except 6, 12 and 17");
		System.out.println();

		for (int i = 1; i<=20 ; i++) {
			if (i==6 || i==12 || i==17) {
				continue;
			}
			System.out.print(i + ": ");
			for (int j = 1; j<=20; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
	}

}
