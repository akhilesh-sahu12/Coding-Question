package com.sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        // quick sort= move smaller elements to left of pivot
        //             recursively divide array in 2 partition
        //  Run Time Complexity => Best Case O(n log (n))
        //                         Average Case O(n log (n))
        //                         Worst Case O(n^2) if already array is sorted
        // Space Complexity => O(log(n)) Due to recursion

        //
        // if(arr[low]<arr[pivot])
        // if(arr[high]>arr[pivot])
        // if(arr[low] & arr[high]) can not move
        //              then Swap(arr[low] & arr[high])
        // if low>high
        //          then Swap(arr[high] & arr[pivot])
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSorting(arr, 0,n-1 );
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void quickSorting(int[] arr, int low, int high) {
        if (low >= high)
            return;
            int pivot = partition(arr, low, high);
            quickSorting(arr, low, high - 1);
            quickSorting(arr, pivot + 1, high);
    }
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
               swap(arr,i,j);
            }

        }
        swap(arr,i+1,high);
        return i+1;
    }
    static  void  swap(int arr[], int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }
    }
