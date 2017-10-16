package com.dataStructure.tree;

import com.dataStructure.tree.BSTInsertionDemo.Node;

public class BSTSizeDemo {
	public int size(Node node) {
		if(node == null)
			return 0;

		int leftSize = size(node.getLeft());
		int rightSize = size(node.getRight());

		return leftSize + rightSize + 1;
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);

		Node root = insertion.getRoot();

		BSTSizeDemo sizeOfBST = new BSTSizeDemo();
		int size = sizeOfBST.size(root);
		System.out.println("Size of BST - "+size);
	}
}