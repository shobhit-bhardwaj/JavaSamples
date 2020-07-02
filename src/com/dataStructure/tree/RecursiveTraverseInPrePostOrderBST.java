package com.dataStructure.tree;

public class RecursiveTraverseInPrePostOrderBST {
	private static void preorder(Node node) {
		if(node == null)
			return;

		System.out.print(node.data + "\t");
		preorder(node.left);
		preorder(node.right);
	}

	private static void inorder(Node node) {
		if(node == null)
			return;

		preorder(node.left);
		System.out.print(node.data + "\t");
		preorder(node.right);
	}

	private static void postorder(Node node) {
		if(node == null)
			return;

		preorder(node.left);
		preorder(node.right);
		System.out.print(node.data + "\t");
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		System.out.print("Preorder\t");
		preorder(root);
		System.out.println();

		System.out.print("Inorder\t\t");
		inorder(root);
		System.out.println();

		System.out.print("Postorder\t");
		postorder(root);
	}
}