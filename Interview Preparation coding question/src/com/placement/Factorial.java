package com.placement;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        long start=System.currentTimeMillis();
       // int res=facti(n);

        int res=fact(n,dp);
        System.out.println(res);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(Arrays.toString(dp));
    }
    static int fact(int n, int[] dp) {
        if (n <= 1)
            return dp[n] = 1;
        if (dp[n] != 0) {
            return dp[n];
        }
        return dp[n]=n*fact(n-1,dp);
    }

     static int facti(int n) {
        if(n<=1)
            return 1;
        return n*facti(n-1);
    }
}
