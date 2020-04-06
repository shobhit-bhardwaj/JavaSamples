package com.collection;

import java.util.Arrays;

public class ArrayEqualsAndDeepEqualsMethods {
	public static void main(String[] args) {
		Integer[] array1 = new Integer[] {1, 2, 3, 4, 5};
		System.out.println("Array 1 - " + Arrays.toString(array1));

		Integer[] array2 = new Integer[] {1, 2, 3, 4, 5};
		System.out.println("Array 2 - " + Arrays.toString(array2));

		System.out.println("Arrays equals() - " + Arrays.equals(array1, array2));			//	Works on Primitive and Object Array - int[]
		System.out.println("Arrays deepEquals() - " + Arrays.deepEquals(array1, array2));		//	Works on Object Array Only - Integer[]
		System.out.println();

		array1 = new Integer[] {1, 3, 2, 4, 5};
		System.out.println("Array 1 - " + Arrays.toString(array1));

		array2 = new Integer[] {1, 2, 3, 4, 5};
		System.out.println("Array 2 - " + Arrays.toString(array2));

		System.out.println("Arrays equals() - " + Arrays.equals(array1, array2));
		System.out.println("Arrays deepEquals() - " + Arrays.deepEquals(array1, array2));
	}
}