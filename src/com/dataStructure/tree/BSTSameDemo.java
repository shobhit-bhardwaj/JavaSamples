package com.dataStructure.tree;

import com.dataStructure.tree.BSTInsertionDemo.Node;

public class BSTSameDemo {
	public boolean sameBST(Node root1, Node root2) {
		if(root1 == null && root2 == null)
			return true;

		if(root1 == null || root2 == null)
			return false;

		return (root1.getData() == root2.getData()) && (sameBST(root1.getLeft(), root2.getLeft())) && (sameBST(root1.getRight(), root2.getRight()));
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);
		Node root1 = insertion.getRoot();

		insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);
		//insertion.insertData(18);
		Node root2 = insertion.getRoot();

		BSTSameDemo same = new BSTSameDemo();
		boolean isSame = same.sameBST(root1, root2);
		System.out.println("Is Same BST - "+isSame);
	}
}