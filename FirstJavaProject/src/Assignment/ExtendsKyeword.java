package Assignment;

class Parent {
	void test() {
		System.out.println("Parent");
	}
}
class Child extends Parent { 
	// extends keyword indicates that a child is inherited from another class
}
public class ExtendsKyeword {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.test();
		Parent parent = new Parent();
		parent.test();
	}
}
