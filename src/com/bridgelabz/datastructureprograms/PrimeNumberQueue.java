package com.bridgelabz.datastructureprograms;

import java.util.Arrays;

import com.bridgelabz.linkedlistfiles.Node;
import com.bridgelabz.linkedlistfiles.Queue;
import com.bridgelabz.linkedlistfiles.PrimeNumberAndAnagram;

public class PrimeNumberQueue {
	
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
		Queue<Integer> queue = new Queue<Integer>();

		for (int index = start; index <= end; index++) {
			if (PrimeNumberAndAnagram.isPrime(index)) {
				for (int restOfValues = index + 1; restOfValues < end; restOfValues++) {
					if (PrimeNumberAndAnagram.isPrime(restOfValues)) {
						if (PrimeNumberAndAnagram.isAnagram(String.valueOf(index), String.valueOf(restOfValues))) {
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
