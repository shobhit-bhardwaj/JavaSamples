package com.dataStructure.tree;

public class MinimumNodeValueInBST {
	private static Node getMinimumValueRecursive(Node root) {
		if(root == null)
			return null;

		if(root.left == null)
			return root;

		return getMinimumValueRecursive(root.left);
	}

	private static Node getMinimumValueIterative(Node root) {
		if(root == null)
			return null;

		while(root.left != null)
			root = root.left;

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

		Node minNode = getMinimumValueRecursive(root);
		System.out.println("Minimum Node Recursive - " + minNode.getData());

		minNode = getMinimumValueIterative(root);
		System.out.println("Minimum Node Iterative - " + minNode.getData());
	}
}