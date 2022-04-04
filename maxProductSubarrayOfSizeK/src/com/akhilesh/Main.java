package com.akhilesh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxProduct(arr, n, k);
    }

    private static void maxProduct(int[] arr, int n, int k) {
        int res = 1;
        for (int i = 0; i < arr.length-k; i++) {
            int curr=1;
            for (int j = i; j < arr.length-k-1; j++) {
                boolean flag=true;
                int l=j+1;
                int s=k;
                while (flag && s>0){
                    curr=curr*arr[j];
                    j++;
                }
                flag=false;
                res = Math.max(res, curr);
                curr=(curr*arr[j])-arr[l];
                l++;
                System.out.println(res);
            }
        }
        System.out.println(res);

    }
}
