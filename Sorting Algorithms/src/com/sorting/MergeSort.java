package com.sorting;

import java.util.*;
public class MergeSort {
	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,1};
		mergeSort(arr, 0, arr.length-1 );

		System.out.println(Arrays.toString(arr));
	}
	static void mergeSort(int[] arr, int l, int r) {
		if (r-l==1) {
			return;
		}
			int mid = (l + r ) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid , r);

			merge(arr, l, mid, r);


	}

	static void merge(int[] arr, int l, int mid, int r) {
		int mergeArray[]=new int[r-l];
		int i = l;
		int j = mid;
		int k = 0;
		while (l < mid && j < r) {
			if (arr[i] < arr[j]) {
				mergeArray[k] = arr[i];
				i++;
			} else {
				mergeArray[k] = arr[j];
				j++;
			}
			k++;
		}
		while (i < mid) {
			mergeArray[k] = arr[i];
			i++;
			k++;
		}
		while (j < r) {
			mergeArray[k] = arr[j];
			k++;
			j++;
		}
		for (int o = 0; o < mergeArray.length; o++) {
			arr[l+r]=mergeArray[o];
		}
	}

}

