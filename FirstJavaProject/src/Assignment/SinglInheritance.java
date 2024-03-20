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
public class SinglInheritance {
	public static void main(String[] args) {
		Two obj = new Two();
		obj.oneMethod();
		obj.twoMethod();
	}
}



