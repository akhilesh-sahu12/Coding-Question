package com.placement;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=37;
        boolean arr[]=new boolean[n+1];
        sievePrime(n,arr);

    }
     // n/2+n/3+n/5+n/7.....
    // n(1/2+1/3+1/5+1/7.....)
    // n* log(log n)
    private static void sievePrime(int n, boolean[] arr) {
        for (int i = 2; i*i<=n; i++) {
            if(!arr[i]){
                for (int j = 2*i; j<=n; j+=i) {
                    arr[j]=true;
                }
            }
        }
        for (int i = 2; i<=n; i++) {
            if(!arr[i]){
                System.out.print(i+" ");
            }

        }
    }
}
