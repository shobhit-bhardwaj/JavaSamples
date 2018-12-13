package com.leetcode;

public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		int numLength = nums.length;
		int temp = -1;
		int totalLength = 0;
		for(int i=0; i<numLength; i++) {
			int count = -1;
			int num = nums[i];
			for(int j=i+1; j<numLength; j++) {
				if(nums[j] != num) {
					count = j;
					temp = nums[j];
					break;
				}
			}
			if(count != -1) {
				totalLength = i+1;
				for(int j=totalLength; j<count; j++)
					nums[j] = temp;
			}
		}

		return totalLength + 1;
	}

	public static void main(String[] args) {
		int[] input = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
		int length = new RemoveDuplicatesFromSortedArray().removeDuplicates(input);
		System.out.println(length);
		for (int i=0; i<length; i++)
			System.out.print(input[i] + "\t");
	}
}