package com.dataStructure.tree;

public class CheckForTwoBSTAreSame {
	private static boolean sameBST(Node root1, Node root2) {
		if(root1 == null && root2 == null)
			return true;

		if(root1 == null || root2 == null)
			return false;

		return (root1.data == root2.data) && (sameBST(root1.left, root2.left)) && (sameBST(root1.right, root2.right));
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root1 = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		bst = new BinarySearchTree();
		Node root2 = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				//.insertData(18)
				.getRoot();

		boolean isSame = sameBST(root1, root2);
		System.out.println("Is Same BST - " + isSame);
	}
}