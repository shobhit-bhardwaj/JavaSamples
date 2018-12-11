package com.leetcode;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int length = nums.length;
		for(int i=0; i<length-1; i++)
			for(int j=i+1; j<length; j++) {
				boolean isSet = (nums[i] + nums[j]) == target;
				if(isSet)
					return new int[]{nums[i], nums[j]};
			}

		return null;
    }

	public static void main(String[] args) {
		int[] output = new TwoSum().twoSum(new int[] {2, 7, 11, 15}, 9);
		System.out.println(output[0] + " - " + output[1]);
	}
}