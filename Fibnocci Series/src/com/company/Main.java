package com.company;

import java.util.*;

public class Main {

    public static int fibnocci(int n) {
       // int a = 0, b = 1, c;
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        return (fibnocci(n - 1) + fibnocci(n - 2));
    /*  a=fibnocci(n-1);
    b=fibnocci(n-2);
    c=a+b;
    return c;
   */}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// 11-> 0 1 1 2 3  5 8 13 21 34 55 89
        int result=fibnocci(n);
        System.out.println(result);
    }
}
