/*
 * Manny Peterson's Solution to Project Euler Problem #4
 * https://projecteuler.net/problem=4
 * 
 * Enjoy! :)
 * 
 */

public class Main {
	private static boolean isPalindrome(int n) {
		int workingNumber = n;
		int reversedNumber = 0;
		int tempNumber = 0;
		while (workingNumber > 0) {
			tempNumber = workingNumber % 10;
			reversedNumber = reversedNumber * 10 + tempNumber;
			workingNumber = workingNumber / 10;
		}
		if (reversedNumber == n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int biggestI = 0;
		int biggestJ = 0;
		int biggestProduct = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (Main.isPalindrome(i * j)) {
					if ((i * j) > biggestProduct) {
						biggestI = i;
						biggestJ = j;
						biggestProduct = i * j;
					}
				}
			}
		}
		System.out.format("ANSWER: %d x %d = %d\n", biggestI, biggestJ, biggestProduct);
	}
}
