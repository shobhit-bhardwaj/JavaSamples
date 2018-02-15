package com.dataStructure.array;

public class ArrayRotation {
	public void rotateArray(int[] array, int k) {
		int n = array.length;

		if (k > n)
			k = k % n;

		reverseArray(array, 0, k-1);
		reverseArray(array, k, n-1);
		reverseArray(array, 0, n-1);

		System.out.print("Rotate Array -\t");
		for(int a : array)
			System.out.print(a + "\t");
	}

	private void reverseArray(int[] array, int m, int n) {
		while (m < n) {
			int temp = array[m];
			array[m] = array[n];
			array[n] = temp;
			m++;
			n--;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5};
		int k = 3;

		System.out.print("Initial Array -\t");
		for(int a : array)
			System.out.print(a + "\t");
		System.out.println();

		new ArrayRotation().rotateArray(array, k);
	}
}