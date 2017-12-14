package com.dataStructure.dynamicProgramming;

public class LongestCommonSubsequence {
	public static int lca(char[] a, char[] b, int m, int n) {
		if(m == 0 || n == 0)
			return 0;

		if(a[m-1] == b[n-1])
			return 1 + lca(a, b, m-1, n-1);
		else
			return Math.max(lca(a, b, m-1, n), lca(a, b, m, n-1));
	}

	public static void main(String[] args) {
		String a = "ABCDGH";
		String b = "AEDFHR";

		int length = lca(a.toCharArray(), b.toCharArray(), a.length(), b.length());
		System.out.println("Length of LCS - "+length);
	}
}