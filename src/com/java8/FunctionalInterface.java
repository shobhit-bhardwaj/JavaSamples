package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterface {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		for(int i=1; i<=10; i++)
			intList.add(i);
		evalInteger(intList, x-> true);
		evalInteger(intList, x-> x%2==0);

		List<String> stringList = Arrays.asList("A", "B", "C", "D", "E");
		evalString(stringList, x -> "A".equals(x));
		Predicate<String> predicate = (x) -> {String s = x.toLowerCase(); return s.equals("b"); };
		evalString(stringList, predicate);
	}

	public static void evalInteger(List<Integer> list, Predicate<Integer> predicate) {
		for(Integer i : list) {
			if(predicate.test(i)) {
				System.out.println(i);
			}
		}
	}

	public static void evalString(List<String> list, Predicate<String> predicate) {
		for(String str : list) {
			if(predicate.test(str)) {
				System.out.println(str);
			}
		}
	}
}