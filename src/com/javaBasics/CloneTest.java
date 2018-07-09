package com.javaBasics;

class Department implements Cloneable {
	private String departmentName;

	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + "]";
	}
}

class Employ implements Cloneable {
	private int id;
	private String name;
	private Department department;

	public Employ(int id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//	Shallow Cloning
		//return super.clone();

		//	Deep Cloning
		Employ clone = (Employ) super.clone();
		clone.setDepartment((Department) clone.getDepartment().clone());
		return clone;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
}

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Department department = new Department("Java");

		Employ employ = new Employ(101, "Shobhit Bhardwaj", department);
		System.out.println("Employ - "+employ);
		Employ employClone = (Employ) employ.clone();
		System.out.println("Employ Clone - "+employClone);

		employ.getDepartment().setDepartmentName("J2EE");

		System.out.println("Employ - "+employ);
		System.out.println("Employ Clone - "+employClone);

		/*
		 * Deep Cloning can be Achieved By Following Techniques -
		 * 1. Implement clone Method as Above.
		 * 2. Copy Constructor.
		 * 3. Serialization.
		 * 4. Apache commons.
		 * (SomeObject cloned = org.apache.commons.lang.SerializationUtils.clone(someObject);)
		 * 
		 */
	}
}