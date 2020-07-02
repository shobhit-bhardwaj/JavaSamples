package com.dataStructure.tree;

class Node {
	public int data;
	public Node left;
	public Node right;

	public Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public Node getLeft() {
		return left;
	}

	public Node getRight() {
		return right;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
	}
}

public class BinarySearchTree {
	private Node root;

	public BinarySearchTree insertData(int data) {
		Node node = new Node(data);
		if(root == null)
			root = node;
		else {
			Node current = root, parent = null;
			while(current != null) {
				parent = current;
				if(data <= current.data)
					current = current.left;
				else
					current = current.right;
			}
			if(data <= parent.data)
				parent.left = node;
			else
				parent.right = node;
		}

		return this;
	}

	public Node getRoot() {
		return root;
	}

	public void test() {
		insertData(10);
		insertData(2);
		insertData(5);
		insertData(20);
		insertData(15);
	}

	public static void main(String[] args) {
		new BinarySearchTree().test();
	}
}