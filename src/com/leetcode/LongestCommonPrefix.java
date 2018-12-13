package com.leetcode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		char[] prefix = null;
		int length = -1;
		for(String str : strs) {
			if(length == 0)
				return "";

			if(prefix == null) {
				prefix = str.toCharArray();
				length = str.length();
			} else {
				int count = 0;
				int maxCount = Math.min(length, str.length());
				for(int i=0; i<maxCount; i++)
					if(prefix[count] == str.charAt(count))
						count++;
				length = count;
			}
		}

		if(length <= 0)
			return "";

		return new String(prefix, 0, length);
	}

	public static void main(String[] args) {
		String prefix = new LongestCommonPrefix().longestCommonPrefix(new String[] { "flower", "flow", "flight"});
		System.out.println(prefix);
	}
}