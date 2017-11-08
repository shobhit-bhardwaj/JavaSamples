package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Person {
	private int id;
	private String name;

	public Person() {
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Person(Person person) {
		System.out.println("Constructor - "+person.id+" - "+person.name);
	}

	public void printNonStatic(Person person) {
		System.out.println("printNonStatic - "+person.id+" - "+person.name);
	}

	public static void printStatic(Person person) {
		System.out.println("printStatic - "+person.id+" - "+person.name);
	}

	@Override
	public String toString() {
		return "toString - "+this.id+" - "+this.name;
	}
}

public class MethodReferences {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "AAA"));
		persons.add(new Person(2, "BBB"));
		persons.add(new Person(3, "CCC"));

		persons.forEach(System.out :: println);

		persons.forEach(Person :: new);
		persons.forEach(new Person() :: printNonStatic);
		persons.forEach(Person :: printStatic);

		persons.forEach(person -> {System.out.println("Lambda Expression - "+person.getId()+" - "+person.getName()); });
		persons.forEach(new Consumer<Person>() {
			@Override
			public void accept(Person person) {
				System.out.println("Consumer Impl - "+person.getId()+" - "+person.getName());
			}
		});
	}
}