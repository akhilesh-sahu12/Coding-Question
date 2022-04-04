package com.Series;

import java.util.Scanner;

public class NumberSeries {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        series(n);
    }
    static void series(int n) {
        if (n % 2 == 0)// 0 275 550 825 1100
        {
            n = n / 2;
            n = 275*(n - 1);
            System.out.println(n);
        }
        else {  // 0 550 1100 1650
            n = n / 2 + 1;
            n = 550 * (n - 1);
            System.out.println(n);
        }

    }

}
