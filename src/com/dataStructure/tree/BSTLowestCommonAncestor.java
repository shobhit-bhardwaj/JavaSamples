package com.dataStructure.tree;

import com.dataStructure.tree.BSTInsertionDemo.Node;

public class BSTLowestCommonAncestor {
	public Node lowestCommonAncestor(Node root, int data1, int data2) {
		if(root == null)
			return null;

		if(root.getData() > data1 && root.getData() > data2)
			return lowestCommonAncestor(root.getLeft(), data1, data2);
		if(root.getData() < data1 && root.getData() < data2)
			return lowestCommonAncestor(root.getRight(), data1, data2);

		return root;
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);
		insertion.insertData(25);
		insertion.insertData(35);

		Node root = insertion.getRoot();

		BSTLowestCommonAncestor ancestor = new BSTLowestCommonAncestor();
		Node node = ancestor.lowestCommonAncestor(root, 15, 35);
		System.out.println("Lowest Common Ancestor - "+node.getData());
	}
}