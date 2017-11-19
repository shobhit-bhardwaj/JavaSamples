package com.dataStructure.tree;

import java.util.Stack;

import com.dataStructure.tree.BSTInsertionDemo.Node;

public class BSTInorderIterative {
	public void inorderIterative(Node root) {
		if(root == null)
			return;

		Stack<Node> stack = new Stack<>();
		while(true) {
			if(root != null) {
				stack.push(root);
				root = root.getLeft();
			} else {
				if(stack.isEmpty())
					break;
				else {
					root = stack.pop();
					System.out.print(root.getData()+"\t");
					root = root.getRight();
				}
			}
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

		BSTInorderIterative inorder = new BSTInorderIterative();
		inorder.inorderIterative(root);
	}
}