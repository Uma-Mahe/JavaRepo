package Assignment;

public class MethodWithoutParameters {
	public static void main(String[] args) {
		Param p = new Param();
		int value = p.calculator();
		int add = Param.count();
		System.out.println(add);
		System.out.println(value);	
	}
}
class Param{
	static int count() {
		int add=+1;
		return add;
	}
	int calculator() {
		int a=5+7;
		return a;
	}
}
