package com.designPattern.structural.adapter;

public class TestAdapter {
	public static void main(String[] args) {
		OldCustomer oldCustomer = new OldCustomer("Shobhit Bhardwaj", "30", "212 XYZ, Gurgaon, Haryana");
		System.out.println(oldCustomer);

		NewCustomer newCustomer = new CustomerAdapter(oldCustomer);

		System.out.println(newCustomer);
	}
}