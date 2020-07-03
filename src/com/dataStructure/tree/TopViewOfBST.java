package com.dataStructure.tree;

import java.util.Stack;

public class TopViewOfBST {
	private static void printTopView(Node root) {
		Stack<Integer> stack = new Stack<>();

		Node temp = root;
		while(temp != null) {
			stack.add(temp.data);
			temp = temp.left;
		}

		while(!stack.isEmpty())
			System.out.print(stack.pop() + " ");

		temp = root.right;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.right;
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

		printTopView(root);
	}
}