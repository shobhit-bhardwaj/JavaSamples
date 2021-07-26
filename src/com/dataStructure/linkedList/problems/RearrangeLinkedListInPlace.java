package com.dataStructure.linkedList.problems;

public class RearrangeLinkedListInPlace {
	private static Node rearrange(Node head) {
		Node node1 = head;
		while(node1 != null) {
			Node node2 = node1.next;
			if(node2 == null || node2.next == null)
				break;

			while(node2.next.next != null)
				node2 = node2.next;

			Node temp = node2.next;
			node2.next = null;
			temp.next = node1.next;
			node1.next = temp;
			node1 = node1.next.next;
		}

		return head;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				//.insertData(60)
				.getHead();
		SinglyLinkedList.traverse(head);

		head = rearrange(head);
		SinglyLinkedList.traverse(head);
	}
}