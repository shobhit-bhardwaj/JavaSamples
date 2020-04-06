package com.collection.generics;

public class GenericClassInClassHierarchy {
	private static class One {
		public void display() {
			System.out.println("One Class Called.");
		}
	}

	private static class Two extends One {
		public void display() {
			System.out.println("Two Class Called.");
		}
	}

	private static class Three extends Two {
		public void display() {
			System.out.println("Three Class Called.");
		}
	}

	private static class OneFamily<T extends One> {
		private T value;

		public OneFamily(T value) {
			this.value = value;
		}

		public void displayInfo() {
			value.display();
		}
	}

	public static void main(String[] args) {
		OneFamily<One> oneObject = new OneFamily<One>(new One());
		OneFamily<Two> twoObject = new OneFamily<Two>(new Two());
		OneFamily<Three> threeObject = new OneFamily<Three>(new Three());

		oneObject.displayInfo();
		twoObject.displayInfo();
		threeObject.displayInfo();
	}
}