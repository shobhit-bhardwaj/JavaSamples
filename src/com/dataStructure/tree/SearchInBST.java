package com.dataStructure.tree;

public class SearchInBST {
	private static Node searchRecursive(Node node, int key) {
		if(node == null)
			return null;

		if(node.data > key)
			return searchRecursive(node.left, key);
		else if(node.data < key)
			return searchRecursive(node.right, key);
		else
			return node;
	}

	private static Node searchIterative(Node node, int key) {
		if(node == null)
			return null;

		while(node != null) {
			if(node.data > key)
				node = node.left;
			else if(node.data < key)
				node = node.right;
			else
				return node;
		}

		return null;
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		Node node = searchRecursive(root, 20);
		System.out.println(node);

		node = searchIterative(root, 5);
		System.out.println(node);
	}
}