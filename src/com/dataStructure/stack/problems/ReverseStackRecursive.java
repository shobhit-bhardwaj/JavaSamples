package com.dataStructure.stack.problems;

import java.util.Stack;

public class ReverseStackRecursive {
	private static Stack<Integer> stack = new Stack<>();

	public void reverseRecursive() {
		if(stack.size() > 0) {
			int data = stack.pop();
			reverseRecursive();
			insertAtBottom(data);
		}
	}

	private void insertAtBottom(int data) {
		if(stack.isEmpty())
			stack.push(data);
		else {
			int a = stack.peek();
			stack.pop();
			insertAtBottom(data);
			stack.push(a);
		}
	}

	public static void main(String[] args) {
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println(stack);

		new ReverseStackRecursive().reverseRecursive();
		System.out.println(stack);
	}
}