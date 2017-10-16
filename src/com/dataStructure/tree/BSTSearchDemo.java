package com.dataStructure.tree;

import com.dataStructure.tree.BSTInsertionDemo.Node;

public class BSTSearchDemo {
	public Node search(Node node, int key) {
		if(node == null)
			return null;
		else {
			if(node.getData() == key)
				return node;
			else if(node.getData() < key)
				return search(node.getRight(), key);
			else
				return search(node.getLeft(), key);
		}
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);

		Node root = insertion.getRoot();

		BSTSearchDemo search = new BSTSearchDemo();
		Node node = search.search(root, 20);
		System.out.println(node);
	}
}