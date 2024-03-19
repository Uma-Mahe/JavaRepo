package Assignment;

public class StringInterning {
	public static void main(String[] args) {
		
		String s1= new String("JAVA");
		String s2= s1.intern();
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2));  //true
		String s3="JAVA";
		System.out.println(s2==s3);  //false
	}
}
