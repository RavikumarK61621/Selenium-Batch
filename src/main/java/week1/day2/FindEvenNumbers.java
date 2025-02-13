package week1.day2;

import java.util.Iterator;
import java.util.Scanner;

public class FindEvenNumbers {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			System.out.println(num);
			
			for (int i = 1; i <=num; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}	}
			
		}
	

