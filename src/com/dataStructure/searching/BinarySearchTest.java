package com.dataStructure.searching;

public class BinarySearchTest {
	public int search(int array[], int low, int high, int data) {
		if(low <= high) {
			//int mid = (low + high) / 2;
			int mid = low + (high-low)/2;
			if(array[mid] == data)
				return mid;
			else {
				if(array[mid] > data)
					return search(array, low, mid-1, data);
				else
					return search(array, mid+1, high, data);
			}
		}

		return -1;
	}

	public static void main(String args[]) {
		BinarySearchTest search = new BinarySearchTest();

		int[] array = new int[]{12, 15, 21, 26, 38, 43, 54, 58, 66, 76};
		int index = search.search(array, 0, array.length-1, 26);
		System.out.println("Index of Search Element - "+index);
	}
}