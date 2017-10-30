package com.designPattern.creational.singleton;

public class BillPughInitialization {
	private BillPughInitialization() {
	}

	private static class SingletonHelper {
		private static final BillPughInitialization INSTANCE = new BillPughInitialization();
	}

	public BillPughInitialization getInstance() {
		return SingletonHelper.INSTANCE;
	}
}