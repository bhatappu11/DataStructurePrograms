package com.bridgelabz.datastructureprograms;

import com.bridgelabz.linkedlistfiles.SortedLinkedList;
import com.bridgelabz.linkedlistfiles.Node;
import java.util.*;

public class HashingFunctionToSearch {

	public static void main(String[] args) {
		SortedLinkedList<Integer>[] linkedLists = new SortedLinkedList[11];
		for(int listsIndex=0;listsIndex<11;listsIndex++) {
			linkedLists[listsIndex] = new SortedLinkedList<Integer>();
		}
		String input = "77 44 55 26 93 17 31 20 54";
		String numberList[] = input.split(" ");
		for(int i=0;i<numberList.length;i++) {
			int number = Integer.parseInt(numberList[i]);
			int index = getIndex(number);
			linkedLists[index].add(new Node(number));
		}
		
		printList(linkedLists);
		
		System.out.println("Enter number to search:");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();//Integer.parseInt(scanner.nextLine());
		int keyIndex = getIndex(key);
		if(linkedLists[keyIndex].search(key)!=null) {
			linkedLists[keyIndex].delete(key);
		} else {
			linkedLists[keyIndex].add(new Node(key));
			linkedLists[keyIndex].printNodes();
		}
		printList(linkedLists);
		scanner.close();

	}
	public static int getIndex(int number) {
		return number%11;
	}

	private static void printList(SortedLinkedList<Integer>[] linkedLists) {
		for(int i=0;i<11;i++) {
			System.out.print(i+" --> ");
			linkedLists[i].printNodes();
			System.out.println();
		}
		
	}

}
