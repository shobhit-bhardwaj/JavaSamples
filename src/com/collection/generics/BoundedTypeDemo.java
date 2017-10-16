package com.collection.generics;

class X {
	public void process() {
		System.out.println("X");
	}
}

class Y extends X {
	@Override
	public void process() {
		System.out.println("Y");
	}
}

class Z {
	public void process() {
		System.out.println("Z");
	}
}

public class BoundedTypeDemo {
	public static <T extends X> boolean getValue(T t) {
		t.process();
		return true;
	}

	public static void main(String[] args) {
		X x = new X();
		getValue(x);

		Y y = new Y();
		getValue(y);

		Z z = new Z();
		//	getValue(z);		//	It Wont Compile, as X and sub class of X can be processed.
	}
}