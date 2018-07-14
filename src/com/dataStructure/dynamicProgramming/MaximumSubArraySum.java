package com.dataStructure.dynamicProgramming;

public class MaximumSubArraySum {
	public static int maxSubArraySum(int[] array) {
		int curSum = 0;
		int maxSum = 0;

		boolean hasAllNegativeElement = true;
		int maxNegativeSum = Integer.MIN_VALUE;

		for(int element : array) {
			if(hasAllNegativeElement && element > 0)
				hasAllNegativeElement = false;
			else if(hasAllNegativeElement && element < 0 && maxNegativeSum < element)
				maxNegativeSum = element;

			curSum += element;
			if(curSum < 0)
				curSum = 0;
			if(maxSum < curSum)
				maxSum = curSum;
		}

		return hasAllNegativeElement ? maxNegativeSum : maxSum;
	}

	public static void main(String[] args) {
		int[] array = new int[] { -2, -3, 1, 4, 6, -7, 8, -9 };
		int maxArraySum = maxSubArraySum(array);
		System.out.println("Maximum Sub Array Sum - " + maxArraySum);
	}
}