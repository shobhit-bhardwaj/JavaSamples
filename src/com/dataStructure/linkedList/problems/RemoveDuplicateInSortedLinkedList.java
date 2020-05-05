package com.dataStructure.linkedList.problems;

public class RemoveDuplicateInSortedLinkedList {
	private static Node removeDuplicate(Node head) {
		Node node = head;
		while(node.next != null) {
			if(node.data == node.next.data)
				node.next = node.next.next;
			else
				node = node.next;
		}

		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(30)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(60)
				.insertData(60)
				.insertData(70)
				.insertData(70)
				.getHead();
		System.out.println(linkedList);

		head = removeDuplicate(head);
		SinglyLinkedList.traverse(head);
	}
}