package Assignment;

public class StaticNonStaticMethod {
	public static void main(String[] args) {
		Mark avg = new Mark();
		int mark = avg.markAverage(89,78,67);
		System.out.println(mark);
		int count = Mark.count(10);
		System.out.println(count);
	}
}
class Mark {
	int markAverage(int a, int b, int c) {
		return a+b+c;
	}
	static int count(int i) {
		return i+=1;
	}

}