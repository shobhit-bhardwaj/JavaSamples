package com.dataStructure.array;

public class MaximumSubArraySum {
	public int maxSubArraySum(int[] array) {
		int currSum = 0;
		int maxSum = 0;
		boolean hasAllNegativeElement = true;
		int maxNagetiveSum = Integer.MIN_VALUE;

		for(int i=0; i<array.length; i++) {
			if(hasAllNegativeElement && array[i] > 0)
				hasAllNegativeElement = false;
			else if(hasAllNegativeElement && maxNagetiveSum < array[i])
				maxNagetiveSum = array[i];

			currSum += array[i];
			if(currSum < 0)
				currSum = 0;
			if(currSum > maxSum)
				maxSum = currSum;
		}

		return hasAllNegativeElement ? maxNagetiveSum : maxSum;
	}

	public static void main(String[] args) {
		int[] array = new int[]{2, -9, 5, 1, -4, 6, 0, -7, 8};
		//	int[] array = new int[]{-1, -2, -3, -8, -4};
		int k = 3;

		System.out.print("Initial Array -\t");
		for(int a : array)
			System.out.print(a + "\t");
		System.out.println();

		int maxSubArraySum = new MaximumSubArraySum().maxSubArraySum(array);
		System.out.println("Maximum Sub Array Sum - "+maxSubArraySum);
	}
}