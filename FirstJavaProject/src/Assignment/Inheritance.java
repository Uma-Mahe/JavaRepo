package Assignment;
class One { //Single Inheritance
	public void oneMethod() {
		System.out.println("Method in class One");
	}
}
class Two extends One {
	public void twoMethod() {
		System.out.println("Method is class Two");
	}
}
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
public class Inheritance {
	public static void main(String[] args) {
		Two obj = new Two(); // Single Inheritance
		obj.oneMethod();
		obj.twoMethod();
		
		Child2 obj1 = new Child2(); // Multilevel Inheritance
		obj1.oneMethod();
		obj1.twoMethod();
		obj1.threeMethod();
		
		C1 c1 = new C1(); // Hierarchical Inheritance
		c1.twoMethod();
		c1.oneMethod();
		
		C2 c2 = new C2();
		c2.threeMethod();
		c2.oneMethod();
		
		C3 c3 = new C3();
		c3.fourMethod();
		c3.oneMethod();	
	} // Java doesn't support Multiple Inheritance
}



