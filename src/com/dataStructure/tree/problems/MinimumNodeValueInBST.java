package com.dataStructure.tree.problems;

import com.dataStructure.tree.BSTInsertionDemo;
import com.dataStructure.tree.BSTInsertionDemo.Node;

public class MinimumNodeValueInBST {
	public Node getMinimumValueNode(Node root) {
		if(root.getLeft() == null)
			return root;

		return getMinimumValueNode(root.getLeft());
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);
		Node root = insertion.getRoot();

		MinimumNodeValueInBST bst = new MinimumNodeValueInBST();
		Node minNode = bst.getMinimumValueNode(root);
		System.out.println("Minimum Node - "+minNode.getData());
	}
}