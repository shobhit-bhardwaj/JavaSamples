package com.dataStructure.tree.problems;

import java.util.Stack;

import com.dataStructure.tree.BSTInsertionDemo;
import com.dataStructure.tree.BSTInsertionDemo.Node;

public class TopViewOfBST {
	public void printTopView(Node root) {
		Stack<Integer> stack = new Stack<>();
		Node temp = root;
		while(temp != null) {
			stack.add(temp.getData());
			temp = temp.getLeft();
		}
		while(!stack.isEmpty())
			System.out.print(stack.pop()+" ");

		temp = root.getRight();
		while(temp != null) {
			System.out.print(temp.getData()+" ");
			temp = temp.getRight();
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

		TopViewOfBST bst = new TopViewOfBST();
		bst.printTopView(root);
	}
}