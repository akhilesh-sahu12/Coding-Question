package com.Sorting;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // bubble sort = pairs of adjacent element are compared, and the elements swapped if
    // they are not in order
    // Time Complexity (Worst Case): O(n^2) where n is numbers of elements
    // Space Complexity : O(1) ->(constant Space)
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag=true;
            for (int j =1; j < arr.length-i ; j++) {
                if(arr[j]<arr[j-1]) {
                    swap(arr, j, j - 1);
                    flag = false;
                }
            }
            if(flag) {
                break;
           }
        }
    }
    static void swap( int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    }
