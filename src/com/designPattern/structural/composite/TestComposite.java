package com.designPattern.structural.composite;

public class TestComposite {
	public static void main(String[] args) {
		Employ manager1 = new Manager(100, "Man 1", 50000);
		Employ developer1 = new Developer(101, "Dev 1", 1000);
		Employ developer2 = new Developer(102, "Dev 2", 1000);
		Employ developer3 = new Developer(103, "Dev 3", 1000);
		manager1.addEmploy(developer1);
		manager1.addEmploy(developer2);
		manager1.addEmploy(developer3);

		Employ manager2 = new Manager(200, "Man 2", 50000);
		Employ developer4 = new Developer(201, "Dev 4", 1000);
		Employ developer5 = new Developer(202, "Dev 5", 1000);
		manager2.addEmploy(developer4);
		manager2.addEmploy(developer5);

		manager1.print();
		manager2.print();
	}
}