package com.placement;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveCallOfFibonacciSeriesWithDynamicProgramming {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        System.out.println(fib(n ,dp));// 55
        System.out.println(Arrays.toString(dp));//[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]

    }

    private static int fib(int n, int[] dp) {
        if(n<=1) {
            return dp[n]= n;
        }
        if(dp[n]!=0) {
            return dp[n];
        }
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);

    }
}
