package com.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTraversalBST {
	private static void levelOrderTraversalReverse(Node root) {
		if(root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		Stack<Node> stack = new Stack<>();
		queue.add(root);

		while(!queue.isEmpty()) {
			Node node = queue.poll();
			stack.push(node);

			if(node.right != null)
				queue.add(node.right);
			if(node.left != null)
				queue.add(node.left);
		}

		while(!stack.isEmpty())
			System.out.print(stack.pop().data + "\t");
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		levelOrderTraversalReverse(root);
	}
}