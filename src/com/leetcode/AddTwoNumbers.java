package com.leetcode;

public class AddTwoNumbers {
	private static class ListNode {
		private int value;
		private ListNode next;

		public ListNode(int value) {
			this.value = value;
		}

		public ListNode(int value, ListNode next) {
			this.value = value;
			this.next = next;
		}

		@Override
		public String toString() {
			return "ListNode [value=" + value + ", next=" + next + "]";
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode lnHead = new ListNode(0);
		ListNode ln = lnHead;

		int carry = 0;
		ListNode node = null;
		while(l1 != null || l2 != null) {
			int value = ((l1 != null) ? l1.value : 0) + ((l2 != null) ? l2.value : 0) + carry;
			if(value >= 10) {
				value = value - 10;
				carry = 1;
			} else
				carry = 0;

			ln.value = value;

			if(l1 != null)
				l1 = l1.next;
			if(l2 != null)
				l2 = l2.next;

			if(l1 != null || l2 != null) {
				node = new ListNode(0);
				ln.next = node;
				ln = ln.next;
			} else {
				if(carry == 1) {
					node = new ListNode(1);
					ln.next = node;
				}
			}
		}

		return lnHead;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
		System.out.println(l1);

		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
		System.out.println(l2);

		/*ListNode l1 = new ListNode(5, null);
		System.out.println(l1);

		ListNode l2 = new ListNode(5, null);
		System.out.println(l2);*/

		ListNode ln = new AddTwoNumbers().addTwoNumbers(l1, l2);
		System.out.println(ln);
	}
}