package com.java8.examples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
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

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
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
		employs.forEach(employ -> System.out.println(employ));
		System.out.println();

		//	Sort by Name
		System.out.println("Sort by Name");
		employs.sort((employ1, employ2) -> employ1.getName().compareTo(employ2.getName()));
		employs.forEach(employ -> System.out.println(employ));
		System.out.println();

		//	Sort by Salary
		System.out.println("Sort by Salary");
		Comparator<Employ> salaryComparator = (employ1, employ2) -> employ1.getSalary()-employ2.getSalary();
		employs.sort(salaryComparator);
		employs.forEach(employ -> System.out.println(employ));
		System.out.println();

		//	Reverse Sort by Salary
		System.out.println("Reverse Sort by Salary");
		employs.sort(salaryComparator.reversed());
		employs.forEach(employ -> System.out.println(employ));
	}
}