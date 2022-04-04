package com.searching;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res=linearSearch(arr,n,target);
        System.out.println(res);
    }
   static int linearSearch(int[] arr, int n,int target) {
        for(int i=0; i<n; i++) {
            if (target == arr[i])
                return i;
        }
            return -1;
    }

}
