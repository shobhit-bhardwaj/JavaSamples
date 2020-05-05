package com.dataStructure.linkedList.problems;

public class IntersectionPointOfTwoLinkedList {
	private static Node intersectionPoint(Node head1, Node head2) {
		int length1 = 0;
		for(Node node=head1; node!=null; node=node.next)
			length1++;

		int length2 = 0;
		for(Node node=head2; node!=null; node=node.next)
			length2++;

		int difference = Math.abs(length1 - length2);
		if(length1 > length2) {
			for(int i=0; i<difference; i++)
				head1 = head1.next;
		} else {
			for(int i=0; i<difference; i++)
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
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head1 = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(60)
				.insertData(70)
				.insertData(80)
				.insertData(90)
				.getHead();
		System.out.println(linkedList);

		linkedList = new SinglyLinkedList();
		Node head2 = linkedList.insertData(10)
				.insertData(20)
				.getHead();
		head2.next.next = head1.next.next.next.next.next.next;
		System.out.println(linkedList);

		Node node = intersectionPoint(head1, head2);
		System.out.println("Intersection Node - " + node.data);
	}
}