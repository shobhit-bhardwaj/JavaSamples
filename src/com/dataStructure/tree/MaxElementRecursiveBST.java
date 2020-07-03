package com.dataStructure.tree;

public class MaxElementRecursiveBST {
	private static int maxInBST(Node root) {
		if(root == null)
			return -1;

		int maxValue = Integer.MIN_VALUE;
		int maxLeft = maxInBST(root.left);
		int maxRight = maxInBST(root.right);

		if(maxLeft > maxRight)
			maxValue = maxLeft;
		else
			maxValue = maxRight;

		if(root.data > maxValue)
			maxValue = root.data;

		return maxValue;
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		int maxElement = maxInBST(root);
		System.out.println("Max Element - " + maxElement);
	}
}