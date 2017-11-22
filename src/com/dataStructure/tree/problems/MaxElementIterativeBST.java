package com.dataStructure.tree.problems;

import java.util.LinkedList;
import java.util.Queue;

import com.dataStructure.tree.BSTInsertionDemo;
import com.dataStructure.tree.BSTInsertionDemo.Node;

public class MaxElementIterativeBST {
	public int maxInBST(Node root) {
		int maxValue = Integer.MIN_VALUE;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			if(node.getData() > maxValue)
				maxValue = node.getData();

			if(node.getLeft() != null)
				queue.add(node.getLeft());
			if(node.getRight() != null)
				queue.add(node.getRight());
		}

		return maxValue;
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);
		Node root = insertion.getRoot();

		MaxElementIterativeBST bst = new MaxElementIterativeBST();
		int maxElement = bst.maxInBST(root);
		System.out.println("Max Element - "+maxElement);
	}
}