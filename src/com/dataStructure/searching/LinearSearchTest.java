package com.dataStructure.searching;

public class LinearSearchTest {
	public int search(int[] array, int data) {
		int index = -1;

		int length = array.length;
		for(int i=0; i<length; i++) {
			if(array[i] == data) {
				index = i;
				break;
			}
		}

		return index;
	}

	public static void main(String[] args) {
		LinearSearchTest search = new LinearSearchTest();

		int[] array = new int[]{43, 54, 21, 12, 58, 76, 38, 26, 15, 66};
		int index = search.search(array, 76);
		System.out.println("Index of Search Element - "+index);
	}
}