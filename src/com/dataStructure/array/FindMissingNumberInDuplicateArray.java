package com.dataStructure.array;

public class FindMissingNumberInDuplicateArray {
	public int findMissingNumberUsingSum(int[] array1, int[] array2) {
		int result = 0;
		for(int a : array1)
			result += a;
		for(int a : array2)
			result -= a;

		return result;
	}

	public int findMissingNumberUsingXOR(int[] array1, int[] array2) {
		int result = 0;

		for(int a : array1)
			result = result ^ a;
		for(int a : array2)
			result = result ^ a;

		return result;
	}

	public static void main(String[] args) {
		int[] array1 = new int[]{9, 7, 8, 5, 4, 6, 2, 3, 1};
		int[] array2 = new int[]{2, 4, 3, 9, 1, 8, 5, 6};

		System.out.print("Initial Array1 -\t");
		for(int a : array1)
			System.out.print(a + "\t");
		System.out.println();

		System.out.print("Initial Array2 -\t");
		for(int a : array2)
			System.out.print(a + "\t");
		System.out.println();

		int missingNumber = new FindMissingNumberInDuplicateArray().findMissingNumberUsingSum(array1, array2);
		System.out.println("Missing Number Using Sum - "+missingNumber);

		missingNumber = new FindMissingNumberInDuplicateArray().findMissingNumberUsingXOR(array1, array2);
		System.out.println("Missing Number Using XOR - "+missingNumber);
	}
}