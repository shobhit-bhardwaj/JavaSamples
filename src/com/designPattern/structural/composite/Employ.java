package com.designPattern.structural.composite;

public interface Employ {
	public void addEmploy(Employ employ);
	public Employ getEmploy(int index);
	public void removeEmploy(int index);

	public int getId();
	public String getName();
	public int getSalary();
	public void print();
}