package com.dataStructure.tree;

import java.util.Stack;

import com.dataStructure.tree.BSTInsertionDemo.Node;

public class BSTPreorderIterative {
	public void preorderIterative(Node root) {
		if(root == null)
			return;

		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.print(node.getData()+"\t");
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
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

		BSTPreorderIterative preorder = new BSTPreorderIterative();
		preorder.preorderIterative(root);
	}
}