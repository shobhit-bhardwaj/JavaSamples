package com.dataStructure.sorting;

public class SelectionSortTest {
	public void sort(int[] array) {
		int length = array.length;

		for(int i=0; i<length; i++) {
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
		SelectionSortTest sort = new SelectionSortTest();

		int[] array = new int[]{43, 54, 21, 12, 58, 76, 38, 26, 15, 66};
		sort.sort(array);
		for(int value : array)
			System.out.print(value + "\t");
	}
}