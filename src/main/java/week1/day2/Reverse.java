package week1.day2;

import java.util.Iterator;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentance = "A word is a maximal substring consisting of non-space characters only";
		
		String reverse = "";
		
		for (int i=sentance.length()-1; i>=0; i--) {
			reverse += sentance.charAt(i);
				
			}
		System.out.println(reverse);	
	}
	

}

//        
//        int n= 10;
//        
//        //find the prime number
//        
//        for(int i=0; i<args.length; i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//            
//        }
//    }
//        }
//        