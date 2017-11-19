package com.dataStructure.tree;

import com.dataStructure.tree.BSTInsertionDemo.Node;

public class BSTCheckForBST {
	public boolean checkForBST(Node node, int min, int max) {
		if(node == null)
			return true;
		if(node.getData() <= min || node.getData() >= max)
			return false;

		return checkForBST(node.getLeft(), min, node.getData()) && checkForBST(node.getRight(), node.getData(), max);
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);

		Node root = insertion.getRoot();

		BSTCheckForBST check = new BSTCheckForBST();
		boolean isBST = check.checkForBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println("Is BST - "+isBST);
	}
}