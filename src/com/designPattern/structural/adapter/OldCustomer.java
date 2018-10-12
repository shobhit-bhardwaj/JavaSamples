package com.designPattern.structural.adapter;

public class OldCustomer {
	private String name;
	private String age;
	private String address;

	public OldCustomer() {
	}

	public OldCustomer(String name, String age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "OldCustomer [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}