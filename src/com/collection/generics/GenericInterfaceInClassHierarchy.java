package com.collection.generics;

public class GenericInterfaceInClassHierarchy {
	private static interface Consume <T> {
		public void display(T value);
	}

	private static class ConsumeIntegerImpl implements Consume<Integer> {
		@Override
		public void display(Integer value) {
			System.out.println("Integer Value - " + value.intValue());
		}
	}

	private static class ConsumeFloatImpl implements Consume<Float> {
		@Override
		public void display(Float value) {
			System.out.println("Float Value - " + value.floatValue());
		}
	}

	public static void main(String[] args) {
		ConsumeIntegerImpl integerImpl = new ConsumeIntegerImpl();
		integerImpl.display(100);

		ConsumeFloatImpl floatImpl = new ConsumeFloatImpl();
		floatImpl.display(123.45f);
	}
}