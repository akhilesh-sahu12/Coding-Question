package com.placement;

public class GeekWeek {
    public static void main(String[] args) {
        int n=fun(12)%26;
        System.out.println((char)(n+'A'));
    }

    private static int fun(int n) {
        if(n<=2)
            return n;
        return fun(n-1)+fun(n-2);
    }
}
