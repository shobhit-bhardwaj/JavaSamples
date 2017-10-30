package com.designPattern.creational.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;

class MySingletonReflectionClass implements Serializable {
	private static final long serialVersionUID = 1L;

	public static volatile MySingletonReflectionClass instance;

	private MySingletonReflectionClass() {
		if(instance != null) {
			throw new RuntimeException("Cannot Create Instance.");
		}
	}

	public static MySingletonReflectionClass getInstance() {
		if(instance == null) {
			synchronized (MySingletonReflectionClass.class) {
				if(instance == null) {
					instance = new MySingletonReflectionClass();
				}
			}
		}

		return instance;
	}
}

public class SingletonBreakByReflectionDemo {
	public static void main(String[] args) throws Exception {
		MySingletonReflectionClass instance = MySingletonReflectionClass.getInstance();
		System.out.println(instance);

		MySingletonReflectionClass instanceReflect = null;
		Constructor[] constructors = MySingletonReflectionClass.class.getDeclaredConstructors();
		for(Constructor Constructor : constructors) {
			Constructor.setAccessible(true);
			instanceReflect = (MySingletonReflectionClass) Constructor.newInstance();
			break;
		}

		System.out.println(instanceReflect);
	}
}