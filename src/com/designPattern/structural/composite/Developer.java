package com.designPattern.structural.composite;

public class Developer implements Employ {
	private int id;
	private String name;
	private int salary;

	public Developer(int id, String name, int salary) {
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

	@Override
	public void addEmploy(Employ employ) {
	}

	@Override
	public Employ getEmploy(int index) {
		return null;
	}

	@Override
	public void removeEmploy(int index) {
	}

	@Override
	public void print() {
		System.out.println("Developer :- "+id+" - "+name+" - "+salary);
	}
}