package com.bridgelabz.datastructureprograms;

import java.util.*;
import com.bridgelabz.linkedlistfiles.*;
import com.bridgelabz.linkedlistfiles.Stack;

public class BalancedParantheses {

	private static boolean parenthesesChecker(char[] expression) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch : expression) {
			if(ch == '(' ) {
				stack.push(new Node<Character>(ch));
			}
			else if(ch == ')') {
				if(stack.isEmpty()) return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Expression");
		String inputExpression = sc.nextLine();
		char[] expression = inputExpression.toCharArray();
		
		System.out.println("Is the expression balanced? : "+ parenthesesChecker(expression));
		sc.close();
	}

}
