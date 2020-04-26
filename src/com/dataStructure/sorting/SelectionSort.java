package com.dataStructure.sorting;

import java.util.Arrays;

/*
 * Complexity - O(n2)
 */
public class SelectionSort {
	public static void sort(int[] array) {
		int length = array.length;

		for(int i=0; i<length-1; i++) {
			for(int j=i+1; j<length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{43, 54, 21, 12, 58, 76, 38, 26, 15, 66};

		sort(array);

		System.out.println(Arrays.toString(array));
	}
}