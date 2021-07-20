package com.dataStructure.linkedList.problems;

public class CountPairWhoseSumGivenNumberLinkedList {
	private static int countPair(Node head1, Node head2, int sum) {
		int count = 0;

		//	Using for loop
		for(Node temp1=head1; temp1!=null;temp1=temp1.next) {
			for(Node temp2=head2; temp2!=null;temp2=temp2.next) {
				if(temp1.data + temp2.data == sum)
					count++;
			}
		}

		count = 0;
		//	Using while loop
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
		Node head1 = new SinglyLinkedList()
				.insertData(4)
				.insertData(3)
				.insertData(5)
				.insertData(7)
				.insertData(11)
				.insertData(2)
				.insertData(1)
				.getHead();
		SinglyLinkedList.traverse(head1);

		Node head2 = new SinglyLinkedList()
				.insertData(2)
				.insertData(3)
				.insertData(4)
				.insertData(5)
				.insertData(6)
				.insertData(8)
				.insertData(12)
				.getHead();
		SinglyLinkedList.traverse(head2);

		int count = countPair(head1, head2, 9);
		System.out.println("Count is - " + count);
	}
}