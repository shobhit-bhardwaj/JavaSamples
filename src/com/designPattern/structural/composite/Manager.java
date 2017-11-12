package com.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employ {
	private int id;
	private String name;
	private int salary;

	public Manager(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSalary() {
		return salary;
	}

	List<Employ> employs = new ArrayList<>();

	@Override
	public void addEmploy(Employ employ) {
		employs.add(employ);
	}

	@Override
	public Employ getEmploy(int index) {
		return employs.get(index);
	}

	@Override
	public void removeEmploy(int index) {
		employs.remove(index);
	}

	@Override
	public void print() {
		System.out.println("Manager :- "+id+" - "+name+" - "+salary);
		employs.forEach(Employ :: print);
		System.out.println();
	}
}