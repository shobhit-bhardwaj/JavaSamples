package com.javaBasics;

class MyResource implements AutoCloseable {
	public void sayHello() {
		System.out.println("Hello From MyResource");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Close MyResource");
	}
}

public class AutoCloseableTest {
	public static void main(String[] args) {
		System.out.println("Start Main Method");

		try (MyResource resource = new MyResource()) {
			resource.sayHello();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		System.out.println("End Main Method");
	}
}