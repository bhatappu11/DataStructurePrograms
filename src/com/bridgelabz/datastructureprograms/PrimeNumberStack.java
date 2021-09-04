package com.bridgelabz.datastructureprograms;

import com.bridgelabz.linkedlistfiles.Node;
import com.bridgelabz.linkedlistfiles.Stack;
import com.bridgelabz.linkedlistfiles.PrimeNumberAndAnagram;

public class PrimeNumberStack {
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;

		Stack<Integer> stack = new Stack<Integer>();

		for (int index = start; index <= end; index++) {
			if (PrimeNumberAndAnagram.isPrime(index)) {
				for (int restValuesIndex = index + 1; restValuesIndex < end; restValuesIndex++) {
					if (PrimeNumberAndAnagram.isPrime(restValuesIndex)) {
						if (PrimeNumberAndAnagram.isAnagram(String.valueOf(index), String.valueOf(restValuesIndex))) {
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
