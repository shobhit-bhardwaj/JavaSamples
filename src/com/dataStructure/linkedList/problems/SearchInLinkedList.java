package com.dataStructure.linkedList.problems;

public class SearchInLinkedList {
	private static Node searchDataIterative(Node head, int key) {
		Node temp;
		for(temp=head; temp.next!=null; temp=temp.next) {
			if(temp.data == key)
				return temp;
		}

		return null;
	}

	private static Node searchDataRecursive(Node head, int key) {
		if(head == null)
			return null;

		if(head.data == key)
			return head;

		return searchDataRecursive(head.next, key);
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.getHead();
		SinglyLinkedList.traverse(head);

		Node node = searchDataIterative(head, 40);
		System.out.println("Search Iterative - " + node.getData());

		node = searchDataRecursive(head, 30);
		System.out.println("Search Recursive - " + node.getData());
	}
}