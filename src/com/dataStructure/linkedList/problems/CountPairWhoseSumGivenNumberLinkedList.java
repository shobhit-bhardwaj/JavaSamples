package com.dataStructure.linkedList.problems;

public class CountPairWhoseSumGivenNumberLinkedList {
	private static int countPair(Node head1, Node head2, int sum) {
		int count = 0;

		Node first = head1;
		while(first != null) {
			Node second = head2;
			while(second != null) {
				if((first.data + second.data) == sum) {
					count++;
				}
				second = second.next;
			}
			first = first.next;
		}

		return count;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head1 = linkedList
				.insertData(4)
				.insertData(3)
				.insertData(5)
				.insertData(7)
				.insertData(11)
				.insertData(2)
				.insertData(1)
				.getHead();
		System.out.println(linkedList);

		linkedList = new SinglyLinkedList();
		Node head2 = linkedList
				.insertData(2)
				.insertData(3)
				.insertData(4)
				.insertData(5)
				.insertData(6)
				.insertData(8)
				.insertData(12)
				.getHead();
		System.out.println(linkedList);

		int count = countPair(head1, head2, 9);
		System.out.println("Count is - " + count);
	}
}