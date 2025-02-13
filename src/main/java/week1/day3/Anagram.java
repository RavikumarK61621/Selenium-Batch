package week1.day3;

import java.util.Arrays;
import java.util.Iterator;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text1 = "stops";
		String text2 = "potss";
		
		int length = text1.length();
		System.out.println("text1 length :" +length);
		
		int length2 = text2.length();
		System.out.println("texte length :" +length2);
		
		if(length==length2) {
			System.out.println("Continue to next step");
			}
		else
			System.out.println("Lengths mismatch");
		
		char[] charArray = text1.toCharArray(); 
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			
		char[] charArray2 = text2.toCharArray();
		for (int j = 0; j < charArray2.length; j++) {
			System.out.println(charArray2[i]);
			
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
			
			if(charArray[i]==charArray[i]) {
			System.out.println("The given strings are Anagram");
			}
		else 
			System.out.println("The given strings are not an Anagram");
		}
		}
	}
  
}
