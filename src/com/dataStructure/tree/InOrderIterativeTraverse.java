package com.dataStructure.tree;

import java.util.Stack;

public class InOrderIterativeTraverse {
	private static void inOrderIterative(Node root) {
		if(root == null)
			return;

		Stack<Node> stack = new Stack<>();
		while(true) {
			if(root != null) {
				stack.push(root);
				root = root.left;
			} else {
				if(stack.isEmpty())
					break;
				else {
					root = stack.pop();
					System.out.print(root.data + "\t");
					root = root.right;
				}
			}
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		inOrderIterative(root);
	}
}