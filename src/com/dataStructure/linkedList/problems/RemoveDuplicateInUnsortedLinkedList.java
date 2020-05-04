package com.dataStructure.linkedList.problems;

public class RemoveDuplicateInUnsortedLinkedList {
	private static Node removeDuplicateUsingTwoLoops(Node head) {
		Node node1 = head;
		Node node2;

		while(node1.next != null) {
			node2 = node1;

			while(node2.next != null) {
				if(node1.data == node2.next.data) {
					node2.next = node2.next.next;
				} else
					node2 = node2.next;
			}

			node1 = node1.next;
		}

		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(40)
				.insertData(20)
				.insertData(40)
				.insertData(10)
				.insertData(80)
				.insertData(60)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(40)
				.insertData(10)
				.insertData(80)
				.insertData(60)
				.insertData(60)
				.getHead();
		System.out.println(linkedList);

		head = removeDuplicateUsingTwoLoops(head);
		SinglyLinkedList.traverse(head);
	}
}