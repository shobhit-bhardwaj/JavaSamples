package com.dataStructure.tree;

import com.dataStructure.tree.BSTInsertionDemo.Node;

public class BSTHeightDemo {
	public int height(Node node) {
		if(node == null)
			return 0;

		int leftHeight = height(node.getLeft());
		int rightHeight = height(node.getRight());
		return 1 + Math.max(leftHeight, rightHeight);
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);

		Node root = insertion.getRoot();

		BSTHeightDemo heightOfBST = new BSTHeightDemo();
		int height = heightOfBST.height(root);
		System.out.println("Height of BST - "+height);
	}
}