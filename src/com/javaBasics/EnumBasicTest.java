package com.javaBasics;

enum Direction {
	EAST {
		@Override
		public void display() {
			System.out.println("East");
		}
	},
	WEST {
		@Override
		public void display() {
			System.out.println("West");
		}
	},
	NORTH {
		@Override
		public void display() {
			System.out.println("North");
		}
	},
	SOUTH {
		@Override
		public void display() {
			System.out.println("South");
		}
	};

	public abstract void display();
}

public class EnumBasicTest {
	public static void main(String[] args) {
		Direction.EAST.display();
	}
}