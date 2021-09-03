package com.bridgelabz.datastructureprograms;

import java.util.*;

import com.bridgelabz.linkedlistfiles.*;
import com.bridgelabz.linkedlistfiles.LinkedList;

public class UnOrderedList {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = "I tried writing with my left hand";
		String[] words = sentence.toLowerCase().split(" ");
		LinkedList<String> wordList = new LinkedList<>();
		for(String word: words) {
			wordList.append(new Node<String>(word));
		}
		System.out.println("Enter the word to be searched");
		String word = scanner.next();
		if(wordList.search(word)==null) {
			wordList.append(new Node(word));
		} else {
			wordList.delete(word);
		}
		wordList.printNodes();
		scanner.close();
	}

}
