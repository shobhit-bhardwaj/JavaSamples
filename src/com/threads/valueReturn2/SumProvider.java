package com.threads.valueReturn2;

public class SumProvider implements ValueProvider<Integer> {
	@Override
	public void printValue(Integer value) {
		System.out.println("Sum is - "+value);
	}
}