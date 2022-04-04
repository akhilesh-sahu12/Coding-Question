package com.Sorting;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

	int res= creatNumber(n,arr);
        System.out.println(res);
    }

     static int creatNumber(int n, int[] arr) {
       Arrays.sort(arr);
       int num=0;
         for (int i = n-1; i >=0 ; i--) {
             num=num*10+arr[i];
         }
         return num;
    }
}
