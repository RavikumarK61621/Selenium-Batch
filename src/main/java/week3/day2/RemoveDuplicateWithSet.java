package week3.day2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWithSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Input : take your name
		String name = "Ravikumar";
		
//		convert into toCharArray
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		
//		Create empty Set
		  Set<Character> myName = new LinkedHashSet<Character>();
					
//		Remove duplicate characters
		for (char i : charArray) {
				myName.add(i);
		}
		
//		Print in the same order
		 System.out.print("Name with duplicates removed:");
	        for (char i : myName) {
	            System.out.print(i);
	}

	}
	
}
