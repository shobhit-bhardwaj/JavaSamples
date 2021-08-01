package com.javaNewFeatures.java8;

//	Functional Interface
interface MathOperation {
	public int operate(int a, int b);
}

//Functional Interface
interface GreetService {
	public String sayHello(String name);
}

public class LambdaExpression {
	public static void main(String[] args) {
		MathOperation addition = (a, b) -> (a+b);
		MathOperation subtraction = (int a, int b) -> a-b;
		MathOperation multiplication = (a, b) -> { return a*b; };
		MathOperation division = (int a, int b) -> { return a/b; };

		System.out.println("Addition - " + addition.operate(30, 10));
		System.out.println("Subtraction - " + subtraction.operate(30, 10));
		System.out.println("Multiplication - " + multiplication.operate(30, 10));
		System.out.println("Division - " + division.operate(30, 10));

		int c = process((a, b) -> {return a*a + b*b;}, 5, 10);
		System.out.println("process() - " + c);

		GreetService service = (name) -> { String greet = "Hello "; greet += name; return greet; };
		System.out.println("Greet Service - " + service.sayHello("Shobhit"));

		Runnable r1 = () -> {
			for(int i=0; i<5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread-1 - " + i);
			}
		};

		Runnable r2 = () -> {
			for(int i=0; i<5; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread-2 - " + i);
			}
		};

		new Thread(r1).start();
		new Thread(r2).start();
	}

	public static int process(MathOperation operation, int a, int b) {
		return operation.operate(a, b);
	}
}