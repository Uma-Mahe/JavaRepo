package Assignment;

public class MethodWithIntReturnType {
	public static void main(String[] args) {
		MethodWithIntReturnType m1 = new MethodWithIntReturnType();
		int sum = m1.add(20,30);
		System.out.println(sum);
		int sum1 = MethodWithIntReturnType.add1(40,40);
		System.out.println(sum1);
	
	}
	int add(int i, int j) {
		int k=i+j;
		return k;
	}
	static int add1(int i, int j) {
		 int k=i+j;
		 return k;
	}

}
