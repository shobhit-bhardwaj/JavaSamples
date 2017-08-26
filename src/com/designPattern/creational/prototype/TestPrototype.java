package com.designPattern.creational.prototype;

public class TestPrototype {
	public static void main(String[] args) throws Exception {
		Employ employ = new Employ();
		employ.loadData();
		System.out.println("Employ - "+employ.getEmployList());

		Employ employ1 = (Employ) employ.clone();
		employ1.getEmployList().add("DDD");
		System.out.println("Employ 1 - "+employ1.getEmployList());

		Employ employ2 = (Employ) employ.clone();
		employ2.getEmployList().remove("BBB");
		System.out.println("Employ 2 - "+employ2.getEmployList());
	}
}