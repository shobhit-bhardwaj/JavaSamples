package com.coreJava;

class EmployClone implements Cloneable {
	private int id;
	private String name;
	private String designation;
	private int salary;

	public EmployClone(int id, String name, String designation, int salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
}

public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		EmployClone employ = new EmployClone(1, "Shobhit Bhardwaj", "Java Developer", 17000);
		EmployClone employClone = (EmployClone) employ.clone();
		employ.setSalary(18000);
		System.out.println("Employ - "+employ);
		System.out.println("Employ Clone - "+employClone);
	}
}