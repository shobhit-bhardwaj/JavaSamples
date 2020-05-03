package com.dataStructure.linkedList.problems;

public class DeleteLastOccurenceElement {
	private static Node delete(Node head, int data) {
		Node temp = head;
		Node node = null;
		while(temp != null) {
			if(data == temp.data)
				node = temp;
			temp = temp.next;
		}

		if(node != null) {
			if(node == head)
				head = head.next;
			else {
				temp = head;
				while(temp.next != node)
					temp = temp.next;
				temp.next = temp.next.next;
			}
		}

		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(30)
				.insertData(60)
				.insertData(70)
				.getHead();
		System.out.println(linkedList);

		head = delete(head, 30);
		SinglyLinkedList.traverse(head);
	}
}