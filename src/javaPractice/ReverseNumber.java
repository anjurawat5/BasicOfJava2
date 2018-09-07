package javaPractice;

public class ReverseNumber {

	public static void main(String[] args) {
		int number=1234;
		int reminder;
		while(number>0) {
			reminder= number%10;
			System.out.print(reminder);
			number=number/10;
		}
	}

}
