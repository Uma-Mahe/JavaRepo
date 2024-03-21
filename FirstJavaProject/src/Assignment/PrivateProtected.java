package Assignment;
class Pp {
	//private modifier in parent class
	//private modifier cannot be used in parent class
	
	//private void m1() {
	//	System.out.println("Private class");
	//}
	
	// protected modifier in parent class
	// protected modifier can be access inside the same package and not in other package 
	
	protected void m2() { 
		System.out.println("Protected method");
	}
}
public class PrivateProtected {
	public static void main(String[] args) {
		Pp a = new Pp();
		//a.m1(); // compiler error will occur
		a.m2(); // executed and call the method with protected modifier
	}
}
