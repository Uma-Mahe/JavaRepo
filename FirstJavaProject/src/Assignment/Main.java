package Assignment;
class Test {
	protected int x, y;
}
public class Main {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.x +" "+ t.y); // Prints 0 0
	}
}
