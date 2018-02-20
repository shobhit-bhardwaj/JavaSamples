package com.dataStructure.array;

public class FindNumberWhichOccursOddTimes {
	public int findNumberWhichOccursOddTimes(int[] array) {
		int length = array.length;
		int result = 0;

		for(int i=0; i<length; i++) {
			result = result ^ array[i];
		}

		return result;
	}

	public static void main(String[] args) {
		int[] array = new int[]{2, 5, 9, 1, 5, 1, 8, 2, 8};

		System.out.print("Initial Array -\t");
		for(int a : array)
			System.out.print(a + "\t");
		System.out.println();

		int number = new FindNumberWhichOccursOddTimes().findNumberWhichOccursOddTimes(array);
		System.out.println("Number Occurs Odd Times in Array - "+number);
	}
}