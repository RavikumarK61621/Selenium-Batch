package week1.day2;

import java.util.Scanner;

public class FindTheListOfPrimeNumber {

	public boolean Isprime(int Input) {
		boolean prime = true;

		if (Input == 0 || Input == 1) {
			return true;
		}
		for (int i = 2; i <= Input / 2; i++) {
			if (Input % i == 0) {
				prime = false;
				break;
			}
		}

		return prime;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the input");

		int uInput = scanner.nextInt();

		FindTheListOfPrimeNumber obj = new FindTheListOfPrimeNumber();

		boolean Output = obj.Isprime(uInput);

		String primeOrNot = Output ? "Prime" : "Not a Prime";

		System.out.println("The input number is :" + primeOrNot);

	}
}
