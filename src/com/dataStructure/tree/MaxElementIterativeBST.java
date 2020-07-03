package com.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElementIterativeBST {
	private static int maxInBST(Node root) {
		int maxValue = Integer.MIN_VALUE;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			if(node.data > maxValue)
				maxValue = node.data;

			if(node.left != null)
				queue.add(node.left);
			if(node.right != null)
				queue.add(node.right);
		}

		return maxValue;
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		int maxElement = maxInBST(root);
		System.out.println("Max Element - " + maxElement);
	}
}