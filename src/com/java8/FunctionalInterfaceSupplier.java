package com.java8;

import java.util.Optional;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<String> {
	@Override
	public String get() {
		return "Default Value";
	}
}

public class FunctionalInterfaceSupplier {
	public static void main(String[] args) {
		Supplier<String> supplier = new SupplierImpl();
		System.out.println(supplier.get());
		System.out.println();

		//String input = "test";
		String input = null;
		String output = Optional.ofNullable(input).orElseGet(supplier);

		System.out.println(output);
	}
}