package com.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderIterativeTraverse {
	private static void levelOrderIterative(Node root) {
		if(root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.data + "\t");
			if(node.left != null)
				queue.add(node.left);
			if(node.right != null)
				queue.add(node.right);
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

		levelOrderIterative(root);
	}
}