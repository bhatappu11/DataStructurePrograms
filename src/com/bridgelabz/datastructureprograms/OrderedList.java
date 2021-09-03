package com.bridgelabz.datastructureprograms;

import java.util.*;
import com.bridgelabz.linkedlistfiles.*;

public class OrderedList {

	public static void main(String[] args) {
		SortedLinkedList<Integer> integerList = new SortedLinkedList<>();
		String numbers = "12 34 45 1 30 55 6 15";
		String[] numList = numbers.split(" ");
		for(String number : numList) {
			integerList.add(new Node<Integer>(Integer.parseInt(number)));
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to search");
		int number = scanner.nextInt();
		if(integerList.search(number)==null) {
			integerList.add(new Node<Integer>(number));
		} else {
			integerList.delete(number);
		}
		System.out.println();
		integerList.printNodes();
		
	}

}
