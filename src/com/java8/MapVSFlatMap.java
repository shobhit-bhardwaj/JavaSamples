package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapVSFlatMap {
	private static class Person {
		private String name;
		private List<String> location;

		public Person(String name, List<String> location) {
			this.name = name;
			this.location = location;
		}

		public String getName() {
			return name;
		}

		public List<String> getLocation() {
			return location;
		}
	}

	public static void main(String[] args) {
		/*
		Map()	
			It processes stream of values.
			It does only mapping.
			It’s mapper function produces single value for each input value.
			It is a One-To-One mapping.
			Data Transformation : From Stream<T> to Stream<R>
			Use this method when the mapper function is producing a single value for each input value.

		flatMap()
			It processes stream of stream of values.
			It performs mapping as well as flattening.
			It’s mapper function produces multiple values for each input value.
			It is a One-To-Many mapping.
			Data Transformation : From Stream<Stream<T> to Stream<R>
			Use this method when the mapper function is producing multiple values for each input value.
		 */

		//	map Example
		List<String> strings = Arrays.asList("AA", "BB", "CC", "DD", "EE");
		strings.stream().map(value -> "map-" + value).forEach(System.out :: println);

		//	flatMap Example
		List<List<String>> lists = Arrays.asList(
				Arrays.asList("AA"), Arrays.asList("BB"), 
				Arrays.asList("CC"), Arrays.asList("DD"));
		lists.stream().flatMap(list -> list.stream().map(value -> "flatMap-" + value)).forEach(System.out :: println);
		//lists.stream().map(list -> list.stream().map(value -> "flatMap-" + value)).forEach(System.out :: println);

		List<Person> persons = Arrays.asList(
				new Person("Shobhit", Arrays.asList("Bikaner", "Pali")), 
				new Person("Rohit", Arrays.asList("Jodhpur", "Jaipur")), 
				new Person("Rajesh", Arrays.asList("Kota", "Ajmer", "Udaipur")));

		persons.stream().map(person -> person.getName()).forEach(System.out :: println);

		persons.stream().flatMap(person -> person.getLocation().stream().map(location -> location)).forEach(System.out :: println);
		Set<String> locations = persons.stream().flatMap(person -> person.getLocation().stream()).collect(Collectors.toSet());
		System.out.println("Locations - " + locations);
	}
}