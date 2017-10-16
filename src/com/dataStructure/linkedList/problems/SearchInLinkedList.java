package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class SearchInLinkedList {
	public Node searchDataIterative(Node node, int key) {
		Node temp;
		for(temp=node; temp.getNext()!=null; temp=temp.getNext()) {
			if(temp.getData() == key)
				return temp;
		}

		return null;
	}

	public Node searchDataRecursive(Node node, int key) {
		if(node == null)
			return null;

		if(node.getData() == key)
			return node;
		else
			return searchDataRecursive(node.getNext(), key);
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);

		Node head = linkedList.getHead();

		SearchInLinkedList search = new SearchInLinkedList();
		Node node = search.searchDataIterative(head, 40);
		System.out.println("Search Iterative - "+node);
		node = search.searchDataRecursive(head, 30);
		System.out.println("Search Recursive - "+node);
	}
}