package com.javaNewFeatures.java8.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	private static class Employ {
		private int id;
		private String name;
		private int salary;

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
		List<Employ> employs = Arrays.asList(
				new Employ(102, "Shobhit", 17000),
				new Employ(101, "Ravi", 14000),
				new Employ(103, "Rajesh", 15000));

		//	Sort by Id
		System.out.println("Sort by Id");
		employs.sort((employ1, employ2) -> employ1.getId()-employ2.getId());
		employs.forEach(System.out :: println);

		System.out.println();

		//	Sort by Name
		System.out.println("Sort by Name");
		employs.sort((employ1, employ2) -> employ1.getName().compareTo(employ2.getName()));
		employs.forEach(System.out :: println);

		System.out.println();

		//	Salary Comparator
		Comparator<Employ> salaryComparator = (employ1, employ2) -> employ1.getSalary()-employ2.getSalary();

		//	Sort by Salary
		System.out.println("Sort by Salary");
		employs.sort(salaryComparator);
		employs.forEach(System.out :: println);

		System.out.println();

		//	Reverse Sort by Salary
		System.out.println("Reverse Sort by Salary");
		employs.sort(salaryComparator.reversed());
		employs.forEach(System.out :: println);
	}
}