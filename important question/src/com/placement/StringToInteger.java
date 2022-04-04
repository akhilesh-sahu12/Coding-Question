package com.placement;

public class StringToInteger {
    public static void main(String[] args) {
        String num="1234";
        //parseInt method of Integer class
        int n=Integer.parseInt(num);
        System.out.println(n);
        int sum=0;
        while (n>0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        System.out.println(sum);
    }
}
