package com.dataStructure.stack.problems;

import com.dataStructure.stack.LinkedStackDemo;
import com.dataStructure.stack.LinkedStackDemo.Node;

public class ReverseStackRecursive {
	public Node reverseRecursive(Node top) {
		return top;
	}

	public static void main(String[] args) {
		LinkedStackDemo stack = new LinkedStackDemo();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.traverse();
		Node top = stack.getTop();

		Node newTop = new ReverseStackRecursive().reverseRecursive(top);
		stack.traverse(newTop);
	}
}