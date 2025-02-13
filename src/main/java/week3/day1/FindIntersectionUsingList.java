package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {3, 2, 11, 4, 6, 7};
		int [] b= {1, 2, 8, 4, 9, 7};
		
		List<Integer> aNew = new ArrayList<Integer>();
		List<Integer> bNew = new ArrayList<Integer>();
		
		for (int num1 : a) {
			aNew.add(num1);
		
		}
		for (int num2 : b) {
			bNew.add(num2);
		}
		
		 for (int num : aNew) {
	            if (bNew.contains(num)) {
	                System.out.println(num);
		
    	}
     }
   }
}