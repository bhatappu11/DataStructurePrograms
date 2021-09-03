package com.bridgelabz.datastructureprograms;

import java.util.*;
import com.bridgelabz.linkedlistfiles.*;
import com.bridgelabz.linkedlistfiles.Stack;

public class BalancedParantheses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the expression");
		String expression = scanner.nextLine();
		Stack<Character> stack = new Stack();
		for(int index=0;index<expression.length();index++) {
			if(expression.charAt(index)=='(') {
				stack.push(new Node<Character>('('));
			} else if(expression.charAt(index) == ')') {
				int result = (int) stack.pop();
				if(result == -1) {
					System.out.println("Brackets not balanced");
				}
			}
		}
		if(stack.isEmpty()) {
			System.out.println("Balanced brackets");
		} else {
			System.out.println("Brackets not balanced");
		}
		scanner.close();
	}

}
