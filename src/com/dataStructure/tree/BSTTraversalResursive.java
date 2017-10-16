package com.dataStructure.tree;

import com.dataStructure.tree.BSTInsertionDemo.Node;

public class BSTTraversalResursive {
	public void preorder(Node node) {
		if(node == null)
			return;

		System.out.print(node.getData()+"\t");
		preorder(node.getLeft());
		preorder(node.getRight());
	}

	public void inorder(Node node) {
		if(node == null)
			return;

		inorder(node.getLeft());
		System.out.print(node.getData()+"\t");
		inorder(node.getRight());
	}

	public void postorder(Node node) {
		if(node == null)
			return;

		postorder(node.getLeft());
		postorder(node.getRight());
		System.out.print(node.getData()+"\t");
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);

		Node root = insertion.getRoot();

		BSTTraversalResursive traversal = new BSTTraversalResursive();
		System.out.print("Preorder\t");
		traversal.preorder(root);
		System.out.println();

		System.out.print("Inorder\t\t");
		traversal.inorder(root);
		System.out.println();

		System.out.print("Postorder\t");
		traversal.postorder(root);
	}
}