package com.dataStructure.tree;

public class PrintBSTInGivenRange {
	private static void printInGivenRange(Node root, int n1, int n2) {
		if(root == null)
			return;

		printInGivenRange(root.left, n1, n2);

		if(root.data >= n1 && root.data <= n2)
			System.out.print(root.data + "\t");

		printInGivenRange(root.right, n1, n2);
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(1)
				.insertData(3)
				.insertData(4)
				.insertData(20)
				.insertData(15)
				.getRoot();

		printInGivenRange(root, 3, 15);
	}
}