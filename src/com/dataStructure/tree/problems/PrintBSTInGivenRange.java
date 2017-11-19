package com.dataStructure.tree.problems;

import com.dataStructure.tree.BSTInsertionDemo;
import com.dataStructure.tree.BSTInsertionDemo.Node;

public class PrintBSTInGivenRange {
	public void printInGivenRange(Node root, int n1, int n2) {
		if(root == null)
			return;

		printInGivenRange(root.getLeft(), n1, n2);
		if(root.getData() >= n1 && root.getData() <= n2)
			System.out.print(root.getData()+"\t");
		printInGivenRange(root.getRight(), n1, n2);
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(1);
		insertion.insertData(3);
		insertion.insertData(4);
		insertion.insertData(20);
		insertion.insertData(15);
		Node root = insertion.getRoot();

		PrintBSTInGivenRange bst = new PrintBSTInGivenRange();
		bst.printInGivenRange(root, 3, 15);
	}
}