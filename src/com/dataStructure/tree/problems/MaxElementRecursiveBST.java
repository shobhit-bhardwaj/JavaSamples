package com.dataStructure.tree.problems;

import com.dataStructure.tree.BSTInsertionDemo;
import com.dataStructure.tree.BSTInsertionDemo.Node;

public class MaxElementRecursiveBST {
	public int maxInBST(Node root) {
		if(root ==  null)
			return -1;

		int maxValue = Integer.MIN_VALUE;
		int maxLeft = maxInBST(root.getLeft());
		int maxRight = maxInBST(root.getRight());
		if(maxLeft > maxRight)
			maxValue = maxLeft;
		else
			maxValue = maxRight;

		if(root.getData() > maxValue)
			maxValue = root.getData();

		return maxValue;
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);
		Node root = insertion.getRoot();

		MaxElementRecursiveBST bst = new MaxElementRecursiveBST();
		int maxElement = bst.maxInBST(root);
		System.out.println("Max Element - "+maxElement);
	}
}