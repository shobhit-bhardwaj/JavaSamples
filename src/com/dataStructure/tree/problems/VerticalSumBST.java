package com.dataStructure.tree.problems;

import java.util.HashMap;
import java.util.Map;

import com.dataStructure.tree.BSTInsertionDemo;
import com.dataStructure.tree.BSTInsertionDemo.Node;

public class VerticalSumBST {
	private Map<Integer, Integer> map = new HashMap<>();

	public void printVerticalSum(Node root, int order) {
		if(root == null)
			return;

		map.put(order, (map.containsKey(order)?map.get(order):0) + root.getData());
		printVerticalSum(root.getLeft(), order-1);
		printVerticalSum(root.getRight(), order+1);
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);
		Node root = insertion.getRoot();

		VerticalSumBST bst = new VerticalSumBST();
		bst.printVerticalSum(root, 0);
		System.out.println(bst.map);
	}
}