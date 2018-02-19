package com.dataStructure.array;

public class MaximumSubArraySizeK {
	public int maxSubArraySizeK(int[] array, int k) {
		int sum = 0;
		int maxSum = 0;

		for(int i=0; i<k; i++) {
			sum += array[i];
		}

		maxSum = sum;
		int n = k;
		while(n != array.length-1) {
			sum = sum - array[n-k];
			sum = sum + array[n];

			if(sum > maxSum)
				maxSum = sum;

			n++;
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] array = new int[]{11, -8, 16, -7, 24, -2, 3};
		int k = 3;

		System.out.print("Initial Array -\t");
		for(int a : array)
			System.out.print(a + "\t");
		System.out.println();

		int maxSubArray = new MaximumSubArraySizeK().maxSubArraySizeK(array, k);
		System.out.println("Maximum Sub Array - "+maxSubArray);
	}
}