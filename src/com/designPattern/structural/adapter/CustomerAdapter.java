package com.designPattern.structural.adapter;

public class CustomerAdapter extends NewCustomer implements Customer {
	private OldCustomer oldCustomer;

	public CustomerAdapter(OldCustomer oldCustomer) {
		this.oldCustomer = oldCustomer;
		this.doAdapt();
	}

	private void doAdapt() {
		this.setName(oldCustomer.getName());
		this.setAge(Integer.parseInt(oldCustomer.getAge()));

		String[] oldAddress = oldCustomer.getAddress().split(",");
		String addressLine = oldAddress[0].trim();
		String city = oldAddress[1].trim();
		String state = oldAddress[2].trim();
		Address address = new Address(addressLine, city, state);
		this.setAddress(address);
	}
}