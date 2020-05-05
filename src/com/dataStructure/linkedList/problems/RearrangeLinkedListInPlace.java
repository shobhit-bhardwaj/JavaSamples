package com.dataStructure.linkedList.problems;

public class RearrangeLinkedListInPlace {
	private static Node rearrange(Node head) {
		Node node = head;
		while(node.next != null) {
			Node second = node;
			while(second.next.next != null) {
				second = second.next;
			}
			Node temp = node.next;
			second.next.next = node.next;
			node.next = second.next;
			second.next = null;
			node = temp;
		}

		return head;
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

		head = rearrange(head);
		SinglyLinkedList.traverse(head);
	}
}