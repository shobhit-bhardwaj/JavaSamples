package com.dataStructure.dynamicProgramming;

public class SubsetSumProblem {
	public static boolean subsetSumProblem(int[] array, int sum) {
		boolean[][] solution = new boolean[array.length+1][sum+1];

		for(int i=0; i<=sum; i++)
			solution[0][i] = false;
		for(int i=0; i<=array.length; i++)
			solution[i][0] = true;

		for(int i=1; i<=array.length; i++) {
			for(int j=1; j<=sum; j++) {
				solution[i][j] = solution[i-1][j];
				if(solution[i][j] == false && j>=array[i-1])
					solution[i][j] = solution[i][j] || solution[i-1][j-array[i-1]];
			}
		}

		return solution[array.length][sum];
	}

	public static void main(String[] args) {
		int[] array = new int[]{3, 5, 7, 8};
		int sum = 13;

		boolean isValid = subsetSumProblem(array, sum);
		System.out.println("Subset Sum - "+isValid);
	}
}