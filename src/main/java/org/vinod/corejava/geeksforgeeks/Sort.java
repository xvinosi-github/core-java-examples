package org.vinod.corejava.geeksforgeeks;

import java.util.Arrays;

public class Sort {

	public int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minimumIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minimumIndex] > arr[j]) {
					minimumIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minimumIndex];
			arr[minimumIndex] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		Sort s = new Sort();
		int arr[] = { 64, 25, 12, 22, 11 };
		s.selectionSort(arr);
		System.out.println("After Selection Sort" + Arrays.toString(arr));

		int arr1[] = { 25, 64, 22, 28, 11 };
		s.bubbleSort(arr1);
		System.out.println("After Bubble Sort" + Arrays.toString(arr1));

		int arr2[] = { 25, 64, 22, 28, 11, 68, 120, 1, 8, 15 };
		s.mergeSort(arr2, 0, arr2.length - 1);
		System.out.println("After Bubble Sort" + Arrays.toString(arr2));

	}

	private void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, l);
			
			merge(arr, l , m , r);
		}

	}

	private void merge(int[] arr, int l, int m, int r) {
		int size1 = m-l+1;
		int size2 = r-m;
		
		
		
	}

	private int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		return arr;
	}

}
