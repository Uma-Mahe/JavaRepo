package Assignment;

public class DocumentationComment {
	public static void main(String[] args) {
		CommentClass comm = new CommentClass();
		int a=10;
		int b=20;
		comm.commentMethod(a,b);
		
	}
}
class CommentClass {
	/**
	 * This method is learn documentation comment in java. <BR/> This line I am writing for HTML presentation.
	 * @param i
	 * @param j
	 */
	void commentMethod(int i, int j) {
		int k=i+j;
		System.out.println(k);
	}
}
