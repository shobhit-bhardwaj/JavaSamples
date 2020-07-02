package com.dataStructure.tree;

public class LowestCommonAncestorInBST {
	private static Node lowestCommonAncestor(Node root, int data1, int data2) {
		if(root == null)
			return null;

		if(root.data > data1 && root.data > data2)
			return lowestCommonAncestor(root.left, data1, data2);

		if(root.data < data1 && root.data < data2)
			return lowestCommonAncestor(root.right, data1, data2);

		return root;
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(20)
				.insertData(5)
				.insertData(15)
				.insertData(25)
				.insertData(35)
				.getRoot();

		Node node = lowestCommonAncestor(root, 15, 35);
		System.out.println("Lowest Common Ancestor - " + node.data);
	}
}