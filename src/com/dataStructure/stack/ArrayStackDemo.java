package com.dataStructure.stack;

public class ArrayStackDemo {
	private int capecity;
	private static final int DEFAULT_CAPECITY = 10;

	private int top = -1;
	private int size;
	private int[] stack;

	public ArrayStackDemo() {
		this(DEFAULT_CAPECITY);
	}

	public ArrayStackDemo(int capecity) {
		this.capecity = capecity;
		stack = new int[capecity];
	}

	public int top() {
		if(size == 0)
			return -1;
		return stack[top];
	}

	public boolean push(int data) {
		if(top == capecity-1)
			return false;

		stack[++top] = data;
		size++;
		return true;
	}

	public int pop() {
		if(size == 0)
			return -1;

		int data = stack[top];
		stack[top] = Integer.MIN_VALUE;
		top--;
		size--;
		return data;
	}

	public void traverse() {
		for(int i=0; i<capecity; i++)
			System.out.print(stack[i]+"\t");
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayStackDemo stack = new ArrayStackDemo(3);
		System.out.println("Push 3 - "+stack.push(3));
		System.out.println("Push 4 - "+stack.push(4));
		System.out.println("Top - "+stack.top());
		System.out.println("Push 5 - "+stack.push(5));
		System.out.println("Push 6 - "+stack.push(6));
		System.out.println("Push 7 - "+stack.push(7));
		stack.traverse();
		System.out.println("Pop - "+stack.pop());
		System.out.println("Pop - "+stack.pop());
		System.out.println("Pop - "+stack.pop());
		System.out.println("Pop - "+stack.pop());
		System.out.println("Pop - "+stack.pop());
	}
}