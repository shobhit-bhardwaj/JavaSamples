package com.dataStructure.tree;

public class MaximumNodeValueInBST {
	private static Node getMaximumValueRecursive(Node root) {
		if(root == null)
			return null;

		if(root.right == null)
			return root;

		return getMaximumValueRecursive(root.right);
	}

	private static Node getMaximumValueIterative(Node root) {
		if(root == null)
			return null;

		while(root.right != null)
			root = root.right;

		return root;
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		Node minNode = getMaximumValueRecursive(root);
		System.out.println("Maximum Node Recursive - " + minNode.getData());

		minNode = getMaximumValueIterative(root);
		System.out.println("Maximum Node Iterative - " + minNode.getData());
	}
}