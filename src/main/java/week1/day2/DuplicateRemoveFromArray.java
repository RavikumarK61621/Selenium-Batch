package week1.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRemoveFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set<Integer> s = new HashSet<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5));
//		System.out.println(s);

		int value[] = {1,1,2,2,3,3,4,5};
		for (int i = 0; i < value.length; i++) {
			for (int j = i+1; j < value.length; j++) {
				if(value[i]==value[j]){
				System.out.println("values:" +value[j]);
//				
//			}
//			
//			}
//		}
//		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
//		int length = num.length;
//		
//		for(int j=0; j<num.length-1;j++)
//		{
//			if(num[j]==num[j+1])
//			{
//				System.out.println("Duplicate values are"+num[j]);
//			}
//		}
//		

		// TODO Auto-generated method stub
//		int n = 7;
//		for (int i = 2; i <= n-1; i++) {
//			if (n % i == 0) {	
//				
//				System.out.println("This is not a Prime Number " + n);
//				break;
//			}
//			if (i == n-1) {
//				System.out.println("This is Prime Number " + n);
//			}
//		}
		
//	int Input = 18;
//
//		for(int i = 2; i <= Input-1; i++){
//			if(Input%i==0){
//				System.out.println("This is not a Prime Number " + Input);
//			break;
//		}
//
//		if(i==Input-1){
//		System.out.println("prime");
//		}
			
		}
	}
}
}}