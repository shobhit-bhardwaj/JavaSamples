package com.dataStructure.sorting;

public class InsertionSortTest {
	public void sort(int[] array) {
		int length = array.length;

		for(int i=1; i<length; i++) {
			int key = array[i];
			int j = i-1;
			while(j>=0 && array[j]>key) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}
	}

	public static void main(String[] args) {
		InsertionSortTest sort = new InsertionSortTest();

		int[] array = new int[]{43, 54, 21, 12, 58, 76, 38, 26, 15, 66};
		sort.sort(array);
		for(int value : array)
			System.out.print(value + "\t");
	}
}