package com.dataStructure.array;

public class FindPeakElementInArray {
	public int findPeakElement(int[] array) {
		int length = array.length;
		int start = 0;
		int end = length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if ((mid == 0 || array[mid - 1] <= array[mid]) && (mid == length - 1 || array[mid] >= array[mid + 1]))
				return array[mid];
			else if (mid > 0 && array[mid - 1] > array[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] array = new int[]{23, 54, 12, 20, 7, 27, 98};

		System.out.print("Initial Array -\t");
		for(int a : array)
			System.out.print(a + "\t");
		System.out.println();

		int peakElement = new FindPeakElementInArray().findPeakElement(array);
		System.out.print("Peak ELement in Array - " + peakElement);
	}
}