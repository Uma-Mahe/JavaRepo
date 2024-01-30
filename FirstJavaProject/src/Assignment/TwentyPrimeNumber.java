package Assignment;

public class TwentyPrimeNumber {
	public static void main(String[] args) {
		
		int num=2, count=0;
		System.out.println("First 20 Prime Numbers : ");
		for (int i=2; i<=num; i++) {
			int flag = 0;
			for (int j =2; j<=i/2; j++) {
				if (i%j == 0) {
					flag++;
					break;
				}
			}
			if (flag == 0) {
				System.out.print(" " + i);
				count++;
				if (count >= 20) {
					break;
				}
			}
			num++;
		}
	}
}
