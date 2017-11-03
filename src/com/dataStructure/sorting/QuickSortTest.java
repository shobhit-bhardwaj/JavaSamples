package com.dataStructure.sorting;

public class QuickSortTest {
	public void sort(int[] array, int low, int high) {
		if(low < high) {
			int pi = partition(array, low, high);

			sort(array, low, pi-1);
			sort(array, pi+1, high);
		}
	}

	public int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low-1;
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
		QuickSortTest sort = new QuickSortTest();

		int[] array = new int[]{43, 54, 21, 12, 58, 76, 38, 26, 15, 66};
		sort.sort(array, 0, array.length - 1);
		for(int value : array)
			System.out.print(value + "\t");
	}
}