package com.designPattern.creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MySingletonSerializationClass implements Serializable {
	private static final long serialVersionUID = 1L;

	public static volatile MySingletonSerializationClass instance;

	private MySingletonSerializationClass() {
	}

	public static MySingletonSerializationClass getInstance() {
		if(instance == null) {
			synchronized (MySingletonSerializationClass.class) {
				if(instance == null) {
					instance = new MySingletonSerializationClass();
				}
			}
		}

		return instance;
	}

	//	Return Same Instance after Serialization.
	/*protected Object readResolve() {
		System.out.println("Read Resolve returns Same Instance.");
		return getInstance();
	}*/
}

public class SingletonBreakBySerializationDemo {
	public static void main(String[] args) throws Exception {
		MySingletonSerializationClass instance = MySingletonSerializationClass.getInstance();
		System.out.println(instance);

		ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("mySingleton.ser"));
		outputStream.writeObject(instance);

		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("mySingleton.ser"));
		MySingletonSerializationClass instanceSerialize = (MySingletonSerializationClass) inputStream.readObject();
		System.out.println(instanceSerialize);

		outputStream.close();
		inputStream.close();
	}
}