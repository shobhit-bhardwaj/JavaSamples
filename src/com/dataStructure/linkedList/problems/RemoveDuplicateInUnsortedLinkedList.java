package com.dataStructure.linkedList.problems;

public class RemoveDuplicateInUnsortedLinkedList {
	private static Node removeDuplicateUsingTwoLoops(Node head) {
		for(Node node1 = head; node1.next!=null; node1=node1.next) {
			for(Node node2 = node1; node2.next!=null;) {
				if(node1.data == node2.next.data) {
					node2.next = node2.next.next;
				} else
					node2 = node2.next;
			}
		}

		return head;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(40)
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
		SinglyLinkedList.traverse(head);

		head = removeDuplicateUsingTwoLoops(head);
		SinglyLinkedList.traverse(head);
	}
}