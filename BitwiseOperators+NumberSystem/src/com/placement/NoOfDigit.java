package com.placement;

public class NoOfDigit {
    public static void main(String[] args) {
        int n=948779876;
        //int b=10;//no. of digit of decimal number
        int b=2;//no. of digit of binary number
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
