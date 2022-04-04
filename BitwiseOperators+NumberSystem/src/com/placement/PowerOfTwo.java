package com.placement;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n=64;// fix n=0 return false
        boolean ans=(n&(n-1))==0;
        System.out.println(ans);
    }
}
