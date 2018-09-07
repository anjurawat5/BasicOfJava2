package javaPractice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {
		String[] arrays = {"Anju" ,  "Rawat", "Pradeep", "Singh"}; 
		
		ArrayList<String> arrayList = new ArrayList<String>();
		Collections.addAll(arrayList, arrays);
		
		for(String copiedString: arrayList) {
			System.out.println(copiedString);
		}
		
		java.util.List<String> al = Arrays.asList(arrays);
		System.out.println(al);
		
		
	}

}
