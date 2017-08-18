package com.collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<>();
		set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		set.add("DDD");
		set.add("EEE");

		//	Decending Set and Decending Iterator
		//set = set.descendingSet();
		Iterator<String> iterator = set.descendingIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		//	Head Set
		NavigableSet<String> headSet = set.headSet("CCC", false);
		System.out.println(headSet);

		//	Tail Set
		NavigableSet<String> tailSet = set.tailSet("CCC", true);
		System.out.println(tailSet);

		//	Sub Set
		NavigableSet<String> subSet = set.subSet("CCC", true, "DDD", true);
		System.out.println(subSet);

		//	Ceiling & Floor
		String ceiling = set.ceiling("CD");
		String floor = set.floor("CD");
		System.out.println(ceiling+" - "+floor);

		//	Higher & Lower
		String high = set.higher("DDD");
		String low = set.lower("DDD");
		System.out.println(high+" - "+low);

		//	pollFirst and pollLast
		//set.clear();
		String pollFirst = set.pollFirst();
		String pollLast = set.pollLast();
		System.out.println(pollFirst+" - "+pollLast);
	}
}