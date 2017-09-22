package com.collection.generics;

import java.util.ArrayList;
import java.util.List;

class A {
	protected int value;

	public A(int value) {
		this.value = value;
	}

	public void process() {
		System.out.println("process() A - "+value);
	}

	@Override
	public String toString() {
		return "A [value=" + value + "]";
	}
}

class B extends A {
	public B(int value) {
		super(value);
	}

	public void process() {
		System.out.println("process() B - "+value);
	}

	@Override
	public String toString() {
		return "B [value=" + value + "]";
	}
}

class C extends A {
	public C(int value) {
		super(value);
	}

	public void process() {
		System.out.println("process() C - "+value);
	}

	@Override
	public String toString() {
		return "C [value=" + value + "]";
	}
}

public class GenericWildCardDemo {
	private static void processUnknownElement(List<?> elements) {
		for(Object object : elements) {
			System.out.println("processUnknownElement - "+object);
		}
	}

	private static void processExtendElement(List<? extends A> elements) {
		for(A aObj : elements) {
			aObj.process();
		}
	}

	private static void processSuperElement(List<? super A> elements) {
		for(Object object : elements) {
			//B bObj = (B) object;
			System.out.println(object);
		}
	}

	public static void main(String[] args) {
		List<A> listA = new ArrayList<>();
		listA.add(new A(1));
		listA.add(new A(2));
		listA.add(new A(3));

		List<B> listB = new ArrayList<>();
		listB.add(new B(4));
		listB.add(new B(5));

		List<C> listC = new ArrayList<>();
		listC.add(new C(6));
		listC.add(new C(7));

		processUnknownElement(listA);
		//processUnknownElement(listB);
		//processUnknownElement(listC);
		System.out.println();

		processExtendElement(listA);
		//processExtendElement(listB);
		//processExtendElement(listC);
		System.out.println();

		
		List<? super A> listSuper = new ArrayList<>();
		listSuper.add(new A(2));
		listSuper.add(new B(2));

		processSuperElement(listSuper);
		//processSuperElement(listA);
		//processSuperElement(listB);
		//processSuperElement(listC);
	}
}