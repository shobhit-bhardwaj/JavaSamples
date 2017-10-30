package com.designPattern.creational.singleton;

public class StaticBlockInitialization {
	private static StaticBlockInitialization instance;

	static {
		try {
			instance = new StaticBlockInitialization();
		} catch(Exception ex) {
			System.out.println("Runtime Error Occured in Creating Instance.");
			ex.printStackTrace();
		}
	}

	private StaticBlockInitialization() {
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}
}