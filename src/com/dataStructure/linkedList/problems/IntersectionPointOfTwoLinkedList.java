package com.dataStructure.linkedList.problems;

public class IntersectionPointOfTwoLinkedList {
	private static Node intersectionPoint(Node head1, Node head2) {
		int len1 = 0;
		for(Node temp=head1; temp!=null; temp=temp.next)
			len1++;

		int len2 = 0;
		for(Node temp=head2; temp!=null; temp=temp.next)
			len2++;

		int diff = Math.abs(len1 - len2);
		if(len1 > len2) {
			for(int i=0; i<diff; i++)
				head1 = head1.next;
		} else {
			for(int i=0; i<diff; i++)
				head2 = head2.next;
		}

		while(head1 != null && head2 != null) {
			if(head1 == head2)
				return head1;

			head1 = head1.next;
			head2 = head2.next;
		}

		return null;
	}

	public static void main(String[] args) {
		Node head1 = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(60)
				.insertData(70)
				.insertData(80)
				.insertData(90)
				.getHead();
		SinglyLinkedList.traverse(head1);

		Node head2 = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.getHead();
		head2.next.next = head1.next.next.next.next.next.next;
		SinglyLinkedList.traverse(head2);

		Node node = intersectionPoint(head1, head2);
		System.out.println("Intersection Node - " + node.data);
	}
}