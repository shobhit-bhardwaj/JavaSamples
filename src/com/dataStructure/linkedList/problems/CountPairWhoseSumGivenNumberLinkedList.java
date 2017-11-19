package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class CountPairWhoseSumGivenNumberLinkedList {
	public int countPair(Node head1, Node head2, int sum) {
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
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(4);
		linkedList.insertData(3);
		linkedList.insertData(5);
		linkedList.insertData(7);
		linkedList.insertData(11);
		linkedList.insertData(2);
		linkedList.insertData(1);
		Node head1 = linkedList.getHead();
		linkedList.traverse(head1);

		linkedList = new LinkedListDemo();
		linkedList.insertData(2);
		linkedList.insertData(3);
		linkedList.insertData(4);
		linkedList.insertData(5);
		linkedList.insertData(6);
		linkedList.insertData(8);
		linkedList.insertData(12);
		Node head2 = linkedList.getHead();
		linkedList.traverse(head2);

		CountPairWhoseSumGivenNumberLinkedList list = new CountPairWhoseSumGivenNumberLinkedList();
		int count = list.countPair(head1, head2, 9);
		System.out.println("Count is - "+count);
	}
}