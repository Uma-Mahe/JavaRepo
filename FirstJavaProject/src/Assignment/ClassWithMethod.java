package Assignment;

public class ClassWithMethod {
	public static void main(String[] args) {
		First obj1 = new First();
		int squareValue = obj1.firstCalculation(5);
		System.out.println(squareValue);
		SecondClass obj2 = new SecondClass();
		System.out.println(obj2.car(250));
	}

}
class First {
	int firstCalculation(int value) {
		int square = value*value;
		return square; 
	}
}
class SecondClass {
	int car(int count) {
		count = count + 1;
		return count;
	}
}
