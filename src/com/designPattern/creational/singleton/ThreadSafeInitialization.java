package com.designPattern.creational.singleton;

public class ThreadSafeInitialization {
	private static volatile ThreadSafeInitialization instance;

	private ThreadSafeInitialization() {
	}

	public static ThreadSafeInitialization getInstance() {
		if(instance == null) {
			synchronized (ThreadSafeInitialization.class) {
				if(instance == null) {
					instance = new ThreadSafeInitialization();
				}
			}
		}

		return instance;
	}
}