package com.java8.examples;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
	static class Employ {
		private int id;
		private String name;
		private int salary;

		public Employ() {
		}

		public Employ(int id, String name, int salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public int getSalary() {
			return salary;
		}

		@Override
		public String toString() {
			return "Employ [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
	}

	public static void main(String[] args) {
		List<Employ> employs = new ArrayList<>();
		employs.add(new Employ(101, "Shobhit", 17000));
		employs.add(new Employ(102, "Ravi", 12000));
		employs.add(new Employ(103, "Rajesh", 15000));

		//	Create a Map of Id and Name
		Map<Integer, String> employMap = employs.stream()
				.collect(Collectors.toMap(Employ::getId, Employ::getName));
		System.out.println("Employ Map (Id and Name) - "+employMap);
		System.out.println();

		//	Create a Map of Id and Name (Second Approach)
		employMap = employs.stream()
				.collect(Collectors.toMap(employ -> employ.getId(), employ -> employ.getName()));
		System.out.println("Employ Map (Second Approach) - "+employMap);
		System.out.println();

		employs.add(new Employ(101, "Shobhit Bhardwaj", 22000));
		employs.add(new Employ(102, "Ravi Sharma", 18000));

		//	Create Map of Duplicate Values (Assign Old Value)
		employMap = employs.stream()
				.collect(Collectors.toMap(Employ::getId, Employ::getName, (oldValue, newValue) -> oldValue));
		System.out.println("Employ Map of Duplicate Values - "+employMap);
		System.out.println();

		//	Create Sorted Map of Duplicate Values (Assign New Value)
		employMap = employs.stream()
				.collect(Collectors.toMap(Employ::getId, Employ::getName, (oldValue, newValue) -> newValue, LinkedHashMap::new));
		System.out.println("Sorted Employ Map of Duplicate Values - "+employMap);
	}
}