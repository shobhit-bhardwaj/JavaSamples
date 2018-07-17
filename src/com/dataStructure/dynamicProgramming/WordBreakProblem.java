package com.dataStructure.dynamicProgramming;

import java.util.HashSet;
import java.util.Set;

public class WordBreakProblem {
	public static boolean wordBreak(String word, Set<String> dictionary) {
		int length = word.length();
		boolean[][] T = new boolean[length][length];

		for (int l = 1; l <= length; l++) {
			for (int i = 0; i < length - l + 1; i++) {
				int j = i + l - 1;
				String str = word.substring(i, j + 1);
				if (dictionary.contains(str))
					T[i][j] = true;
				else {
					for (int k = i + 1; k <= j; k++) {
						if (T[i][k - 1] == true && T[k][j] == true) {
							T[i][j] = true;
							break;
						}
					}
				}
			}
		}

		return T[0][length - 1];
	}

	public static void main(String[] args) {
		Set<String> dictionary = new HashSet<>();
		dictionary.add("My");
		dictionary.add("Name");
		dictionary.add("Shobhit");
		dictionary.add("Bhardwaj");
		String word = "MyNameShobhitBhardwaj";

		boolean found = wordBreak(word, dictionary);
		System.out.println("Word Found in Dictionary - " + found);
	}
}