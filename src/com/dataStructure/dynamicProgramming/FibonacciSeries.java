package com.dataStructure.dynamicProgramming;

public class FibonacciSeries {
	public static int fibonacci(int number) {
		if(number <= 2)
			return 1;

		int a = 1;
		int b = 1;
		int current = 0;
		for(int i=0; i<number-2; i++) {
			current = a+b;
			a = b;
			b = current;
		}

		return current;
	}

	public static void main(String[] args) {
		//	1 1 2 3 5 8 13 ...
		int number = 5;

		int fibonacci = fibonacci(number);
		System.out.println("Fibonacci of :- "+number+" - "+fibonacci);
	}
}