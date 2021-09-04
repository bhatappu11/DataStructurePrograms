package com.bridgelabz.datastructureprograms;

import com.bridgelabz.linkedlistfiles.*;

public class PalindromeChecker {

	public static void main(String[] args) {
		String string = "racecar";
		String removedFront = "";
		String removedRear = "";
		DequeLinkedList<Character> deque = new DequeLinkedList<Character>();
		for (int i = 0; i < string.length(); i++) {
			deque.insertRear(new Node<Character>(string.charAt(i)));
		}
		for (int i = 0; i < string.length(); i++) {
			removedRear += deque.getRear().getKey();
			deque.removeRear();
		}
		for (int i = 0; i < string.length(); i++) {
			deque.insertRear(new Node<Character>(string.charAt(i)));
		}
		for (int i = 0; i < string.length(); i++) {
			removedFront += deque.getFront().getKey();
			deque.removeFront();
		}
		System.out.println("Rear delete : " + removedRear);
		System.out.println("Front delete : " + removedFront);
		if (removedRear.equals(removedFront)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
