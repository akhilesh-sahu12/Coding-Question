package com.searching;

import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }

     static int binarySearch(int[] arr, int target) {
        if(target>arr[arr.length-1]){
            return -1;
        }
        int l=0;
        int r=arr.length-1;
        while(l<=r){
           int mid=l+(r-l)/2;

             if(arr[mid]>target){
                r=mid-1;
             }
            else if (arr[mid]<target) {
                l=mid+1;
            }
            else
            {
                return mid;
            }

        }
        return l;
    }
}
