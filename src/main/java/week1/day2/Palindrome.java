package week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String Input = scanner.nextLine();
		
		boolean flag = false;
		int length = Input.length()-1;
		System.out.println(length);
		
		for (int i = 0; i < length; i++) {
			if(Input.charAt(i)!=Input.charAt(length-i)) {
			flag=true;	
			break;
		}
		}
		
	if (flag) {
		System.out.println("Not a Palindrome");
	}
		else {
			System.out.println("Palindrome");
		}
			
	}
}	
