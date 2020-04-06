package com.collection.generics;

public class GenericMethodInClassHierarchy {
	private static class A {
		public void process() {
			System.out.println("A");
		}
	}

	private static class B extends A {
		/*@Override
		public void process() {
			System.out.println("B");
		}*/
	}

	private static class C extends A {
		@Override
		public void process() {
			System.out.println("C");
		}
	}

	private static class Z {
		public void process() {
			System.out.println("Z");
		}
	}

	/*
	 * In this generic method, we have to specify the upper bound
	 * to access the method present in the Top class and inherited
	 * by all its sub class like process().
	 * 
	 * We cannot use super keyword in type declaration because we
	 * are not sure that this method will be present in all its
	 * super class.
	 * 
	 */
	public static <T extends A > boolean getValue(T t) {
		t.process();

		return true;
	}

	/*
	 * If we are not using any boundary, then we cannot specify
	 * any class method like process() in the previous method.
	 * Now it will only give access to Object class methods.
	 * 
	 */
	public static <T> boolean getValueWithoutBound(T t) {
		System.out.println(t.toString());

		return true;
	}

	public static void main(String[] args) {
		A a = new A();
		getValue(a);

		B b = new B();
		getValue(b);

		C c = new C();
		getValue(c);

		Z z = new Z();
		//getValue(z);		//	It Wont Compile, as X and sub class of X can be processed.
		getValueWithoutBound(z);
	}
}