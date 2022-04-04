package com.sorting;


import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
         arr[i]= sc.nextInt();
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 5 3 4 1 2   length=5
    // 0 1 2 3 4
    // i=0 j=i+1
    // i=0 1 2 3   length-2; i<=n-2
    // j=1 2 3 4    j>0
    // 5 | 3 4 1 2
    // 3 5 | 4 1 2
    // 3 4 5 | 1 2
    // 1 3 4 5 | 2
    // 1 2 3 4 5 |
    // for every index put that independent at the correct of LHS
   static void insertionSort(int[] arr){
       for (int i = 0; i < arr.length-1; i++){
           for (int j = i+1; j>0; j--) {
               if(arr[j]<arr[j-1]) {
                   swap(arr, j, j - 1);
               }
               else
                   break;
           }
       }
   }
     static void swap(int[] arr, int current,int correct) {
        int temp=arr[current];
        arr[current]=arr[correct];
        arr[correct]=temp;

    }
}
