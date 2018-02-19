package com.dataStructure.array;

public class LeadersInArray {
	public void leadersInArray(int[] array) {
		for(int i=array.length-2; i>=0; i--) {
			int element = array[i];
			int prevElement = array[i+1];
			if(element > prevElement)
				System.out.print(element+"\t");
		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{98, 23, 54, 12, 20, 7, 27};

		System.out.print("Initial Array -\t");
		for(int a : array)
			System.out.print(a + "\t");
		System.out.println();

		System.out.print("Leaders in Array -\t");
		new LeadersInArray().leadersInArray(array);
	}
}