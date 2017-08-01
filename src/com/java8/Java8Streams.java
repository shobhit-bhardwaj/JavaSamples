package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {
	public static void main(String[] args) {
		final List<String> stringList = Arrays.asList("AAA", "", "BB", "CCCC", "", "DDD", "EEEEE");
		final List<Integer> integerList = Arrays.asList(1, 2, 3, 2, 4, 3, 5);

		long count = stringList.stream().filter(s -> s.isEmpty()).count();
		System.out.println("Empty String Count - "+count);

		count = stringList.parallelStream().filter(s -> !s.isEmpty()).count();
		System.out.println("UnEmpty String Count - "+count);

		count = stringList.stream().filter(s -> s.length()==3).count();
		System.out.println("Length 3 String Count - "+count);

		List<String> filteredList = stringList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List - "+filteredList);

		String mergeString = stringList.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merge String - "+mergeString);

		List<Integer> squareList = integerList.stream().map(i -> i*i).distinct().collect(Collectors.toList());
		System.out.println("Square List - "+squareList);

		String str = stringList.stream().min(Comparator.comparing(a -> a.length())).get();
		System.out.println("Min - "+str);
		str = stringList.stream().max(Comparator.comparing(a -> a.length())).get();
		System.out.println("Max - "+str);

		String reduce = stringList.stream().reduce("Init", (acc, item) -> {System.out.println(acc+"|"+item); return acc+" "+item;});
		System.out.println("Reduce - "+reduce);

		//	LongSummaryStatistics
		//	DoubleSummaryStatistics
		IntSummaryStatistics statistics = integerList.stream().mapToInt(i -> i).summaryStatistics();
		System.out.println("Get Min - "+statistics.getMin());
		System.out.println("Get Max - "+statistics.getMax());
		System.out.println("Get Count - "+statistics.getCount());
		System.out.println("Get Sum - "+statistics.getSum());
		System.out.println("Get Average - "+statistics.getAverage());
	}
}