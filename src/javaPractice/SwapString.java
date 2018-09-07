package javaPractice;

public class SwapString {

	public static void main(String[] args) {
		String name1 = "anju"; 
		String name2 = "rawat";
		
		System.out.println("String before swap name1: " +name1 + " and name2: " +name2);
		name1= name1+name2;
		name2= name1.substring(0, name1.length()-name2.length());
		name1 = name1.substring(name2.length());
		System.out.println("String before swap name1: " +name1 + " and name2: " +name2);		
	}

}
