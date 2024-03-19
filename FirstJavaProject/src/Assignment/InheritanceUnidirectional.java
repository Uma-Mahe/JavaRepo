package Assignment;

public class InheritanceUnidirectional {
	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.eat();
		m.birth();
	}
}
class Animal {
	public void eat() {
		System.out.println("Animalm is eating");
	}
}
class Mammal extends Animal {
	public void birth() {
		System.out.println("Mammal give birth");
	}
}
// Example for inheritance unidirectional -- Is-A Relationship
