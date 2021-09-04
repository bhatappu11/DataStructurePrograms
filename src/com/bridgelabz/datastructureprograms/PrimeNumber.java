package com.bridgelabz.datastructureprograms;

public class PrimeNumber {

	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int startIndex = 0;
		int endIndex = 100;

		int[][] primeNumber = new int[10][];

		int rowIndex = 0, columnIndex = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = startIndex; j <= endIndex; j++) {
				if (isPrime(j)) {
					rowIndex++;
				}
			}
			primeNumber[i] = new int[rowIndex];
			startIndex = endIndex + 1;
			endIndex += 100;
			rowIndex = 0;

		}
		startIndex = 0;
		endIndex = 100;
		
		for (int i = 0; i < 10; i++) {
			for (int j = startIndex; j <= endIndex; j++) {

				if (isPrime(j)) {
					primeNumber[i][columnIndex] = j;
					columnIndex++;
				}

			}
			startIndex = endIndex + 1;
			endIndex += 100;
			columnIndex = 0;
		}

		for (int i = 0; i < primeNumber.length; i++) {
			for (int j = 0; j < primeNumber[i].length; j++)
				System.out.print(primeNumber[i][j] + " ");
			System.out.println();
		}
	}
}

