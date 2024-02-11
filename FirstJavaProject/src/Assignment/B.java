package Assignment;

class A10 {
	public int add(int i, int j) {
		return i+j;
	}
}
class B{
	public static void main(String[] args) {
		A10 a1 =new A10();
		a1.add(a1.add(10,20), a1.add(30,40));
	}
}
// we can call method as argument of a method and got executed 