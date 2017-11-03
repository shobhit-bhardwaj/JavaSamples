package com.dataStructure.sorting;

public class BubbleSortTest {
	public void sort(int[] array) {
		int length = array.length;

		for(int i=0; i<length-1; i++) {
			for(int j=0; j<length-i-1; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		BubbleSortTest sort = new BubbleSortTest();

		int[] array = new int[]{43, 54, 21, 12, 58, 76, 38, 26, 15, 66};
		sort.sort(array);
		for(int value : array)
			System.out.print(value + "\t");
	}
}