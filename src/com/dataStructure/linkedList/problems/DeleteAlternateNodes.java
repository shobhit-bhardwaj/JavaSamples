package com.dataStructure.linkedList.problems;

public class DeleteAlternateNodes {
	private static Node deleteAlternateNodes(Node head) {
		//	Using for loop
		for(Node node=head; (node!=null && node.next!=null); node=node.next) {
			node.next = node.next.next;
		}

		//	Using while loop
		/*
		Node node = head;
		while(node != null && node.next != null) {
			node.next = node.next.next;
			node = node.next;
		}*/

		return head;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(60)
				.insertData(70)
				.insertData(80)
				.insertData(90)
				//.insertData(100)
				.getHead();
		SinglyLinkedList.traverse(head);

		head = deleteAlternateNodes(head);
		SinglyLinkedList.traverse(head);
	}
}