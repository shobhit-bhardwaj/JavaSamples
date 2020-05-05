package com.dataStructure.linkedList.problems;

public class SearchInLinkedList {
	private static Node searchDataIterative(Node node, int key) {
		Node temp;
		for(temp=node; temp.next!=null; temp=temp.next) {
			if(temp.data == key)
				return temp;
		}

		return null;
	}

	private static Node searchDataRecursive(Node node, int key) {
		if(node == null)
			return null;

		if(node.data == key)
			return node;
		else
			return searchDataRecursive(node.next, key);
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.getHead();
		System.out.println(linkedList);

		Node node = searchDataIterative(head, 40);
		System.out.println("Search Iterative - " + node.getData());

		node = searchDataRecursive(head, 30);
		System.out.println("Search Recursive - " + node.getData());
	}
}