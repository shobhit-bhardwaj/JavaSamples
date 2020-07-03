package com.dataStructure.tree;

import java.util.HashMap;
import java.util.Map;

public class HorizontalSumBST {
	private static final Map<Integer, Integer> SUM_MAP = new HashMap<>();

	private static void printHorizontalSum(Node root, int order) {
		if(root == null)
			return;

		SUM_MAP.put(order, (SUM_MAP.containsKey(order) ? SUM_MAP.get(order) : 0) + root.data);

		printHorizontalSum(root.left, order+1);
		printHorizontalSum(root.right, order+1);
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		Node root = bst.insertData(10)
				.insertData(2)
				.insertData(5)
				.insertData(20)
				.insertData(15)
				.getRoot();

		printHorizontalSum(root, 0);
		System.out.println(SUM_MAP);
	}
}