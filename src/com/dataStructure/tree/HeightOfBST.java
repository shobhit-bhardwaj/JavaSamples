package com.dataStructure.tree;

public class HeightOfBST {
	private static int height(Node node) {
		if(node == null)
			return 0;

		int leftHeight = height(node.left);
		int rightHeight = height(node.right);

		return 1 + Math.max(leftHeight, rightHeight);
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		int height = height(root);
		System.out.println("Height of BST - " + height);
	}
}