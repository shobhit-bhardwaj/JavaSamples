package com.dataStructure.tree;

public class SearchInBST {
	private static Node search(Node node, int key) {
		if(node == null)
			return null;
		else {
			if(node.data == key)
				return node;
			else if(node.data < key)
				return search(node.right, key);
			else
				return search(node.left, key);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		Node node = search(root, 20);
		System.out.println(node);
	}
}