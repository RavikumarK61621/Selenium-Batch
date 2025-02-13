package week1.day2;

import java.util.Scanner;

public class IsPrime extends FindTheListOfPrimeNumber {
	
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		int Input = scanner.nextInt();
//		
//		boolean flag = true;
//		for (int i = 2; i <= Input/2; i++) {
//			if(Input%i==0) {
//			flag=false;
//				break;
//			}
//			
//		}
//		if (flag) {
//			System.out.println("This is a prime numer:" +Input);
//		}		
//		else
//			System.out.println("This is not prime numer:" +Input);
		
	
		int primeNum = 100;
		IsPrime obj = new IsPrime();
		
		for (int i = 0; i <= primeNum; i++) {
			if(obj.Isprime(i))
					System.out.println("This all are Prime Number:" + i);
			else
					System.out.println("This all are not a Prime Number:" + i);
		}
	}
}



