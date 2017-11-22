package com.dataStructure.tree.problems;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.dataStructure.tree.BSTInsertionDemo;
import com.dataStructure.tree.BSTInsertionDemo.Node;

public class ReverseLevelOrderTraversalBST {
	public void levelOrderTraversalReverse(Node root) {
		if(root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		Stack<Node> stack = new Stack<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			stack.push(node);
			if(node.getRight() != null)
				queue.add(node.getRight());
			if(node.getLeft() != null)
				queue.add(node.getLeft());
		}

		while(!stack.isEmpty())
			System.out.print(stack.pop().getData()+"\t");
	}

	public static void main(String[] args) {
		BSTInsertionDemo insertion = new BSTInsertionDemo();
		insertion.insertData(10);
		insertion.insertData(2);
		insertion.insertData(5);
		insertion.insertData(20);
		insertion.insertData(15);
		Node root = insertion.getRoot();

		ReverseLevelOrderTraversalBST bst = new ReverseLevelOrderTraversalBST();
		bst.levelOrderTraversalReverse(root);
	}
}