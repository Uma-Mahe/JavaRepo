package Assignment;

public class DiffBetweenEqualsString {
	public static void main(String[] args) {
		String str1 = new String("Session");
		String str2 =  new String("Session");
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));		
	}
}
//String equals()method compares two string and returns true if all characters match both strings, else returns false
//The == operator compares the reference or memory location of objects in heap.