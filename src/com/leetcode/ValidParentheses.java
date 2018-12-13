package com.leetcode;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		int length = s.length();
		if (length % 2 != 0)
			return false;

		Stack<Character> stack = new Stack<>();
		char[] chars = s.toCharArray();
		for (int i=0; i<length; i++) {
			char ch = chars[i];
			if (ch == '[' || ch == '{' || ch == '(')
				stack.push(ch);
			else {
				if (stack.isEmpty())
					return false;

				char pop = stack.pop();
				if (pop == '[' && ch != ']')
					return false;
				else if (pop == '{' && ch != '}')
					return false;
				else if (pop == '(' && ch != ')')
					return false;
			}
		}

		if (!stack.isEmpty())
			return false;

		return true;
	}

	public static void main(String[] args) {
		boolean valid = new ValidParentheses().isValid("()[]{}");
		System.out.println(valid);
	}
}