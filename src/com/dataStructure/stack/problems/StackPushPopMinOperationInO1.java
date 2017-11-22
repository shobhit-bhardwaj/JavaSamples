package com.dataStructure.stack.problems;

public class StackPushPopMinOperationInO1 {
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node top;
	private int minElement;

	public void push(int data) {
		System.out.println("Push - "+data);

		if(top == null) {
			minElement = data;
			Node node = new Node(data);
			top = node;
		} else {
			if(data < minElement) {
				int temp = minElement;
				minElement = data;
				data = 2*data-temp;
			}

			Node node = new Node(data);
			node.next = top;
			top = node;
		}
	}

	public int pop() {
		if(top == null)
			return -1;

		int data = top.data;
		top = top.next;

		if(data < minElement) {
			int temp = data;
			data = minElement;
			minElement = 2*minElement-temp;
		}

		return data;
	}

	public void printMinElement() {
		System.out.println("Min Element - "+minElement);
	}

	public void test() {
		push(30);
		push(40);
		push(50);
		printMinElement();
		push(20);
		printMinElement();
		push(10);
		printMinElement();
		System.out.println("Pop - "+pop());
		printMinElement();
		System.out.println("Pop - "+pop());
		printMinElement();
		System.out.println("Pop - "+pop());
		printMinElement();
	}

	public static void main(String[] args) {
		new StackPushPopMinOperationInO1().test();
	}
}