package com.javaNewFeatures.java8;

import java.util.List;
import java.util.function.Consumer;

class ConsumerImpl implements Consumer<Integer> {
	@Override
	public void accept(Integer value) {
		System.out.println("value - " + value);
	}
}

public class FunctionalInterfaceConsumer {
	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 2, 3, 4, 5);

		Consumer<Integer> consumer = new ConsumerImpl();
		System.out.print("Consumer accept for value 10 - ");
		consumer.accept(10);
		System.out.println();

		for(int i : integers)
			consumer.accept(i);

		System.out.println();

		//integers.stream().forEach(consumer);
		integers.stream().forEach(value -> System.out.println("value - " + value));
	}
}