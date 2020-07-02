package com.dataStructure.tree;

public class SizeOfBST {
	private static int size(Node node) {
		if(node == null)
			return 0;

		int leftSize = size(node.left);
		int rightSize = size(node.right);

		return leftSize + rightSize + 1;
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		int size = size(root);
		System.out.println("Size of BST - " + size);
	}
}