package javaPractice;

public class SwapNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is after swapping " +a);
		System.out.println("b is after swapping " +b);

	}

}
