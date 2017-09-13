package com.concurrent;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicDataTypes {
	private AtomicBoolean atomicBoolean = new AtomicBoolean(true);	//	By Default false

	public void atomicBooleanOperations() {
		System.out.println("Initial Value - "+atomicBoolean.get());

		atomicBoolean.set(false);
		System.out.println("After Setting false - "+atomicBoolean.get());

		boolean previousValue = atomicBoolean.getAndSet(true);
		System.out.println("Previous Value - "+previousValue+" | Current Value - "+atomicBoolean.get());

		boolean expectedValue = true;
		boolean updateValue = false;
		boolean success = atomicBoolean.compareAndSet(expectedValue, updateValue);
		System.out.println("Compare and Set Status - "+success+" | Updated Value - "+atomicBoolean.get());
	}

	public static void main(String[] args) {
		AtomicDataTypes object = new AtomicDataTypes();

		System.out.println("--- AtomicBoolean Operations ---");
		object.atomicBooleanOperations();
		System.out.println();
	}
}