package Assignment;
class P1 { //Multilevel Inheritance
	public void oneMethod() {
		System.out.println("Method in class Parent");
	}
}
class Child1 extends P1 {
	public void twoMethod() {
		System.out.println("Method in class Child1");
	}
}
class Child2 extends Child1 {
	public void threeMethod() {
		System.out.println("Method in class Child2");
	}
}
public class MultilevelInheritance {
	public static void main(String[] args) {
		Child2 obj = new Child2();
		obj.oneMethod();
		obj.twoMethod();
		obj.threeMethod();
	}

}
