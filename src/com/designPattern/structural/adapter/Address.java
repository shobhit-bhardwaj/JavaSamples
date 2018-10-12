package com.designPattern.structural.adapter;

public class Address {
	private String addressLine;
	private String city;
	private String state;

	public Address() {
	}

	public Address(String addressLine, String city, String state) {
		this.addressLine = addressLine;
		this.city = city;
		this.state = state;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", city=" + city + ", state=" + state + "]";
	}
}