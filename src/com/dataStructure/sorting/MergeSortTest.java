package com.dataStructure.sorting;

public class MergeSortTest {
	public void sort(int[] array, int low, int high) {
		if(low < high) {
			int middle = (low + high) / 2;
			sort(array, low, middle);
			sort(array, middle + 1, high);

			merge(array, low, middle, high);
		}
	}

	public void merge(int[] array, int low, int middle, int high) {
		int n1 = middle - low + 1;
		int n2 = high - middle;

		int[] lowArray = new int[n1];
		for(int i=0; i<n1; i++)
			lowArray[i] = array[low + i];

		int[] highArray = new int[n2];
		for(int i=0; i<n2; i++)
			highArray[i] = array[middle + 1 + i];

		int i=0, j=0, k=low;
		while(i < n1 && j < n2) {
			if(lowArray[i] <= highArray[j]) {
				array[k] = lowArray[i];
				i++;
			} else {
				array[k] = highArray[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			array[k] = lowArray[i];
			i++;
			k++;
		}
		while(j < n2) {
			array[k] = highArray[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		MergeSortTest sort = new MergeSortTest();

		int[] array = new int[]{43, 54, 21, 12, 58, 76, 38, 26, 15, 66};
		sort.sort(array, 0, array.length - 1);
		for(int value : array)
			System.out.print(value + "\t");
	}
}