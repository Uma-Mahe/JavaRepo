package Assignment;

public class MethodOverloading {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int j = cal.sum(4,5);
		int i = Calculator.sum(20,34.6d);
		int k = Calculator.sum(7, 8, 9);
		float z = Calculator.sum(4,3.2f,234567);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(z);
	}
}
class Calculator{
	int sum(int a, int b) {
		return a+b;
	}
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	static int sum(int a, double b) {
		return a+(int)b;
	}
	static float sum(int a, float b, long c) {
		return (float)a+b+(float)c;
	}
}