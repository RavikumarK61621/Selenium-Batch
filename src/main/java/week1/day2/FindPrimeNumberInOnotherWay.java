package week1.day2;

public class FindPrimeNumberInOnotherWay {
	
	public static void main(String[] args) {
			
		int n = 46;
		for (int i = 2; i <= n-1; i++) {
			if ((n % i == 0)) {

				System.out.println("The number is not prime: " + n);
				break;
			}
			if (i == n-1) {
				System.out.println("The number is prime: " + n);
			}

		}
	}

}