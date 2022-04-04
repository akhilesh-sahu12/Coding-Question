package com.Sorting;


public class MergeSort {
	static void mergeSort(int[] arr, int l, int r) {
		if (l>=r)
			return;
			int mid = (l + r ) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			merge(arr, l, mid, r);


	}

	static void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		int a[] = new int[n1];
		int b[] = new int[n2];
		for (int i = 0; i < n1; i++) {
			a[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			b[j] = arr[mid + 1 + j];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while (l < n1 && j < n2) {
			if (a[i] <= b[j]) {
				arr[k] = a[i];
				i++;
			} else {
				arr[k] = b[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k++] = a[i++];
		//	i++;
		//	k++;
		}
		while (j < n2) {
			arr[k++] = b[j++];
			//k++;
			//j++;
		}
	}
	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,1};
		mergeSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//System.out.println(Arrays.toString(arr));
	}

}

