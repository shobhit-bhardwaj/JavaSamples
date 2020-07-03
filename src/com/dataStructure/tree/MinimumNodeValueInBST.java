package com.dataStructure.tree;

public class MinimumNodeValueInBST {
	private static Node getMinimumValueNode(Node root) {
		if(root.left == null)
			return root;

		return getMinimumValueNode(root.left);
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		Node minNode = getMinimumValueNode(root);
		System.out.println("Minimum Node - " + minNode.getData());
	}
}