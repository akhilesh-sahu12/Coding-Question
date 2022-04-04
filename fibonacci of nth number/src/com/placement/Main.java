package com.placement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        for (int i = 0; i <=50; i++) {
            System.out.println(fib(i));
        }
    }

    private static int fib(int n) {
       // return (int)((Math.pow(((1+Math.sqrt(5))/2),n))/Math.sqrt(5)); //Wrong
        return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
