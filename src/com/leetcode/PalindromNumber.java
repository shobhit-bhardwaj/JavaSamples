package com.leetcode;

public class PalindromNumber {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		String number = String.valueOf(x);
		String reverse = new StringBuilder(number).reverse().toString();

		return number.equals(reverse);
	}

	public static void main(String[] args) {
		boolean palindrome = new PalindromNumber().isPalindrome(12321);
		System.out.println(palindrome);
	}
}