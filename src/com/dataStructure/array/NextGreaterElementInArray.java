package com.dataStructure.array;

import java.util.Stack;

public class NextGreaterElementInArray {
	public void nextGreaterElementInArray2Loop(int[] array) {
		int length = array.length;

		for(int i=0; i<length; i++) {
			boolean found = false;

			int element = array[i];
			for(int j=i+1; j<length; j++) {
				if(array[j] > element) {
					System.out.println("Next Greater Element of "+element+" - "+array[j]);
					found = true;
					break;
				}
			}

			if(!found)
				System.out.println("Next Greater Element of "+element+" - NULL");
		}
	}

	public void nextGreaterElementInArrayUsingStack(int[] array) {
		int length = array.length;
		Stack<Integer> stack = new Stack<>();

		for(int i=0; i<length; i++) {
			int element = array[i];

			while(!stack.isEmpty() && stack.peek() < element) {
				System.out.println("Next Greater Element of "+stack.pop()+" - "+element);
			}
			stack.push(element);
		}

		while(!stack.isEmpty())
			System.out.println("Next Greater Element of "+stack.pop()+" - NULL");
	}

	public static void main(String[] args) {
		int[] array = new int[]{98, 23, 54, 12, 20, 7, 27};

		System.out.print("Initial Array -\t");
		for(int a : array)
			System.out.print(a + "\t");
		System.out.println();

		System.out.println("Next Greater Element in Array -");
		//new NextGreaterElementInArray().nextGreaterElementInArray2Loop(array);
		new NextGreaterElementInArray().nextGreaterElementInArrayUsingStack(array);
	}
}