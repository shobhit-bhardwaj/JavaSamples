package com.dataStructure.tree;

import java.util.Stack;

public class PreOrderIterativeTraverse {
	private static void preOrderIterative(Node root) {
		if(root == null)
			return;

		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.print(node.data + "\t");
			if(node.right != null)
				stack.push(node.right);
			if(node.left != null)
				stack.push(node.left);
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

		preOrderIterative(root);
	}
}