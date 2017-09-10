package com.threads.exceptionHandling;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadUncaughtExceptionHandler implements UncaughtExceptionHandler {
	private String handlerName;

	public ThreadUncaughtExceptionHandler(String handlerName) {
		this.handlerName = handlerName;
	}

	@Override
	public void uncaughtException(Thread thread, Throwable exception) {
		System.out.println(this+" - "+thread.getName()+" - "+exception);
	}

	@Override
	public String toString() {
		return handlerName+"@"+hashCode();
	}
}