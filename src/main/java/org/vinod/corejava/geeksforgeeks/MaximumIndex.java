package org.vinod.corejava.geeksforgeeks;

import java.util.Scanner;

public class MaximumIndex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		int[][] tests = new int[numberOfTests][];
		for (int i = 0; i < numberOfTests; i++) {
			int size = scanner.nextInt();
			int[] array = new int[size];
			for (int j = 0; j < size; j++) {
				array[j] = scanner.nextInt();
			}
			tests[i] = array;
		}

		for (int i = 0; i < numberOfTests; i++) {
			findIndexesOfArrayWithMaximumDifference(tests[i]);
		}
		scanner.close();
	}

	private static void findIndexesOfArrayWithMaximumDifference(int[] array) {
		int maxDiff = -1;		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					int diff = j - i;
					if (diff > maxDiff) {
						maxDiff = diff;						
					}
				}
			}
		}
		System.out.println(maxDiff);
	}
}