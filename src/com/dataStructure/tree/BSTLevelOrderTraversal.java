package com.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.dataStructure.tree.BSTInsertionDemo.Node;

public class BSTLevelOrderTraversal {
	public void levelOrderTraversal(Node root) {
		if(root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.getData()+"\t");
			if(node.getLeft() != null)
				queue.add(node.getLeft());
			if(node.getRight() != null)
				queue.add(node.getRight());
		}
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);

		Node root = insertion.getRoot();

		BSTLevelOrderTraversal traversal = new BSTLevelOrderTraversal();
		traversal.levelOrderTraversal(root);
	}
}