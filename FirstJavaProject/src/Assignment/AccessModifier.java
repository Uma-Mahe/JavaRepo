package Assignment;

class Modifier {
	void display() {
		System.out.println("Default Access Modifier");
	}
	private void display1() {
		System.out.println("Private Access Modifier");
	}
	protected void display2() {
		System.out.println("Protected Access Modifier");
	}
	public void display3() {
		System.out.println("Public Access Modifier");
	}
}
public class AccessModifier {
	public static void main(String[] args) {
		Modifier obj = new Modifier();
		
		obj.display(); // default method access in same package and different and same class
		
	 // obj.display1(); // error: display() has private access
		
		obj.display2(); // able to call protected method in different class and same package
		
		obj.display3(); // able to access public method from different class and package
	}
}
