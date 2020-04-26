package com.dataStructure.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void sort(int[] array, int low, int high) {
		if(low < high) {
			int pi = partition(array, low, high);

			sort(array, low, pi-1);
			sort(array, pi+1, high);
		}
	}

	private static int partition(int[] array, int low, int high) {
		int i = low - 1;
		int pivot = array[high];

		for(int j=low; j<high; j++) {
			if(array[j] <= pivot) {
				i++;

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;

		return i+1;
	}

	public static void main(String[] args) {
		int[] array = new int[]{43, 54, 21, 12, 58, 76, 38, 26, 15, 66};

		sort(array, 0, array.length - 1);

		System.out.println(Arrays.toString(array));
	}
}