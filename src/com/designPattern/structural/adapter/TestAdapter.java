package com.designPattern.structural.adapter;

public class TestAdapter {
	public static void main(String[] args) {
		testClassAdapter();

		System.out.println();

		testObjectAdapter();
	}

	public static void testClassAdapter() {
		SocketAdapter adapter = new SocketAdapterClassImpl();
		Volt v3 = adapter.get3Volt();
		Volt v12 = adapter.get12Volt();
		Volt v120 = adapter.get120Volt();

		System.out.println("testClassAdapter Volt 3 - "+v3.getVolts());
		System.out.println("testClassAdapter Volt 12 - "+v12.getVolts());
		System.out.println("testClassAdapter Volt 120 - "+v120.getVolts());
	}

	public static void testObjectAdapter() {
		SocketAdapter adapter = new SocketAdapterObjectImpl();
		Volt v3 = adapter.get3Volt();
		Volt v12 = adapter.get12Volt();
		Volt v120 = adapter.get120Volt();

		System.out.println("testClassAdapter Volt 3 - "+v3.getVolts());
		System.out.println("testClassAdapter Volt 12 - "+v12.getVolts());
		System.out.println("testClassAdapter Volt 120 - "+v120.getVolts());
	}
}