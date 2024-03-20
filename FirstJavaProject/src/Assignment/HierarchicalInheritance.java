package Assignment;
class Parent1 { //Hierarchical Inheritance
	public void oneMethod() {
		System.out.println("Method in class A");
	}
}
class C1 extends Parent1 {
	public void twoMethod() {
		System.out.println("Method in class B");
	}
}
class C2 extends Parent1 {
	public void threeMethod() {
		System.out.println("Method in class C");
	}
}
class C3 extends Parent1 {
	public void fourMethod() {
		System.out.println("Method in class D");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.twoMethod();
		c1.oneMethod();
		
		C2 c2 = new C2();
		c2.threeMethod();
		c2.oneMethod();
		
		C3 c3 = new C3();
		c3.fourMethod();
		c3.oneMethod();			
	}
}
