package com.dataStructure.tree;

public class CheckGivenTreeIsBST {
	private static boolean checkForBST(Node node, int min, int max) {
		if(node == null)
			return true;
		if(node.data <= min || node.data >= max)
			return false;

		return checkForBST(node.left, min, node.data) && checkForBST(node.right, node.data, max);
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		boolean isBST = checkForBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println("Is BST - " + isBST);
	}
}