package com.dataStructure.string;

import java.util.StringJoiner;

public class ExpandStringInGivenRange {
	public static void main(String[] args) {
		String input = "1-5, 8, 11-14, 18, 20, 26-29";

		StringJoiner joiner = new StringJoiner(", ");
		String[] inputArray = input.split(",");
		for(String value : inputArray) {
			String[] range = value.trim().split("-");
			if(range.length == 1)
				joiner.add(range[0]);
			else {
				int start = Integer.parseInt(range[0]);
				int end = Integer.parseInt(range[1]);
				for(int i=start; i<=end; i++)
					joiner.add(String.valueOf(i));
			}
		}

		System.out.println(joiner);
	}
}