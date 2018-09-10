package org.vinod.corejava.geeksforgeeks;

import java.util.Scanner;

public class SubArrayWithGivenSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfTests = scanner.nextInt();
		int[][] tests = new int[numberOfTests][];
		int[] sums = new int[numberOfTests];
		for (int i = 0; i < numberOfTests; i++) {
			int size = scanner.nextInt();
			int sum = scanner.nextInt();
			sums[i] = sum;
			int[] array = new int[size];
			for (int j = 0; j < size; j++) {
				array[j] = scanner.nextInt();
			}
			tests[i] = array;
		}

		for (int i = 0; i < numberOfTests; i++) {
			findIndexesOfSum(sums[i], tests[i]);
		}
		scanner.close();
	}

	private static void findIndexesOfSum(int sum, int[] array) {
		for (int i = 0; i < array.length; i++) {
			int aquiredSum = 0;
			boolean found = false;
			aquiredSum += array[i];
			for (int j = i + 1; j < array.length; j++) {
				aquiredSum += array[j];
				if (aquiredSum > sum) {
					break;
				} else if (aquiredSum == sum) {
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.println(j + 1);
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
	}
}