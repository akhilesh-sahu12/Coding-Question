package com.sorting;
import java.util.*;
public class SelectionSort {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Selection sort : Search through an array and keep track of the maximum value during
    //                  each iteration, At the end of each iteration, we swap the values
    // Time Complexity (Worst Case): O(n^2) where n is numbers of elements
    // Space Complexity : O(1) ->(constant Space)
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int last= arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

     static int getMaxIndex(int[] arr, int start, int end){
        int max=start;
        for (int i = 0; i <=end ; i++){
             if(arr[max]<arr[i])
                 max=i;
        }
         return max;
     }
    static void swap( int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
