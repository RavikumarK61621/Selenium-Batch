package week1.day2;

import java.util.Iterator;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Input 8
		//0, 1, 1, 2, 3, 5, 8, and 13.
		Scanner scanner = new Scanner(System.in);
		int Input = scanner.nextInt();
		
		int start = 0;
		int current = 1;
		int next;
		
		for (int i = 1; i < Input; i++) {
			next=start+current;
			start=current;
			current=next;
			System.out.println(next);
			
		}
	
	}
}
