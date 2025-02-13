package week1.day2;

import java.util.Iterator;

public class LearnConditionStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int age = 15;
		if (age>10) {
			System.out.println(" The number is Lesser");  // If
		}
		
		
		if (age>18) {
		System.out.println("licence can apply");           // if else
		}else
			System.out.println("licence can't apply");
		
		
		
		int car = 250000;
		if (car<100000) {
			System.out.println("price is high");            // else if
		}
		else if  (car<200000) {
			System.out.println("price is not match");
	}

		else if  (car<300000) {
			System.out.println("price is match");
	
			for (int i = 10; i < 2; i++) {
				
				int [] num = {1,2,3,4,5,6,7,87,9,0};
				int length = num.length;
				System.out.println(length);
				
		}
		
		}
	}

}
