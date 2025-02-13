package week1.day2;

import java.util.Scanner;

public class FindOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int Input = scanner.nextInt();
		System.out.println(Input);
		
		for (int i = 1; i <= Input; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
				
			
			
		}
		
	}
}


