package com.leetcode;

public class ReverseInteger {
	public int reverse(int x) {
		boolean negative = false;
		if(x < 0) {
			negative = true;
			x = -x;
		}

		long c = 0;
		while (x > 0) {
			int b = x % 10;
			c = c * 10 + b;
			if(c > Integer.MAX_VALUE)
				return 0;
			x = x/10;
		}

		return negative ? (int) -c : (int) c;
	}

	public static void main(String[] args) {
		int reverse = new ReverseInteger().reverse(12345);
		System.out.println(reverse);
	}
}