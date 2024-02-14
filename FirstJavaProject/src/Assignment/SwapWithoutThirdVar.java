package Assignment;

public class SwapWithoutThirdVar {
	public static void main(String[] args) {
		int i =10;
		int j = 7;
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		i= i+j;
		j= i-j;
		i=i-j;
		System.out.println("i = " + i);
		System.out.println("j = " + j);		
	}

}

