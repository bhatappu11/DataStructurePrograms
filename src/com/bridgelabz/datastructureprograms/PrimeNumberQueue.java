package com.bridgelabz.datastructureprograms;

import java.util.Arrays;

import com.bridgelabz.linkedlistfiles.Node;
import com.bridgelabz.linkedlistfiles.Queue;

public class PrimeNumberQueue {
	public static boolean isPrime(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isAnagram(String word1, String word2) {
		char[] wordOneArray = word1.toCharArray();
		char[] wordTwoArray = word2.toCharArray();
		Arrays.sort(wordOneArray);
		Arrays.sort(wordTwoArray);
		int compareResult = Arrays.compare(wordOneArray, wordTwoArray);

		if(compareResult == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
		Queue<Integer> queue = new Queue<Integer>();

		for (int index = start; index <= end; index++) {
			if (isPrime(index)) {
				for (int restOfValues = index + 1; restOfValues < end; restOfValues++) {
					if (isPrime(restOfValues)) {
						if (isAnagram(String.valueOf(index), String.valueOf(restOfValues))) {
							queue.enqueue(new Node<Integer>(index));
							queue.enqueue(new Node<Integer>(restOfValues));

						}
					}
				}

			}

		}
		queue.printQueue();

	}

}
