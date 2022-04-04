package com.akhilesh;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int num= sc.nextInt();
        maxNum(n, arr, num);
    }

    private static void maxNum(int n, int[] arr, int num) {
        int ans=num;
        for (int i = 0; i < n; i++) {
            if(arr[i]==ans){
                ans*=2;
            }

        }
        System.out.println(ans);
    }
}
