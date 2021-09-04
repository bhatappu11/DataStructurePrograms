package com.bridgelabz.datastructureprograms;

import com.bridgelabz.linkedlistfiles.*;
import java.util.*;

public class PalindromeChecker{
	private static boolean isPalindrome(char[] charArray) {
		  DequeLinkedList<Character> deque = new DequeLinkedList<Character>();
		  for(char ch : charArray) {
		   deque.insertRear(new Node<Character>(ch));
		  }
		  while(deque.size()!=0 && deque.size()!=1) {
			  Character front=deque.removeFront();
			  Character rear=deque.removeRear();
			  if(front.equals(rear)) {
				  continue;
			  }
			  else
				  return false;
		  }
		  return true;
		 }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String");
		String string = scanner.nextLine();
		char[] charArray = string.toCharArray();
		  
		System.out.println("Is the String "+string+" a palindrome : "+ isPalindrome(charArray));
		scanner.close();
	}
}