package com.designPattern.structural.adapter;

/*
 * Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together.
 * The object, that joins these unrelated interfaces, is called an Adapter.
 * 
 * Examples :-
 * 1. BufferedReader(new InputStreamReader(System.in));
 * 2. java.util.Arrays # asList()
 * 3. javax.xml.bind.annotation.adapters.XmlAdapter # marshal() and unmarshal()
 */
public class Client {
	public static void main(String[] args) {
		OldCustomer oldCustomer = new OldCustomer("Shobhit Bhardwaj", "30", "212 XYZ, Gurgaon, Haryana");
		System.out.println(oldCustomer);

		NewCustomer newCustomer = new CustomerAdapter(oldCustomer);

		System.out.println(newCustomer);
	}
}