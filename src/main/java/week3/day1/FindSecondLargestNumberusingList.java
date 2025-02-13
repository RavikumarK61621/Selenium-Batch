package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindSecondLargestNumberusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {3, 2, 11, 4, 6, 7};
		
		List<Integer> ABC = new ArrayList<Integer>();
		
		for (int num : a) {
			ABC.add(num);
			}
		ABC.sort(null);	
		ABC.reversed();
		System.out.println(ABC);
		
		int varsize = ABC.size();
		System.out.println(ABC.get(varsize-2));
		}
	

}
