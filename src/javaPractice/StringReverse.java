package javaPractice;

public class StringReverse {

	public static void main(String[] args) {

		String name= "Anju";
		char[] charName= name.toCharArray();
		int left;
		int right=charName.length-1;
		for( left=0;left<right; left++, right--) {
			char temp=charName[left];
			charName[left]=charName[right];
			charName[right]= temp;	
		}
		for(char printReverse:charName) {
			System.out.println(printReverse);
		}
		
		//another way
		
		for(int i=charName.length-1;i>=0;i--) {
			System.out.println(charName[i]);
		}
	}

}
