package javaPractice;

import java.util.HashMap;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class StringDuplicate {

	public static void main(String[] args) {
	 String nameString= "anjurawat";
	 char[] nameChar= nameString.toCharArray();
	 HashMap<Character, Integer> nameSet = new HashMap<Character, Integer>(); 
	 
	 
	 for(char name: nameChar) {
		 if(nameSet.containsKey(name)) {
			 nameSet.put(name, nameSet.get(name)+1);
		 }
		 else {
			 nameSet.put(name, 1);
		 }
	 }
	 System.out.println(nameSet);
	}

}
