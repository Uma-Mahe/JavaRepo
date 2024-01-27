package Assignment;
	
public class InfiniteLoop {
	
	public static void main(String[] args) {
		
		for ( ; ; ) {
			System.out.println("Infinite");
		}
		while (true) {
			System.out.println("Infinite");
		}
		
		do {
			System.out.println("Infinite");
		} while (true);
	
	}
}
