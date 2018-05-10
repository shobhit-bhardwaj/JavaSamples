package com.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupByExample {
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
		//	Group By String Values
		List<String> names = Arrays.asList("Shobhit", "Ravi", "Shobhit", "Rajesh", "Shobhit", "Ravi", "Rajesh", "Shobhit", "Ravi");
		Map<String, Long> nameResults = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Group By List of Strings - "+nameResults);
		System.out.println();

		//	Group By List of Objects
		List<Employ> employs = Arrays.asList(
				new Employ(101, "Shobhit", 17000),
				new Employ(102, "Ravi", 12000),
				new Employ(103, "Rajesh", 15000),
				new Employ(101, "Shobhit", 17000),
				new Employ(102, "Ravi", 12000),
				new Employ(101, "Shobhit", 17000),
				new Employ(103, "Rajesh", 15000));
		nameResults = employs.stream().
				collect(Collectors.groupingBy(Employ::getName, Collectors.counting()));
		System.out.println("Group By List of Objects - "+nameResults);
		System.out.println();

		//	Group By List of Objects (on Basis of Id)
		Map<Integer, List<Employ>> employMap = employs.stream()
				.collect(Collectors.groupingBy(Employ::getId));
		System.out.println("Group By List of Objects (on Basis of Id) - "+employMap);
		System.out.println();

		//	Group By List of Objects, Sum Salary
		Map<String, Integer> sumSalaryResult = employs.stream()
				.collect(Collectors.groupingBy(Employ::getName, Collectors.summingInt(Employ::getSalary)));
		System.out.println("Group By List of Objects (Sum Salary) - "+sumSalaryResult);
	}
}