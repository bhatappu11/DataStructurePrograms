package com.bridgelabz.datastructureprograms;

import java.util.Arrays;

import com.bridgelabz.linkedlistfiles.Node;
import com.bridgelabz.linkedlistfiles.Stack;

public class PrimeNumberStack {
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

		Stack<Integer> stack = new Stack<Integer>();

		for (int index = start; index <= end; index++) {
			if (isPrime(index)) {
				for (int restValuesIndex = index + 1; restValuesIndex < end; restValuesIndex++) {
					if (isPrime(restValuesIndex)) {
						if (isAnagram(String.valueOf(index), String.valueOf(restValuesIndex))) {
							stack.push(new Node<Integer>(index));
							stack.push(new Node<Integer>(restValuesIndex));

						}
					}
				}

			}

		}
		System.out.println("printing anagrams in reverse order");
		int tempSize = stack.size();
		for (int i = 0; i < tempSize; i++) {
			System.out.print(stack.peek() + " ");
			if (!stack.isEmpty()) {
				stack.pop();
			}
		}


	}

}
